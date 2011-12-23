package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class UnitedStatesVirginIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -64.89611799999993 && p.getY() >= 17.676666000000125 && p.getX() <= -64.56028700000002 && p.getY() <= 17.792500000000132) || (p.getX() >= -64.79028299999993 && p.getY() >= 18.307499000000064 && p.getX() <= -64.65833999999995 && p.getY() <= 18.371943999999985) || (p.getX() >= -65.026947 && p.getY() >= 18.310554999999965 && p.getX() <= -64.831955 && p.getY() <= 18.37777699999998)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/UnitedStatesVirginIslands.data"));
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
