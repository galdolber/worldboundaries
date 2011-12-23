package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class CocosKeelingIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= 96.90248099999997 && p.getY() >= -12.199998999999991 && p.getX() <= 96.92442300000003 && p.getY() <= -12.151945000000012) || (p.getX() >= 96.81749000000002 && p.getY() >= -12.199443999999971 && p.getX() <= 96.86692800000014 && p.getY() <= -12.128331999999943)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/CocosKeelingIslands.data"));
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
