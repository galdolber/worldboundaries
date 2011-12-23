package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SaoTomeandPrincipe {

  public static boolean test(Point p) {
    if ((p.getX() >= 6.464444000000128 && p.getY() >= 0.018332999999984 && p.getX() <= 6.766665999999987 && p.getY() <= 0.409167000000025) || (p.getX() >= 7.327222000000063 && p.getY() >= 1.530554999999993 && p.getX() <= 7.464166999999918 && p.getY() <= 1.70194400000014)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SaoTomeandPrincipe.data"));
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
