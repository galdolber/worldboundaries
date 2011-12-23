package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Gabon {

  public static boolean test(Point p) {
    if ((p.getX() >= 8.946664999999939 && p.getY() >= -0.768888999999945 && p.getX() <= 9.046665000000075 && p.getY() <= -0.598888999999929) || (p.getX() >= 9.5380550000001 && p.getY() >= 0.267222000000004 && p.getX() <= 9.554442999999935 && p.getY() <= 0.285000000000139) || (p.getX() >= 8.698332000000107 && p.getY() >= -3.925276999999994 && p.getX() <= 14.520555000000115 && p.getY() <= 2.317898000000014)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Gabon.data"));
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
