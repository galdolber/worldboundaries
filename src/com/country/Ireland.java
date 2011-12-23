package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Ireland {

  public static boolean test(Point p) {
    if ((p.getX() >= -9.72555699999998 && p.getY() >= 53.221382000000006 && p.getX() <= -9.641944999999964 && p.getY() <= 53.28194400000001) || (p.getX() >= -10.26861200000002 && p.getY() >= 53.87583200000006 && p.getX() <= -9.923888999999974 && p.getY() <= 54.02249899999998) || (p.getX() >= -8.454723000000001 && p.getY() >= 54.94388600000013 && p.getX() <= -8.435000999999943 && p.getY() <= 54.95777100000004) || (p.getX() >= -8.564444999999921 && p.getY() >= 54.963882000000126 && p.getX() <= -8.484445999999991 && p.getY() <= 55.01583099999999) || (p.getX() >= -10.47472399999998 && p.getY() >= 51.445549000000085 && p.getX() <= -6.013056000000006 && p.getY() <= 55.380272000000105)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Ireland.data"));
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
