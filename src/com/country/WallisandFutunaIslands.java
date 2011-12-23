package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class WallisandFutunaIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -178.19110099999997 && p.getY() >= -14.323891000000003 && p.getX() <= -178.04226699999998 && p.getY() <= -14.231668000000012) || (p.getX() >= -176.19110100000003 && p.getY() >= -13.353053999999986 && p.getX() <= -176.12109399999997 && p.getY() <= -13.213614000000009)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/WallisandFutunaIslands.data"));
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
