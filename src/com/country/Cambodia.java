package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Cambodia {

  public static boolean test(Point p) {
    if ((p.getX() >= 103.74858100000003 && p.getY() >= 10.442221000000018 && p.getX() <= 103.803017 && p.getY() <= 10.514999000000046) || (p.getX() >= 103.19331400000003 && p.getY() >= 10.66972000000004 && p.getX() <= 103.315811 && p.getY() <= 10.779444000000012) || (p.getX() >= 102.97802700000013 && p.getY() >= 11.245552000000032 && p.getX() <= 103.04830899999997 && p.getY() <= 11.422219999999982) || (p.getX() >= 102.99550599999996 && p.getY() >= 11.424720999999977 && p.getX() <= 103.04635600000006 && p.getY() <= 11.525000000000093) || (p.getX() >= 102.34554300000013 && p.getY() >= 10.422738999999922 && p.getX() <= 107.63638300000008 && p.getY() <= 14.708618)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Cambodia.data"));
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
