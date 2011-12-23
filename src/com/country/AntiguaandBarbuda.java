package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class AntiguaandBarbuda {

  public static boolean test(Point p) {
    if ((p.getX() >= -61.89111299999996 && p.getY() >= 16.98971899999998 && p.getX() <= -61.66638899999998 && p.getY() <= 17.167220999999984) || (p.getX() >= -61.87528199999997 && p.getY() >= 17.5405540000001 && p.getX() <= -61.72917199999994 && p.getY() <= 17.724998000000028)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/AntiguaandBarbuda.data"));
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
