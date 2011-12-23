package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class BruneiDarussalam {

  public static boolean test(Point p) {
    if ((p.getX() >= 115.020538 && p.getY() >= 4.311388000000079 && p.getX() <= 115.36026000000005 && p.getY() <= 4.903240000000096) || (p.getX() >= 114.09507799999993 && p.getY() >= 4.017498999999987 && p.getX() <= 115.10555299999999 && p.getY() <= 5.053053999999975)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/BruneiDarussalam.data"));
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
