package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SouthAfrica {

  public static boolean test(Point p) {
    if ((p.getX() >= 37.575554000000125 && p.getY() >= -46.96972699999998 && p.getX() <= 37.89360800000002 && p.getY() <= -46.82361599999996) || (p.getX() >= 37.85611 && p.getY() >= -46.65888999999993 && p.getX() <= 37.98166700000013 && p.getY() <= -46.59638999999999) || (p.getX() >= 16.48333000000008 && p.getY() >= -34.822002 && p.getX() <= 32.89042699999999 && p.getY() <= -22.136391000000003)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SouthAfrica.data"));
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
