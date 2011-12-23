package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Malta {

  public static boolean test(Point p) {
    if ((p.getX() >= 14.324999000000048 && p.getY() >= 35.79999500000008 && p.getX() <= 14.57000000000005 && p.getY() <= 35.99249300000008) || (p.getX() >= 14.180832000000008 && p.getY() >= 36.01138300000008 && p.getX() <= 14.341110000000072 && p.getY() <= 36.074997)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Malta.data"));
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
