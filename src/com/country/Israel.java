package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Israel {

  public static boolean test(Point p) {
    if ((p.getX() >= 35.243607000000054 && p.getY() >= 31.786387999999988 && p.getX() <= 35.26361099999997 && p.getY() <= 31.80888700000014) || (p.getX() >= 34.26757800000013 && p.getY() >= 29.486706000000083 && p.getX() <= 35.68305200000003 && p.getY() <= 33.27027100000004)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Israel.data"));
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
