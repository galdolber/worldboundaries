package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Tonga {

  public static boolean test(Point p) {
    if ((p.getX() >= -174.97470099999998 && p.getY() >= -21.454165999999987 && p.getX() <= -174.91085799999996 && p.getY() <= -21.306109999999993) || (p.getX() >= -175.36053499999997 && p.getY() >= -21.268062999999927 && p.getX() <= -175.045563 && p.getY() <= -21.063617999999963) || (p.getX() >= -174.79586799999996 && p.getY() >= -20.278056999999993 && p.getX() <= -174.75613399999997 && p.getY() <= -20.230831000000023) || (p.getX() >= -174.42391999999998 && p.getY() >= -19.92833300000001 && p.getX() <= -174.38671899999994 && p.getY() <= -19.880554000000014) || (p.getX() >= -174.35498 && p.getY() >= -19.825279000000023 && p.getX() <= -174.30642700000004 && p.getY() <= -19.764171999999974) || (p.getX() >= -175.09860199999997 && p.getY() >= -19.800838 && p.getX() <= -175.04226699999998 && p.getY() <= -19.706389999999946) || (p.getX() >= -174.30722 && p.getY() >= -19.753616000000022 && p.getX() <= -174.24752799999996 && p.getY() <= -19.688053000000025) || (p.getX() >= -175.03613299999998 && p.getY() >= -19.692497000000003 && p.getX() <= -175.00283799999997 && p.getY() <= -19.651389999999992) || (p.getX() >= -174.29388399999996 && p.getY() >= -19.657226999999978 && p.getX() <= -174.23889199999996 && p.getY() <= -19.591392999999925) || (p.getX() >= -174.675049 && p.getY() >= -18.83027999999996 && p.getX() <= -174.62307699999994 && p.getY() <= -18.783057999999983) || (p.getX() >= -174.09780900000004 && p.getY() >= -18.70639 && p.getX() <= -174.06140099999996 && p.getY() <= -18.681109999999993) || (p.getX() >= -174.04501299999995 && p.getY() >= -18.719722999999988 && p.getX() <= -174.01501499999998 && p.getY() <= -18.68028299999992) || (p.getX() >= -174.128357 && p.getY() >= -18.704448999999958 && p.getX() <= -174.08529699999994 && p.getY() <= -18.663886999999928) || (p.getX() >= -174.07058699999996 && p.getY() >= -18.684169999999938 && p.getX() <= -173.90615800000003 && p.getY() <= -18.56805799999995) || (p.getX() >= -175.684723 && p.getY() >= -15.630280000000027 && p.getX() <= -175.60723899999996 && p.getY() <= -15.56027999999992)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Tonga.data"));
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
