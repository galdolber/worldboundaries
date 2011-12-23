package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class PuertoRico {

  public static boolean test(Point p) {
    if ((p.getX() >= -67.93833899999998 && p.getY() >= 18.047496999999964 && p.getX() <= -67.84028599999999 && p.getY() <= 18.114441000000117) || (p.getX() >= -65.58029199999999 && p.getY() >= 18.083054000000004 && p.getX() <= -65.30111699999998 && p.getY() <= 18.164996999999968) || (p.getX() >= -65.33889799999997 && p.getY() >= 18.27694299999996 && p.getX() <= -65.24195900000001 && p.getY() <= 18.348052999999997) || (p.getX() >= -67.26667800000001 && p.getY() >= 17.92222200000009 && p.getX() <= -65.602509 && p.getY() <= 18.51944400000013)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/PuertoRico.data"));
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
