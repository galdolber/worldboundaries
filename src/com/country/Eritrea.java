package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Eritrea {

  public static boolean test(Point p) {
    if ((p.getX() >= 39.92138699999998 && p.getY() >= 15.572776999999974 && p.getX() <= 40.419441000000006 && p.getY() <= 15.886664999999937) || (p.getX() >= 39.97943900000013 && p.getY() >= 15.986944000000053 && p.getX() <= 40.114441 && p.getY() <= 16.095554000000106) || (p.getX() >= 36.44328300000012 && p.getY() >= 12.363888000000088 && p.getX() <= 43.12138400000009 && p.getY() <= 17.99488100000002)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Eritrea.data"));
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
