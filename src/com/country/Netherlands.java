package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Netherlands {

  public static boolean test(Point p) {
    if ((p.getX() >= 3.370865999999978 && p.getY() >= 51.20527600000008 && p.getX() <= 4.23889800000012 && p.getY() <= 51.41194200000013) || (p.getX() >= 5.135555000000124 && p.getY() >= 52.26416000000012 && p.getX() <= 5.862928000000068 && p.getY() <= 52.60110500000002) || (p.getX() >= 5.032509000000061 && p.getY() >= 52.38313700000009 && p.getX() <= 5.486110999999994 && p.getY() <= 52.69110899999998) || (p.getX() >= 4.706665999999984 && p.getY() >= 52.98860900000005 && p.getX() <= 4.912222000000042 && p.getY() <= 53.188331999999946) || (p.getX() >= 4.879998999999998 && p.getY() >= 53.2108310000001 && p.getX() <= 5.106388000000038 && p.getY() <= 53.31082900000007) || (p.getX() >= 5.166666000000134 && p.getY() >= 53.34944200000013 && p.getX() <= 5.581943999999964 && p.getY() <= 53.45277400000009) || (p.getX() >= 3.440555000000018 && p.getY() >= 50.75388300000009 && p.getX() <= 7.21166599999998 && p.getY() <= 53.465827999999995) || (p.getX() >= 5.63250000000005 && p.getY() >= 53.42527800000005 && p.getX() <= 5.956110999999964 && p.getY() <= 53.47305299999999) || (p.getX() >= 6.116387999999972 && p.getY() >= 53.45360599999998 && p.getX() <= 6.341110000000072 && p.getY() <= 53.51138300000014)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Netherlands.data"));
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
