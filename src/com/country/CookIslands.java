package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class CookIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -157.96447799999996 && p.getY() >= -21.940833999999995 && p.getX() <= -157.88250699999995 && p.getY() <= -21.879443999999975) || (p.getX() >= -159.841675 && p.getY() >= -21.25666799999999 && p.getX() <= -159.73278799999997 && p.getY() <= -21.1875) || (p.getX() >= -157.34139999999994 && p.getY() >= -20.188892000000006 && p.getX() <= -157.305878 && p.getY() <= -20.13306) || (p.getX() >= -158.13085899999996 && p.getY() >= -20.019173000000023 && p.getX() <= -158.08138999999997 && p.getY() <= -19.970553999999996) || (p.getX() >= -158.293335 && p.getY() >= -19.83833299999992 && p.getX() <= -158.26251199999993 && p.getY() <= -19.816394999999943) || (p.getX() >= -157.74136399999995 && p.getY() >= -19.857227000000023 && p.getX() <= -157.703369 && p.getY() <= -19.77028299999995) || (p.getX() >= -158.95501699999997 && p.getY() >= -19.273616999999945 && p.getX() <= -158.92471299999994 && p.getY() <= -19.24055899999996) || (p.getX() >= -159.80334499999998 && p.getY() >= -18.893332999999984 && p.getX() <= -159.77780199999998 && p.getY() <= -18.841392999999925) || (p.getX() >= -163.17224099999996 && p.getY() >= -18.091949 && p.getX() <= -163.15222199999997 && p.getY() <= -18.056667000000004) || (p.getX() >= -165.43749999999997 && p.getY() >= -11.551946999999984 && p.getX() <= -165.414185 && p.getY() <= -11.533335000000022) || (p.getX() >= -165.85028099999997 && p.getY() >= -10.890836999999976 && p.getX() <= -165.82586699999993 && p.getY() <= -10.87694499999992) || (p.getX() >= -161.05169699999996 && p.getY() >= -10.432502999999995 && p.getX() <= -161.021149 && p.getY() <= -10.39277800000002) || (p.getX() >= -161.01251199999996 && p.getY() >= -10.396389 && p.getX() <= -160.97168 && p.getY() <= -10.352777000000003) || (p.getX() >= -161.09612999999993 && p.getY() >= -10.045835000000013 && p.getX() <= -161.072266 && p.getY() <= -10.006947000000023) || (p.getX() >= -158.00976599999996 && p.getY() >= -8.985278999999991 && p.getX() <= -157.94030799999993 && p.getY() <= -8.948057000000006)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/CookIslands.data"));
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
