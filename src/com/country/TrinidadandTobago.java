package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class TrinidadandTobago {

  public static boolean test(Point p) {
    if ((p.getX() >= -61.92444599999999 && p.getY() >= 10.037498000000085 && p.getX() <= -60.90778399999999 && p.getY() <= 10.841943999999955) || (p.getX() >= -60.84833500000001 && p.getY() >= 11.1416660000001 && p.getX() <= -60.52056099999993 && p.getY() <= 11.346109000000068)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/TrinidadandTobago.data"));
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
