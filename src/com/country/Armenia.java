package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Armenia {

  public static boolean test(Point p) {
    if ((p.getX() >= 45.491940000000056 && p.getY() >= 40.60609800000003 && p.getX() <= 45.58832900000005 && p.getY() <= 40.66553900000002) || (p.getX() >= 43.45388800000006 && p.getY() >= 38.841147999999976 && p.getX() <= 46.62248999999997 && p.getY() <= 41.29705000000013)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Armenia.data"));
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
