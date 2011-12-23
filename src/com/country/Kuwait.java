package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Kuwait {

  public static boolean test(Point p) {
    if ((p.getX() >= 48.26693000000006 && p.getY() >= 29.39444000000003 && p.getX() <= 48.39526400000011 && p.getY() <= 29.470832999999967) || (p.getX() >= 48.07998700000013 && p.getY() >= 29.59444000000008 && p.getX() <= 48.35999300000015 && p.getY() <= 29.99277500000011) || (p.getX() >= 48.00860600000004 && p.getY() >= 29.964165000000094 && p.getX() <= 48.114159000000086 && p.getY() <= 30.026108000000136) || (p.getX() >= 46.546944000000046 && p.getY() >= 28.538883 && p.getX() <= 48.41658799999999 && p.getY() <= 30.084438000000038)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Kuwait.data"));
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      Geometry geo = Util.convert(data);
      for (int i = 0; i < geo.getNumGeometries(); i++) {
        if (geo.getGeometryN(i).contains(p)) {
          return true;
        }
      }
    }
    return false;
  }
}
