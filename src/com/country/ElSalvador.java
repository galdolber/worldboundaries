package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class ElSalvador {

  public static boolean test(Point p) {
    if ((p.getX() >= -87.72834799999998 && p.getY() >= 13.164444000000003 && p.getX() <= -87.68472299999996 && p.getY() <= 13.216664999999978) || (p.getX() >= -90.108337 && p.getY() >= 13.156386999999995 && p.getX() <= -87.6946719999999 && p.getY() <= 14.431982000000062)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/ElSalvador.data"));
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
