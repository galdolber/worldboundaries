package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SaintKittsandNevis {

  public static boolean test(Point p) {
    if ((p.getX() >= -62.62611400000003 && p.getY() >= 17.091662999999983 && p.getX() <= -62.53417199999996 && p.getY() <= 17.199718000000075) || (p.getX() >= -62.863892000000014 && p.getY() >= 17.208885000000066 && p.getX() <= -62.620560000000005 && p.getY() <= 17.41083100000003)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SaintKittsandNevis.data"));
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
