package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Angola {

  public static boolean test(Point p) {
    if ((p.getX() >= 11.663332000000082 && p.getY() >= -16.80472599999996 && p.getX() <= 11.775000000000034 && p.getY() <= -16.535278000000005) || (p.getX() >= 11.731110000000117 && p.getY() >= -18.016392 && p.getX() <= 24.084442000000134 && p.getY() <= -5.835833999999977) || (p.getX() >= 12.017221000000063 && p.getY() >= -5.768555999999933 && p.getX() <= 13.092777000000067 && p.getY() <= -4.388990999999976)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Angola.data"));
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
