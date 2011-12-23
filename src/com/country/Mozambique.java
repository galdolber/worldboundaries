package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Mozambique {

  public static boolean test(Point p) {
    if ((p.getX() >= 32.89527100000004 && p.getY() >= -26.061110999999983 && p.getX() <= 32.98305499999998 && p.getY() <= -25.972778000000005) || (p.getX() >= 35.42277500000006 && p.getY() >= -21.787502000000018 && p.getX() <= 35.497498000000064 && p.getY() <= -21.523890999999992) || (p.getX() >= 39.810272 && p.getY() >= -16.417778 && p.getX() <= 39.914993000000095 && p.getY() <= -16.272780999999952) || (p.getX() >= 30.213017000000093 && p.getY() >= -26.86027899999999 && p.getX() <= 40.84610700000008 && p.getY() <= -10.471111000000008)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Mozambique.data"));
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
