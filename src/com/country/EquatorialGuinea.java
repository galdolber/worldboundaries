package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class EquatorialGuinea {

  public static boolean test(Point p) {
    if ((p.getX() >= 5.615276999999992 && p.getY() >= -1.479444999999998 && p.getX() <= 5.647499000000096 && p.getY() <= -1.420555999999976) || (p.getX() >= 9.356943 && p.getY() >= 0.926065999999992 && p.getX() <= 11.353887999999928 && p.getY() <= 2.343698000000074) || (p.getX() >= 8.424166000000127 && p.getY() >= 3.196389000000124 && p.getX() <= 8.962221000000113 && p.getY() <= 3.763332999999932)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/EquatorialGuinea.data"));
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
