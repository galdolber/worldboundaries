package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Honduras {

  public static boolean test(Point p) {
    if ((p.getX() >= -87.67001299999993 && p.getY() >= 13.246111000000042 && p.getX() <= -87.61000100000001 && p.getY() <= 13.29694400000011) || (p.getX() >= -87.65834000000001 && p.getY() >= 13.302775999999994 && p.getX() <= -87.56722999999994 && p.getY() <= 13.372499000000005) || (p.getX() >= -89.35195899999991 && p.getY() >= 12.97972100000004 && p.getX() <= -83.13185099999998 && p.getY() <= 16.025833000000034) || (p.getX() >= -86.991669 && p.getY() >= 16.069443000000035 && p.getX() <= -86.87028499999997 && p.getY() <= 16.121666000000005) || (p.getX() >= -86.63528400000001 && p.getY() >= 16.270275000000026 && p.getX() <= -86.26333599999992 && p.getY() <= 16.436386000000084) || (p.getX() >= -85.95529199999993 && p.getY() >= 16.40833299999997 && p.getX() <= -85.83473199999997 && p.getY() <= 16.506664) || (p.getX() >= -83.95889299999993 && p.getY() >= 17.40527700000007 && p.getX() <= -83.94306899999992 && p.getY() <= 17.41777400000001) || (p.getX() >= -83.92639200000002 && p.getY() >= 17.40833299999997 && p.getX() <= -83.9077909999999 && p.getY() <= 17.420277)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Honduras.data"));
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
