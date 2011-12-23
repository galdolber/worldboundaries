package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Madagascar {

  public static boolean test(Point p) {
    if ((p.getX() >= 49.817214999999976 && p.getY() >= -17.095280000000002 && p.getX() <= 50.010551000000014 && p.getY() <= -16.725558999999976) || (p.getX() >= 47.200554000000075 && p.getY() >= -15.436667999999996 && p.getX() <= 47.22583000000009 && p.getY() <= -15.420000000000016) || (p.getX() >= 48.191666000000055 && p.getY() >= -13.41999999999996 && p.getX() <= 48.36332700000015 && p.getY() <= -13.195277999999972) || (p.getX() >= 49.592498999999975 && p.getY() >= -12.626944999999978 && p.getX() <= 49.60777300000007 && p.getY() <= -12.610001000000011) || (p.getX() >= 43.236824000000006 && p.getY() >= -25.588337000000024 && p.getX() <= 50.50138900000002 && p.getY() <= -11.945557000000008)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Madagascar.data"));
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
