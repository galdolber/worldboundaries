package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Colombia {

  public static boolean test(Point p) {
    if ((p.getX() >= -78.55528300000003 && p.getY() >= 2.406111000000067 && p.getX() <= -78.54333499999996 && p.getY() <= 2.433333000000005) || (p.getX() >= -78.21556099999992 && p.getY() >= 2.499443999999983 && p.getX() <= -78.09167500000001 && p.getY() <= 2.64861099999996) || (p.getX() >= -78.046402 && p.getY() >= 2.539166000000137 && p.getX() <= -77.94833399999993 && p.getY() <= 2.651944000000071) || (p.getX() >= -77.92111199999998 && p.getY() >= 2.573333000000048 && p.getX() <= -77.78611799999993 && p.getY() <= 2.697499999999934) || (p.getX() >= -77.885559 && p.getY() >= 2.589166999999918 && p.getX() <= -77.74751299999998 && p.getY() <= 2.720555000000047) || (p.getX() >= -77.66278099999998 && p.getY() >= 3.060554999999965 && p.getX() <= -77.52417000000001 && p.getY() <= 3.209444000000076) || (p.getX() >= -77.536118 && p.getY() >= 4.059165999999948 && p.getX() <= -77.441956 && p.getY() <= 4.204165999999987) || (p.getX() >= -77.55334499999998 && p.getY() >= 4.193332999999996 && p.getX() <= -77.31973299999994 && p.getY() <= 4.334722000000056) || (p.getX() >= -79.05334499999998 && p.getY() >= -4.236873999999943 && p.getX() <= -66.87188700000002 && p.getY() <= 12.463887999999995) || (p.getX() >= -81.72277799999993 && p.getY() >= 12.490276000000051 && p.getX() <= -81.68000799999999 && p.getY() <= 12.591110000000072) || (p.getX() >= -81.38944999999995 && p.getY() >= 13.319166000000052 && p.getX() <= -81.34638999999994 && p.getY() <= 13.378611000000037)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Colombia.data"));
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
