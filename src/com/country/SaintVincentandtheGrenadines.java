package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SaintVincentandtheGrenadines {

  public static boolean test(Point p) {
    if ((p.getX() >= -61.45416999999992 && p.getY() >= 12.584444000000076 && p.getX() <= -61.40306099999992 && p.getY() <= 12.612499000000014) || (p.getX() >= -61.347778000000005 && p.getY() >= 12.686666000000002 && p.getX() <= -61.30500000000001 && p.getY() <= 12.737499000000073) || (p.getX() >= -61.252228 && p.getY() >= 12.974998000000085 && p.getX() <= -61.197226999999934 && p.getY() <= 13.04472199999998) || (p.getX() >= -61.28139499999992 && p.getY() >= 13.130277999999976 && p.getX() <= -61.12028500000002 && p.getY() <= 13.384164999999996)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SaintVincentandtheGrenadines.data"));
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
