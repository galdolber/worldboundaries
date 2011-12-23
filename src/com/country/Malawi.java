package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Malawi {

  public static boolean test(Point p) {
    if ((p.getX() >= 34.70471999999995 && p.getY() >= -12.096389999999928 && p.getX() <= 34.754714999999976 && p.getY() <= -12.031946000000003) || (p.getX() >= 34.60277600000012 && p.getY() >= -12.03722399999998 && p.getX() <= 34.631386000000134 && p.getY() <= -12.003055999999958) || (p.getX() >= 32.67888599999998 && p.getY() >= -17.13528100000002 && p.getX() <= 35.92416400000013 && p.getY() <= -9.373334999999996)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Malawi.data"));
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
