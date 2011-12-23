package com.world;

import com.google.common.io.Files;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.io.ParseException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Export {

  public static void main(String[] args) throws IOException, SQLException, ParseException {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (Exception e) {
      System.err.println("Unable to find and load driver");
      System.exit(1);
    }

    Connection connection =
        DriverManager.getConnection("jdbc:mysql://localhost/world_boundaries?user=root&password=");

    Statement statement = connection.createStatement();

    new File("./src/com/country/").mkdirs();

    File d = new File("./src/com/country/CountryDecoder.java");
    d.createNewFile();
    FileWriter doutFile = new FileWriter(d);
    PrintWriter decoder = new PrintWriter(doutFile);

    decoder.println("package com.country;");
    decoder.println();

    decoder.println("import " + Point.class.getCanonicalName() + ";");
    decoder.println("import com.vividsolutions.jts.geom.Coordinate;");
    decoder.println("import com.vividsolutions.jts.geom.GeometryFactory;");
    decoder.println();

    decoder.println("public class CountryDecoder {");
    decoder.println();

    decoder.println("  public static String decode(double latitude, double longitude) {");
    decoder
        .println("    Point p = new GeometryFactory().createPoint(new Coordinate(longitude, latitude));");

    ResultSet rs = statement.executeQuery("SELECT * FROM world_boundaries");
    while (rs.next()) {
      byte[] o = (byte[]) rs.getObject("ogc_geom");
      String name = rs.getString("name");
      String className = name.replaceAll("[ -(),'\\?]", "");
      className = className.replaceAll("[-]", "");

      Files.write(o, new File("./src/com/country/" + className + ".data"));

      decoder.println("    if (" + className + ".test(p)) return \"" + name + "\";");

      File f = new File("./src/com/country/" + className + ".java");
      f.createNewFile();
      FileWriter outFile = new FileWriter(f);
      PrintWriter out = new PrintWriter(outFile);

      out.println("package com.country;");
      out.println();

      out.println("import com.google.common.io.ByteStreams;");
      out.println("import " + Point.class.getCanonicalName() + ";");
      out.println("import com.vividsolutions.jts.geom.Geometry;");
      out.println("import com.world.Util;");
      out.println("import java.io.IOException;");
      out.println();

      out.println("public class " + className + " {");
      MultiPolygon geo = (MultiPolygon) Util.convert(o);

      StringBuilder test = new StringBuilder();
      for (int i = 0; i < geo.getNumGeometries(); i++) {
        com.vividsolutions.jts.geom.Polygon polygon = (Polygon) geo.getGeometryN(i);

        double minx = 0;
        double miny = 0;
        double maxx = 0;
        double maxy = 0;

        Coordinate[] coords = polygon.getCoordinates();
        for (int j = 0; j < coords.length; j++) {
          Coordinate point = coords[j];
          if (point.x < minx || minx == 0) {
            minx = point.x;
          }
          if (point.y < miny || miny == 0) {
            miny = point.y;
          }
          if (point.x > maxx || maxx == 0) {
            maxx = point.x;
          }
          if (point.y > maxy || maxy == 0) {
            maxy = point.y;
          }
        }
        if (test.length() > 0) {
          test.append(" || ");
        }

        test.append("(p.getX() >= " + minx + " && p.getY() >= " + miny + " && p.getX() <= " + maxx
            + " && p.getY() <= " + maxy + ")");
      }

      out.println();
      out.println("  public static boolean test(Point p) {");
      out.println("    if (" + test.toString() + ") {");
      out.println("      byte[] data;");
      out.println("      try {");
      out.println("        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream(\"com/country/"
          + className + ".data\"));");
      out.println("      } catch (IOException e) {");
      out.println("        throw new RuntimeException(e);");
      out.println("      }");
      out.println("      Geometry geo = Util.convert(data);");
      out.println("      for (int i = 0; i < geo.getNumGeometries(); i++) {");
      out.println("        if (geo.getGeometryN(i).contains(p)) {");
      out.println("          return true;");
      out.println("        }");
      out.println("      }");
      out.println("    }");
      out.println("    return false;");
      out.println("  }");
      out.println("}");

      out.close();
      outFile.close();
    }
    decoder.println("    return null;");
    decoder.println("  }");
    decoder.println("}");
    decoder.close();
    doutFile.close();
  }
}
