package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Oman {

  public static boolean test(Point p) {
    if ((p.getX() >= 55.82916300000005 && p.getY() >= 17.486111000000108 && p.getX() <= 55.88693999999998 && p.getY() <= 17.516665999999987) || (p.getX() >= 55.95694000000003 && p.getY() >= 17.483607999999947 && p.getX() <= 56.09360500000014 && p.getY() <= 17.552497999999957) || (p.getX() >= 58.633331 && p.getY() >= 20.16833100000008 && p.getX() <= 58.952217000000125 && p.getY() <= 20.693054000000128) || (p.getX() >= 51.99928999999992 && p.getY() >= 16.64277800000002 && p.getX() <= 59.84722099999999 && p.getY() <= 24.98360800000006) || (p.getX() >= 56.07994100000008 && p.getY() >= 25.626110000000097 && p.getX() <= 56.51493499999999 && p.getY() <= 26.38238900000005)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Oman.data"));
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
