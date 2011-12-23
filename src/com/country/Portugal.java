package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Portugal {

  public static boolean test(Point p) {
    if ((p.getX() >= -17.255835999999988 && p.getY() >= 32.63749700000011 && p.getX() <= -16.71555699999999 && p.getY() <= 32.87194100000005) || (p.getX() >= -16.400557999999933 && p.getY() >= 33.02915999999999 && p.getX() <= -16.28583500000002 && p.getY() <= 33.109993000000145) || (p.getX() >= -25.200557999999944 && p.getY() >= 36.929161000000015 && p.getX() <= -25.01222199999995 && p.getY() <= 37.02360500000003) || (p.getX() >= -25.864723000000023 && p.getY() >= 37.70555100000007 && p.getX() <= -25.130279999999917 && p.getY() <= 37.90999600000004) || (p.getX() >= -28.55194499999999 && p.getY() >= 38.37194100000005 && p.getX() <= -28.03583500000002 && p.getY() <= 38.55832700000008) || (p.getX() >= -27.389725 && p.getY() >= 38.629439999999995 && p.getX() <= -27.019168999999977 && p.getY() <= 38.803055000000086) || (p.getX() >= -31.29000099999996 && p.getY() >= 39.35333300000013 && p.getX() <= -31.12305800000001 && p.getY() <= 39.52194200000014) || (p.getX() >= -9.494721999999967 && p.getY() >= 37.00833100000011 && p.getX() <= -6.187221999999963 && p.getY() <= 42.15274)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Portugal.data"));
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
