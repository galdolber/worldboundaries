package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Kazakhstan {

  public static boolean test(Point p) {
    if ((p.getX() >= 49.97886700000004 && p.getY() >= 44.811104 && p.getX() <= 50.18888099999998 && p.getY() <= 45.07749200000001) || (p.getX() >= 50.258888000000006 && p.getY() >= 44.94443500000011 && p.getX() <= 50.349716000000114 && p.getY() <= 45.08305400000012) || (p.getX() >= 52.96027400000008 && p.getY() >= 46.222488 && p.getX() <= 53.09804500000007 && p.getY() <= 46.36804999999998) || (p.getX() >= 46.49916100000013 && p.getY() >= 40.59443699999997 && p.getX() <= 87.348206 && p.getY() <= 55.44470999999999)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Kazakhstan.data"));
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
