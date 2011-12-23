package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Ukraine {

  public static boolean test(Point p) {
    if ((p.getX() >= 32.75943799999999 && p.getY() >= 46.00972000000007 && p.getX() <= 33.06026500000007 && p.getY() <= 46.05832700000001) || (p.getX() >= 34.158043000000134 && p.getY() >= 46.06082200000003 && p.getX() <= 34.264709000000096 && p.getY() <= 46.18775900000014) || (p.getX() >= 31.500000000000057 && p.getY() >= 46.14388299999996 && p.getX() <= 32.16860200000008 && p.getY() <= 46.3730470000001) || (p.getX() >= 22.15144199999992 && p.getY() >= 44.379150000000095 && p.getX() <= 40.17971800000004 && p.getY() <= 52.37971500000009)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Ukraine.data"));
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
