package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SaintPierreandMiquelon {

  public static boolean test(Point p) {
    if ((p.getX() >= -56.23722099999992 && p.getY() >= 46.74721499999998 && p.getX() <= -56.144164999999994 && p.getY() <= 46.81054700000004) || (p.getX() >= -56.398056 && p.getY() >= 46.778327999999995 && p.getX() <= -56.23194099999994 && p.getY() <= 47.136658000000075)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SaintPierreandMiquelon.data"));
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
