package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class TurksandCaicosIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -71.15055799999999 && p.getY() >= 21.43027500000011 && p.getX() <= -71.12779199999994 && p.getY() <= 21.51110800000009) || (p.getX() >= -72.46806299999997 && p.getY() >= 21.62805200000008 && p.getX() <= -72.42750499999998 && p.getY() <= 21.713333000000038) || (p.getX() >= -71.53500399999996 && p.getY() >= 21.65277500000002 && p.getX() <= -71.45639 && p.getY() <= 21.734444000000053) || (p.getX() >= -71.85057099999995 && p.getY() >= 21.739719000000093 && p.getX() <= -71.63362099999995 && p.getY() <= 21.854720999999984) || (p.getX() >= -72.32972699999993 && p.getY() >= 21.741664999999955 && p.getX() <= -72.24223299999994 && p.getY() <= 21.855830999999966) || (p.getX() >= -72.035843 && p.getY() >= 21.823607999999975 && p.getX() <= -71.881958 && p.getY() <= 21.957775000000023)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/TurksandCaicosIslands.data"));
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
