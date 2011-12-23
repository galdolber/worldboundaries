package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Tunisia {

  public static boolean test(Point p) {
    if ((p.getX() >= 10.713887999999995 && p.getY() >= 33.638611000000026 && p.getX() <= 11.057219999999916 && p.getY() <= 33.89611100000008) || (p.getX() >= 10.96083299999998 && p.getY() >= 34.61749300000014 && p.getX() <= 11.06472199999996 && p.getY() <= 34.66916700000013) || (p.getX() >= 11.114166000000068 && p.getY() >= 34.66861000000006 && p.getX() <= 11.302220999999976 && p.getY() <= 34.82360800000004) || (p.getX() >= 10.79083300000002 && p.getY() >= 37.11805000000004 && p.getX() <= 10.814722000000016 && p.getY() <= 37.13027200000005) || (p.getX() >= 7.491666000000066 && p.getY() >= 30.234390000000133 && p.getX() <= 11.583331999999928 && p.getY() <= 37.34055300000006) || (p.getX() >= 8.894999000000098 && p.getY() >= 37.508331 && p.getX() <= 8.947776999999974 && p.getY() <= 37.539444)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Tunisia.data"));
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
