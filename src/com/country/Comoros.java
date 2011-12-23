package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Comoros {

  public static boolean test(Point p) {
    if ((p.getX() >= 43.62138399999998 && p.getY() >= -12.383057000000008 && p.getX() <= 43.86388400000004 && p.getY() <= -12.240277999999988) || (p.getX() >= 44.20666500000005 && p.getY() >= -12.380279999999972 && p.getX() <= 44.53082999999999 && p.getY() <= -12.069444999999916) || (p.getX() >= 43.213608000000015 && p.getY() >= -11.936110999999984 && p.getX() <= 43.498604000000114 && p.getY() <= -11.36694499999993)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Comoros.data"));
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
