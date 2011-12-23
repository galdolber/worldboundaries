package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Palestine {

  public static boolean test(Point p) {
    if ((p.getX() >= 34.21665999999999 && p.getY() >= 31.216540999999953 && p.getX() <= 34.55916600000012 && p.getY() <= 31.596096000000102) || (p.getX() >= 34.884438000000046 && p.getY() >= 31.349998000000085 && p.getX() <= 35.57329600000003 && p.getY() <= 32.546387000000095)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Palestine.data"));
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
