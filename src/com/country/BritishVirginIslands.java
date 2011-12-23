package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class BritishVirginIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -64.70028699999995 && p.getY() >= 18.383888000000074 && p.getX() <= -64.55694599999998 && p.getY() <= 18.458054000000004) || (p.getX() >= -64.43861399999997 && p.getY() >= 18.431389000000134 && p.getX() <= -64.32223499999992 && p.getY() <= 18.509997999999936) || (p.getX() >= -64.40806600000002 && p.getY() >= 18.691943999999975 && p.getX() <= -64.26917999999995 && p.getY() <= 18.748608000000047)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/BritishVirginIslands.data"));
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
