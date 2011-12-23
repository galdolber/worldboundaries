package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Nicaragua {

  public static boolean test(Point p) {
    if ((p.getX() >= -83.73222399999997 && p.getY() >= 11.868332000000008 && p.getX() <= -83.707245 && p.getY() <= 11.988053999999975) || (p.getX() >= -83.05917399999998 && p.getY() >= 12.14388800000006 && p.getX() <= -83.01972999999998 && p.getY() <= 12.188889000000016) || (p.getX() >= -82.98667899999992 && p.getY() >= 12.286110000000065 && p.getX() <= -82.96362299999998 && p.getY() <= 12.31555400000002) || (p.getX() >= -82.78973399999995 && p.getY() >= 14.353053999999986 && p.getX() <= -82.72138999999994 && p.getY() <= 14.418888000000097) || (p.getX() >= -87.69306899999998 && p.getY() >= 10.70861100000002 && p.getX() <= -83.13185099999998 && p.getY() <= 15.022221000000002)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Nicaragua.data"));
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
