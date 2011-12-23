package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Seychelles {

  public static boolean test(Point p) {
    if ((p.getX() >= 46.47610500000008 && p.getY() >= -9.755000999999991 && p.getX() <= 46.511108000000085 && p.getY() <= -9.716666999999973) || (p.getX() >= 46.2041630000001 && p.getY() >= -9.463056999999935 && p.getX() <= 46.52221699999996 && p.getY() <= -9.345000999999968) || (p.getX() >= 46.27666499999999 && p.getY() >= -9.359724000000028 && p.getX() <= 46.42694100000011 && p.getY() <= -9.33194500000002) || (p.getX() >= 56.245827000000126 && p.getY() >= -7.194444999999916 && p.getX() <= 56.28611000000001 && p.getY() <= -7.110834000000011) || (p.getX() >= 55.37471800000014 && p.getY() >= -4.78916700000002 && p.getX() <= 55.54055 && p.getY() <= -4.551390000000026) || (p.getX() >= 55.217216000000064 && p.getY() >= -4.508333999999934 && p.getX() <= 55.26722000000012 && p.getY() <= -4.448056000000008) || (p.getX() >= 55.685829000000005 && p.getY() >= -4.349722999999983 && p.getX() <= 55.7791600000001 && p.getY() <= -4.280001000000027)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Seychelles.data"));
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
