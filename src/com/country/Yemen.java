package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Yemen {

  public static boolean test(Point p) {
    if ((p.getX() >= 53.25666000000001 && p.getY() >= 12.106109999999944 && p.getX() <= 53.340828000000094 && p.getY() <= 12.134442999999976) || (p.getX() >= 53.011383000000016 && p.getY() >= 12.13305500000007 && p.getX() <= 53.11332700000008 && p.getY() <= 12.181389000000138) || (p.getX() >= 52.08305399999995 && p.getY() >= 12.144721999999945 && p.getX() <= 52.397217000000126 && p.getY() <= 12.2469440000001) || (p.getX() >= 43.39138799999994 && p.getY() >= 12.630278000000088 && p.getX() <= 43.450554000000125 && p.getY() <= 12.67388699999998) || (p.getX() >= 53.325829 && p.getY() >= 12.30805400000014 && p.getX() <= 54.47694400000007 && p.getY() <= 12.717777000000067) || (p.getX() >= 42.67527800000005 && p.getY() >= 13.660000000000082 && p.getX() <= 42.79721800000005 && p.getY() <= 13.782775999999956) || (p.getX() >= 42.68916300000012 && p.getY() >= 13.909443000000124 && p.getX() <= 42.79999500000014 && p.getY() <= 14.066944000000092) || (p.getX() >= 42.55583200000012 && p.getY() >= 15.270831999999984 && p.getX() <= 42.65972099999999 && p.getY() <= 15.458331999999984) || (p.getX() >= 42.67999300000008 && p.getY() >= 12.592776999999955 && p.getX() <= 53.114441000000056 && p.getY() <= 18.99934400000012)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Yemen.data"));
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
