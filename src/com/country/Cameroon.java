package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Cameroon {

  public static boolean test(Point p) {
    if ((p.getX() >= 9.624998000000062 && p.getY() >= 3.551111000000105 && p.getX() <= 9.69500000000005 && p.getY() <= 3.583888999999999) || (p.getX() >= 8.502222000000017 && p.getY() >= 1.654166000000089 && p.getX() <= 16.207222 && p.getY() <= 13.085278000000072)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Cameroon.data"));
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
