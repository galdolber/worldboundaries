package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class CaymanIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -81.40112299999998 && p.getY() >= 19.264720999999952 && p.getX() <= -81.09306300000003 && p.getY() <= 19.354164000000026) || (p.getX() >= -80.11167899999998 && p.getY() >= 19.65361000000007 && p.getX() <= -79.96528599999998 && p.getY() <= 19.71166599999998) || (p.getX() >= -79.89334099999996 && p.getY() >= 19.685275999999988 && p.getX() <= -79.73278799999997 && p.getY() <= 19.762218000000075)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/CaymanIslands.data"));
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
