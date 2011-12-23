package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Haiti {

  public static boolean test(Point p) {
    if ((p.getX() >= -73.70750399999997 && p.getY() >= 18.056109999999933 && p.getX() <= -73.57640100000003 && p.getY() <= 18.10472100000004) || (p.getX() >= -73.79972800000002 && p.getY() >= 18.581386999999953 && p.getX() <= -73.70611599999995 && p.getY() <= 18.63777499999992) || (p.getX() >= -73.300003 && p.getY() >= 18.69555299999996 && p.getX() <= -72.79945399999998 && p.getY() <= 18.969997000000035) || (p.getX() >= -74.46778899999998 && p.getY() >= 18.022778000000017 && p.getX() <= -71.62889100000001 && p.getY() <= 19.94277599999998) || (p.getX() >= -72.95638999999994 && p.getY() >= 19.985275000000055 && p.getX() <= -72.62139899999994 && p.getY() <= 20.09222)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Haiti.data"));
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
