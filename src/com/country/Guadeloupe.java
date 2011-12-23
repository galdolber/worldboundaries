package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Guadeloupe {

  public static boolean test(Point p) {
    if ((p.getX() >= -61.329726999999934 && p.getY() >= 15.869999000000009 && p.getX() <= -61.18639400000001 && p.getY() <= 16.01499899999999) || (p.getX() >= -61.087783999999935 && p.getY() >= 16.295555000000036 && p.getX() <= -60.98861699999992 && p.getY() <= 16.350277000000006) || (p.getX() >= -61.79611199999994 && p.getY() >= 15.946387999999956 && p.getX() <= -61.20555899999994 && p.getY() <= 16.514164000000108) || (p.getX() >= -62.87306199999994 && p.getY() >= 17.878330000000005 && p.getX() <= -62.78945199999998 && p.getY() <= 17.93027500000005)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Guadeloupe.data"));
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
