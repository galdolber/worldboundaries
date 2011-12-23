package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SaintHelena {

  public static boolean test(Point p) {
    if ((p.getX() >= -10.041388999999924 && p.getY() >= -40.403892999999925 && p.getX() <= -9.892223 && p.getY() <= -40.30500000000001) || (p.getX() >= -12.331666999999925 && p.getY() >= -37.15555599999999 && p.getX() <= -12.193610999999976 && p.getY() <= -37.052505) || (p.getX() >= -5.793055999999979 && p.getY() >= -16.023334999999918 && p.getX() <= -5.645277999999962 && p.getY() <= -15.903056999999931) || (p.getX() >= -14.41611299999994 && p.getY() >= -7.984087999999986 && p.getX() <= -14.29305599999998 && p.getY() <= -7.88305600000001)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SaintHelena.data"));
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
