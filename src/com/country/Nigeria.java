package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Nigeria {

  public static boolean test(Point p) {
    if ((p.getX() >= 7.335833000000036 && p.getY() >= 4.431110000000103 && p.getX() <= 7.478611000000058 && p.getY() <= 4.488054999999974) || (p.getX() >= 7.133888000000013 && p.getY() >= 4.377776999999924 && p.getX() <= 7.316666999999995 && p.getY() <= 4.520000000000039) || (p.getX() >= 2.692499999999939 && p.getY() >= 4.272499000000096 && p.getX() <= 14.658053999999993 && p.getY() <= 13.891499000000124)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Nigeria.data"));
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
