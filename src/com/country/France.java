package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class France {

  public static boolean test(Point p) {
    if ((p.getX() >= 9.45777700000002 && p.getY() >= 42.603607000000125 && p.getX() <= 9.494719999999916 && p.getY() <= 42.64332600000006) || (p.getX() >= 8.570555000000127 && p.getY() >= 41.364166000000075 && p.getX() <= 9.56222200000002 && p.getY() <= 43.01055099999997) || (p.getX() >= -1.403055999999992 && p.getY() >= 45.80693800000006 && p.getX() <= -1.17055599999992 && p.getY() <= 46.051109) || (p.getX() >= -1.553056000000026 && p.getY() >= 46.155548000000074 && p.getX() <= -1.254166999999995 && p.getY() <= 46.25666000000001) || (p.getX() >= -2.385278000000028 && p.getY() >= 46.69277200000005 && p.getX() <= -2.268611000000021 && p.getY() <= 46.736107) || (p.getX() >= -2.284721999999988 && p.getY() >= 46.90582999999999 && p.getX() <= -2.135555999999951 && p.getY() <= 47.03194400000001) || (p.getX() >= -3.260833999999932 && p.getY() >= 47.28777300000013 && p.getX() <= -3.061388999999963 && p.getY() <= 47.39277600000015) || (p.getX() >= -5.134723000000008 && p.getY() >= 48.442214999999976 && p.getX() <= -5.044999999999959 && p.getY() <= 48.483055000000085) || (p.getX() >= -3.582777999999962 && p.getY() >= 48.80388600000009 && p.getX() <= -3.563333999999941 && p.getY() <= 48.81277499999993) || (p.getX() >= -4.790278000000001 && p.getY() >= 42.332497000000046 && p.getX() <= 8.226077999999973 && p.getY() <= 51.09111000000007)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/France.data"));
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
