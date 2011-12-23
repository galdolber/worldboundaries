package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class NetherlandsAntilles {

  public static boolean test(Point p) {
    if ((p.getX() >= -68.41694599999994 && p.getY() >= 12.020555000000058 && p.getX() <= -68.19277999999991 && p.getY() <= 12.307499000000009) || (p.getX() >= -69.16361999999992 && p.getY() >= 12.040277000000115 && p.getX() <= -68.74694799999997 && p.getY() <= 12.383888000000011) || (p.getX() >= -62.998062 && p.getY() >= 17.458054000000004 && p.getX() <= -62.93639400000001 && p.getY() <= 17.521942000000024)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/NetherlandsAntilles.data"));
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
