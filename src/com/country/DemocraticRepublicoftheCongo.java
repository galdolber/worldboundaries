package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class DemocraticRepublicoftheCongo {

  public static boolean test(Point p) {
    if ((p.getX() >= 12.737220999999977 && p.getY() >= -5.948333999999988 && p.getX() <= 12.974165000000085 && p.getY() <= -5.848888999999929) || (p.getX() >= 12.21455200000014 && p.getY() >= -13.45805699999994 && p.getX() <= 31.302775999999994 && p.getY() <= 5.381389000000013)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/DemocraticRepublicoftheCongo.data"));
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
