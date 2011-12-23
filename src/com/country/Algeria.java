package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Algeria {

  public static boolean test(Point p) {
    if ((p.getX() >= -8.667223 && p.getY() >= 18.976387 && p.getX() <= 11.986475 && p.getY() <= 37.091385)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Algeria.data"));
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
