package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class landIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= 19.999165000000065 && p.getY() >= 59.97694400000007 && p.getX() <= 20.227497000000028 && p.getY() <= 60.095550999999936) || (p.getX() >= 20.198887000000013 && p.getY() >= 60.054161000000136 && p.getX() <= 20.298332000000077 && p.getY() <= 60.142494000000056) || (p.getX() >= 19.510555000000007 && p.getY() >= 60.12194099999999 && p.getX() <= 19.67666600000007 && p.getY() <= 60.256660000000075) || (p.getX() >= 20.340553000000057 && p.getY() >= 60.19332900000006 && p.getX() <= 20.44249700000006 && p.getY() <= 60.26722000000001) || (p.getX() >= 19.64833100000004 && p.getY() >= 60.04277000000002 && p.getX() <= 20.27749600000004 && p.getY() <= 60.40361000000013)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/landIslands.data"));
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
