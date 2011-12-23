package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Turkmenistan {

  public static boolean test(Point p) {
    if ((p.getX() >= 53.02193500000004 && p.getY() >= 38.75110600000005 && p.getX() <= 53.09999799999997 && p.getY() <= 39.093880000000006) || (p.getX() >= 52.440071000000096 && p.getY() >= 35.14166300000005 && p.getX() <= 66.67248500000005 && p.getY() <= 42.79777500000012)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Turkmenistan.data"));
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
