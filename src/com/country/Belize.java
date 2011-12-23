package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Belize {

  public static boolean test(Point p) {
    if ((p.getX() >= -87.83473200000003 && p.getY() >= 17.28916500000014 && p.getX() <= -87.79917899999992 && p.getY() <= 17.400275999999963) || (p.getX() >= -87.93640099999993 && p.getY() >= 17.274997999999982 && p.getX() <= -87.77889999999996 && p.getY() <= 17.549998999999957) || (p.getX() >= -88.07444799999996 && p.getY() >= 17.552497999999957 && p.getX() <= -88.044174 && p.getY() <= 17.638332000000048) || (p.getX() >= -88.16751099999993 && p.getY() >= 17.664443999999946 && p.getX() <= -88.06945799999998 && p.getY() <= 17.73555399999998) || (p.getX() >= -88.00611900000001 && p.getY() >= 17.896663999999987 && p.getX() <= -87.84529099999997 && p.getY() <= 18.164719000000048) || (p.getX() >= -89.21640000000002 && p.getY() >= 15.889851000000135 && p.getX() <= -88.07778899999998 && p.getY() <= 18.48990200000009)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Belize.data"));
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
