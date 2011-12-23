package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Liechtenstein {

  public static boolean test(Point p) {
    if ((p.getX() >= 9.474637 && p.getY() >= 47.057457 && p.getX() <= 9.63611 && p.getY() <= 47.274544)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Liechtenstein.data"));
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
