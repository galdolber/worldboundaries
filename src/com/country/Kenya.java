package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Kenya {

  public static boolean test(Point p) {
    if ((p.getX() >= 40.949440000000095 && p.getY() >= -2.203056000000004 && p.getX() <= 41.169441000000006 && p.getY() <= -2.037500000000023) || (p.getX() >= 33.907219000000055 && p.getY() >= -4.669617999999957 && p.getX() <= 41.90516700000012 && p.getY() <= 4.622499000000005)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Kenya.data"));
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
