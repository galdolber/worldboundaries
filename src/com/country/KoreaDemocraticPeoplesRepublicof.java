package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class KoreaDemocraticPeoplesRepublicof {

  public static boolean test(Point p) {
    if ((p.getX() >= 124.83167300000001 && p.getY() >= 39.49554399999994 && p.getX() <= 124.93553200000008 && p.getY() <= 39.61388399999999) || (p.getX() >= 124.322769 && p.getY() >= 37.67137900000012 && p.getX() <= 130.69741799999997 && p.getY() <= 43.00832400000013)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/KoreaDemocraticPeoplesRepublicof.data"));
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
