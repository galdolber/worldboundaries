package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Palau {

  public static boolean test(Point p) {
    if ((p.getX() >= 132.2083130000001 && p.getY() >= 5.292220999999927 && p.getX() <= 132.23135400000012 && p.getY() <= 5.315276000000097) || (p.getX() >= 134.1338810000001 && p.getY() >= 6.88444400000003 && p.getX() <= 134.178314 && p.getY() <= 6.937499000000116) || (p.getX() >= 134.22689800000015 && p.getY() >= 6.981666000000018 && p.getX() <= 134.28442400000003 && p.getY() <= 7.070832999999993) || (p.getX() >= 134.353027 && p.getY() >= 7.139443000000085 && p.getX() <= 134.40109300000006 && p.getY() <= 7.192497999999944) || (p.getX() >= 134.34078999999997 && p.getY() >= 7.215832999999975 && p.getX() <= 134.44635000000002 && p.getY() <= 7.278887999999995) || (p.getX() >= 134.444977 && p.getY() >= 7.305553999999972 && p.getX() <= 134.524994 && p.getY() <= 7.362499000000014) || (p.getX() >= 134.485229 && p.getY() >= 7.354444000000001 && p.getX() <= 134.65887499999997 && p.getY() <= 7.729444000000058)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Palau.data"));
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
