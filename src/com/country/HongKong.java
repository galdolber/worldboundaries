package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class HongKong {

  public static boolean test(Point p) {
    if ((p.getX() >= 114.122208 && p.getY() >= 22.200829000000056 && p.getX() <= 114.24887100000012 && p.getY() <= 22.291664000000026) || (p.getX() >= 113.822769 && p.getY() >= 22.1936070000001 && p.getX() <= 114.0502620000001 && p.getY() <= 22.34027500000008) || (p.getX() >= 114.29414400000007 && p.getY() >= 22.339718000000005 && p.getX() <= 114.31553600000007 && p.getY() <= 22.36805300000003) || (p.getX() >= 113.895264 && p.getY() >= 22.260561 && p.getX() <= 114.39026600000012 && p.getY() <= 22.550548246897048)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/HongKong.data"));
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
