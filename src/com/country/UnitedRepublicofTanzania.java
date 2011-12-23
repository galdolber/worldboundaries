package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class UnitedRepublicofTanzania {

  public static boolean test(Point p) {
    if ((p.getX() >= 39.590827999999995 && p.getY() >= -7.996944999999982 && p.getX() <= 39.90999600000004 && p.getY() <= -7.638888999999949) || (p.getX() >= 39.18638600000003 && p.getY() >= -6.470555999999988 && p.getX() <= 39.574997 && p.getY() <= -5.723055999999985) || (p.getX() >= 39.63999899999999 && p.getY() >= -5.464167999999916 && p.getX() <= 39.87305500000008 && p.getY() <= -4.901112000000012) || (p.getX() >= 29.340832000000034 && p.getY() >= -11.740834999999947 && p.getX() <= 40.436813000000086 && p.getY() <= -0.997221999999965)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/UnitedRepublicofTanzania.data"));
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
