package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Sudan {

  public static boolean test(Point p) {
    if ((p.getX() >= 37.24221800000004 && p.getY() >= 20.745831000000067 && p.getX() <= 37.28443900000001 && p.getY() <= 20.84972400000009) || (p.getX() >= 21.827774000000037 && p.getY() >= 3.493394000000137 && p.getX() <= 38.607498000000135 && p.getY() <= 22.232219999999984)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Sudan.data"));
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
