package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Guyana {

  public static boolean test(Point p) {
    if ((p.getX() >= -58.46556099999992 && p.getY() >= 6.881666000000052 && p.getX() <= -58.328056 && p.getY() <= 6.971666000000027) || (p.getX() >= -61.389725 && p.getY() >= 1.185555000000079 && p.getX() <= -56.47063399999996 && p.getY() <= 8.53527600000001)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Guyana.data"));
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
