package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class CotedIvoire {

  public static boolean test(Point p) {
    if ((p.getX() >= -3.168333999999959 && p.getY() >= 5.085022000000038 && p.getX() <= -3.102272000000028 && p.getY() <= 5.117222000000083) || (p.getX() >= -4.787683999999956 && p.getY() >= 5.141666000000043 && p.getX() <= -4.004444999999976 && p.getY() <= 5.277222000000052) || (p.getX() >= -8.606383999999935 && p.getY() >= 4.34472199999999 && p.getX() <= -2.487777999999935 && p.getY() <= 10.735255999999993)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/CotedIvoire.data"));
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
