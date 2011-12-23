package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Azerbaijan {

  public static boolean test(Point p) {
    if ((p.getX() >= 44.778862 && p.getY() >= 38.841147999999976 && p.getX() <= 46.17824600000012 && p.getY() <= 39.779984000000006) || (p.getX() >= 45.194988000000016 && p.getY() >= 40.96915100000013 && p.getX() <= 45.24527000000012 && p.getY() <= 41.00471099999999) || (p.getX() >= 44.980549000000046 && p.getY() >= 41.030548000000074 && p.getX() <= 45.05887999999993 && p.getY() <= 41.0891610000001) || (p.getX() >= 45.02294200000006 && p.getY() >= 38.38915300000008 && p.getX() <= 50.37499199999996 && p.getY() <= 41.89705700000002)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Azerbaijan.data"));
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
