package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Lithuania {

  public static boolean test(Point p) {
    if ((p.getX() >= 20.942833000000064 && p.getY() >= 55.27655000000004 && p.getX() <= 21.13471999999996 && p.getY() <= 55.719986000000006) || (p.getX() >= 21.0430530000001 && p.getY() >= 53.88804600000009 && p.getX() <= 26.819717000000136 && p.getY() <= 56.450829)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Lithuania.data"));
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
