package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class FalklandIslandsMalvinas {

  public static boolean test(Point p) {
    if ((p.getX() >= -59.765282000000006 && p.getY() >= -52.27833599999997 && p.getX() <= -59.67555999999996 && p.getY() <= -52.165282999999995) || (p.getX() >= -58.53388999999999 && p.getY() >= -52.09638999999999 && p.getX() <= -58.41861699999998 && p.getY() <= -51.98861699999992) || (p.getX() >= -61.313895999999936 && p.getY() >= -51.865561999999954 && p.getX() <= -61.19444999999996 && p.getY() <= -51.79695099999992) || (p.getX() >= -61.149445000000014 && p.getY() >= -51.96583600000002 && p.getX() <= -60.86778300000003 && p.getY() <= -51.77833600000002) || (p.getX() >= -61.315834 && p.getY() >= -51.756110999999976 && p.getX() <= -61.19583899999998 && p.getY() <= -51.680556999999965) || (p.getX() >= -60.98083499999996 && p.getY() >= -52.24555999999996 && p.getX() <= -59.210556 && p.getY() <= -51.336394999999925) || (p.getX() >= -59.72008499999998 && p.getY() >= -52.343055999999926 && p.getX() <= -57.73139199999997 && p.getY() <= -51.29138899999998) || (p.getX() >= -60.025283999999935 && p.getY() >= -51.35083800000001 && p.getX() <= -59.90084099999996 && p.getY() <= -51.282501000000025) || (p.getX() >= -60.30028499999997 && p.getY() >= -51.40833999999995 && p.getX() <= -60.04778299999998 && p.getY() <= -51.26445000000001) || (p.getX() >= -59.811110999999926 && p.getY() >= -51.337501999999965 && p.getX() <= -59.44555700000001 && p.getY() <= -51.249450999999965)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/FalklandIslandsMalvinas.data"));
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
