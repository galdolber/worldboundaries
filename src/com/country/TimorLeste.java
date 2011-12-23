package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class TimorLeste {

  public static boolean test(Point p) {
    if ((p.getX() >= 124.0461611661691 && p.getY() >= -9.463379556533424 && p.getX() <= 124.44572729730146 && p.getY() <= -9.184801455158606) || (p.getX() >= 124.94544874451071 && p.getY() >= -9.435955217796277 && p.getX() <= 127.30859400000008 && p.getY() <= -8.324443999999971)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/TimorLeste.data"));
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
