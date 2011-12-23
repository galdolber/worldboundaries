package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class CostaRica {

  public static boolean test(Point p) {
    if ((p.getX() >= -85.198059 && p.getY() >= 10.070833000000109 && p.getX() <= -85.09722899999997 && p.getY() <= 10.122498999999948) || (p.getX() >= -85.91139199999992 && p.getY() >= 8.025668999999994 && p.getX() <= -82.56140099999993 && p.getY() <= 11.213610000000015)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/CostaRica.data"));
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
