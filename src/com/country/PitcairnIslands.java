package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class PitcairnIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -130.107483 && p.getY() >= -25.08222599999993 && p.getX() <= -130.06195099999997 && p.getY() <= -25.05528299999992) || (p.getX() >= -124.79666099999997 && p.getY() >= -24.676666000000008 && p.getX() <= -124.77113300000002 && p.getY() <= -24.662787999999978) || (p.getX() >= -128.34725999999995 && p.getY() >= -24.41305499999993 && p.getX() <= -128.285553 && p.getY() <= -24.32500499999992)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/PitcairnIslands.data"));
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
