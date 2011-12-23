package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class DominicanRepublic {

  public static boolean test(Point p) {
    if ((p.getX() >= -71.54305999999991 && p.getY() >= 17.540276000000006 && p.getX() <= -71.46305799999993 && p.getY() <= 17.61610800000011) || (p.getX() >= -68.78500399999996 && p.getY() >= 18.101665000000136 && p.getX() <= -68.56806899999998 && p.getY() <= 18.199164999999997) || (p.getX() >= -72.00306699999999 && p.getY() >= 17.601944000000003 && p.getX() <= -68.32223499999992 && p.getY() <= 19.931110000000047)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/DominicanRepublic.data"));
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
