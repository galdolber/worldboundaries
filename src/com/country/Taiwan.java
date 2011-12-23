package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Taiwan {

  public static boolean test(Point p) {
    if ((p.getX() >= 121.48996700000008 && p.getY() >= 22.001109999999983 && p.getX() <= 121.58360300000017 && p.getY() <= 22.078884000000016) || (p.getX() >= 119.52670300000013 && p.getY() >= 23.510555000000124 && p.getX() <= 119.67249300000015 && p.getY() <= 23.60749800000008) || (p.getX() >= 118.20583299999998 && p.getY() >= 24.404163000000096 && p.getX() <= 118.25 && p.getY() <= 24.447216000000022) || (p.getX() >= 118.27554299999997 && p.getY() >= 24.388329000000056 && p.getX() <= 118.4511030000001 && p.getY() <= 24.521663999999987) || (p.getX() >= 120.04914900000003 && p.getY() >= 21.92777300000012 && p.getX() <= 122.00221299999998 && p.getY() <= 25.28416400000009) || (p.getX() >= 119.90770700000007 && p.getY() >= 26.131663999999944 && p.getX() <= 119.95247700000016 && p.getY() <= 26.162773000000016) || (p.getX() >= 119.95359799999994 && p.getY() >= 26.186108000000047 && p.getX() <= 120.00665300000003 && p.getY() <= 26.229717000000107)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Taiwan.data"));
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
