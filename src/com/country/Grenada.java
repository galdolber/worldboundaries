package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Grenada {

  public static boolean test(Point p) {
    if ((p.getX() >= -61.78972599999992 && p.getY() >= 11.996387000000029 && p.getX() <= -61.59638999999993 && p.getY() <= 12.237777999999992) || (p.getX() >= -61.58917200000002 && p.getY() >= 12.294442999999944 && p.getX() <= -61.572227 && p.getY() <= 12.323055000000013) || (p.getX() >= -61.496947999999975 && p.getY() >= 12.434999000000005 && p.getX() <= -61.41861699999998 && p.getY() <= 12.529165000000036)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Grenada.data"));
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
