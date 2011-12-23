package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class FaroeIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -6.962778000000014 && p.getY() >= 61.388328999999935 && p.getX() <= -6.641666999999984 && p.getY() <= 61.644997000000046) || (p.getX() >= -6.908889999999928 && p.getY() >= 61.742775 && p.getX() <= -6.604166999999961 && p.getY() <= 61.90777600000007) || (p.getX() >= -7.435000000000002 && p.getY() >= 62.018608000000086 && p.getX() <= -7.040278000000001 && p.getY() <= 62.15999600000004) || (p.getX() >= -7.235001000000011 && p.getY() >= 61.933327000000126 && p.getX() <= -6.696112000000028 && p.getY() <= 62.307777000000094) || (p.getX() >= -6.720834000000025 && p.getY() >= 62.22666200000003 && p.getX() <= -6.619167000000004 && p.getY() <= 62.33138300000002) || (p.getX() >= -7.062499999999943 && p.getY() >= 62.05583200000001 && p.getX() <= -6.588055999999995 && p.getY() <= 62.33916499999999) || (p.getX() >= -6.588055999999995 && p.getY() >= 62.16888399999999 && p.getX() <= -6.388612000000023 && p.getY() <= 62.357498000000014) || (p.getX() >= -6.668333999999959 && p.getY() >= 62.25610399999999 && p.getX() <= -6.561110999999983 && p.getY() <= 62.37416100000007) || (p.getX() >= -6.546944999999994 && p.getY() >= 62.28443900000001 && p.getX() <= -6.391666999999927 && p.getY() <= 62.39694200000008)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/FaroeIslands.data"));
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
