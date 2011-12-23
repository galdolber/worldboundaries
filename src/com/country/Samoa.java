package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Samoa {

  public static boolean test(Point p) {
    if ((p.getX() >= -172.06475800000004 && p.getY() >= -14.057502999999995 && p.getX() <= -171.42864999999998 && p.getY() <= -13.80555499999997) || (p.getX() >= -172.78060899999994 && p.getY() >= -13.808889000000022 && p.getX() <= -172.16781599999996 && p.getY() <= -13.46055599999994)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Samoa.data"));
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
