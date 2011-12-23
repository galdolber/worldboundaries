package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Mauritius {

  public static boolean test(Point p) {
    if ((p.getX() >= 57.30471800000009 && p.getY() >= -20.52055699999994 && p.getX() <= 57.79582999999997 && p.getY() <= -19.984726000000023) || (p.getX() >= 63.328606000000086 && p.getY() >= -19.766669999999976 && p.getX() <= 63.49860400000006 && p.getY() <= -19.673058000000022) || (p.getX() >= 56.50721699999997 && p.getY() >= -10.398613000000012 && p.getX() <= 56.565277000000094 && p.getY() <= -10.316667999999993)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Mauritius.data"));
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
