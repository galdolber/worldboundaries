package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SouthGeorgiaSouthSandwichIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -27.412502000000018 && p.getY() >= -59.473060999999966 && p.getX() <= -27.298058000000022 && p.getY() <= -59.42195099999992) || (p.getX() >= -26.665001000000014 && p.getY() >= -59.07000699999992 && p.getX() <= -26.501114000000033 && p.getY() <= -58.998062) || (p.getX() >= -26.459166999999976 && p.getY() >= -58.49861099999998 && p.getX() <= -26.241390000000024 && p.getY() <= -58.38250699999992) || (p.getX() >= -26.51222200000001 && p.getY() >= -57.818892999999946 && p.getX() <= -26.39000299999992 && p.getY() <= -57.73972299999997) || (p.getX() >= -26.728888999999924 && p.getY() >= -57.08861499999995 && p.getX() <= -26.65138999999993 && p.getY() <= -57.04944599999999) || (p.getX() >= -27.21083499999997 && p.getY() >= -56.72722599999992 && p.getX() <= -27.088889999999992 && p.getY() <= -56.679168999999945) || (p.getX() >= -27.606112999999937 && p.getY() >= -56.32167099999998 && p.getX() <= -27.539447999999997 && p.getY() <= -56.270560999999994) || (p.getX() >= -37.10806299999996 && p.getY() >= -54.51639599999999 && p.getX() <= -37.01972999999998 && p.getY() <= -54.466948999999936) || (p.getX() >= -38.03305799999998 && p.getY() >= -54.890282000000006 && p.getX() <= -35.78250099999997 && p.getY() <= -53.989723000000026)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SouthGeorgiaSouthSandwichIslands.data"));
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
