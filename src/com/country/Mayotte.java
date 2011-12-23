package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Mayotte {

  public static boolean test(Point p) {
    if ((p.getX() >= 45.262497 && p.getY() >= -12.805000000000009 && p.getX() <= 45.29332700000003 && p.getY() <= -12.747500999999945) || (p.getX() >= 45.03916200000003 && p.getY() >= -12.992500000000009 && p.getX() <= 45.23026999999996 && p.getY() <= -12.662499999999966)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Mayotte.data"));
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
