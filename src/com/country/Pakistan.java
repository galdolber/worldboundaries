package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Pakistan {

  public static boolean test(Point p) {
    if ((p.getX() >= 67.37942499999997 && p.getY() >= 24.001389000000128 && p.getX() <= 67.48165899999998 && p.getY() <= 24.056942000000102) || (p.getX() >= 60.86630200000008 && p.getY() >= 23.688048999999975 && p.getX() <= 77.82392900000013 && p.getY() <= 37.0625920000001)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Pakistan.data"));
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
