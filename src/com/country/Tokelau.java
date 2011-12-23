package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Tokelau {

  public static boolean test(Point p) {
    if ((p.getX() >= -171.23055999999994 && p.getY() >= -9.381110999999976 && p.getX() <= -171.21142599999996 && p.getY() <= -9.345555999999988) || (p.getX() >= -171.86474599999994 && p.getY() >= -9.21888899999999 && p.getX() <= -171.84307899999996 && p.getY() <= -9.168057999999917) || (p.getX() >= -172.50033599999995 && p.getY() >= -8.587499999999977 && p.getX() <= -172.48193399999997 && p.getY() <= -8.553613999999925)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Tokelau.data"));
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
