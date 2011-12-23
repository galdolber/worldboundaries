package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SierraLeone {

  public static boolean test(Point p) {
    if ((p.getX() >= -12.952777999999968 && p.getY() >= 7.420833000000016 && p.getX() <= -12.495555999999963 && p.getY() <= 7.638888000000065) || (p.getX() >= -13.295610000000012 && p.getY() >= 6.923610999999937 && p.getX() <= -10.264167999999929 && p.getY() <= 9.997499000000062)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SierraLeone.data"));
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
