package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Mauritania {

  public static boolean test(Point p) {
    if ((p.getX() >= -16.461112999999955 && p.getY() >= 19.601387000000106 && p.getX() <= -16.335555999999997 && p.getY() <= 19.866386000000087) || (p.getX() >= -17.075557999999944 && p.getY() >= 14.725321000000008 && p.getX() <= -4.806110999999987 && p.getY() <= 27.29045900000005)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Mauritania.data"));
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
