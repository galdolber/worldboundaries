package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Ecuador {

  public static boolean test(Point p) {
    if ((p.getX() >= -80.27444500000001 && p.getY() >= -3.036667000000023 && p.getX() <= -79.90251199999993 && p.getY() <= -2.662221999999986) || (p.getX() >= -79.88694800000003 && p.getY() >= -2.644721999999945 && p.getX() <= -79.82167099999998 && p.getY() <= -2.466666999999916) || (p.getX() >= -89.7533419999999 && p.getY() >= -1.408055999999988 && p.getX() <= -89.60751299999998 && p.getY() <= -1.343055999999933) || (p.getX() >= -90.52305599999994 && p.getY() >= -1.356110999999942 && p.getX() <= -90.36527999999991 && p.getY() <= -1.21777800000001) || (p.getX() >= -90.085556 && p.getY() >= -0.839444999999955 && p.getX() <= -90.03556799999996 && p.getY() <= -0.800555999999972) || (p.getX() >= -89.629456 && p.getY() >= -0.958610999999962 && p.getX() <= -89.24500999999992 && p.getY() <= -0.685277999999983) || (p.getX() >= -90.55111699999992 && p.getY() >= -0.781388999999933 && p.getX() <= -90.17834499999998 && p.getY() <= -0.498333000000002) || (p.getX() >= -91.66389500000001 && p.getY() >= -0.496110999999985 && p.getX() <= -91.39527899999997 && p.getY() <= -0.24805600000002) || (p.getX() >= -90.87445099999997 && p.getY() >= -0.375556000000017 && p.getX() <= -90.54750099999997 && p.getY() <= -0.149444000000017) || (p.getX() >= -91.60612500000002 && p.getY() >= -1.034721999999988 && p.getX() <= -90.810837 && p.getY() <= 0.130278000000089) || (p.getX() >= -90.54278599999992 && p.getY() >= 0.261111000000142 && p.getX() <= -90.40362499999996 && p.getY() <= 0.364443999999992) || (p.getX() >= -90.804459 && p.getY() >= 0.546110999999996 && p.getX() <= -90.741394 && p.getY() <= 0.651667000000089) || (p.getX() >= -78.998901 && p.getY() >= 1.235277999999994 && p.getX() <= -78.89472999999992 && p.getY() <= 1.367778000000101) || (p.getX() >= -80.97666899999997 && p.getY() >= -5.009131999999966 && p.getX() <= -75.21608000000003 && p.getY() <= 1.437777999999923)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Ecuador.data"));
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
