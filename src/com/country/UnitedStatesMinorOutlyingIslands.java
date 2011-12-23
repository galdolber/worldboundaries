package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class UnitedStatesMinorOutlyingIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= -160.04861499999996 && p.getY() >= -0.39805599999994 && p.getX() <= -160.00946 && p.getY() <= -0.37388900000002) || (p.getX() >= -176.468323 && p.getY() >= 0.215278000000069 && p.getX() <= -176.453369 && p.getY() <= 0.22750000000002) || (p.getX() >= -176.64584399999995 && p.getY() >= 0.790278000000114 && p.getX() <= -176.62997399999998 && p.getY() <= 0.81277799999998) || (p.getX() >= -169.54388399999993 && p.getY() >= 16.7241590000001 && p.getX() <= -169.522522 && p.getY() <= 16.73249100000004) || (p.getX() >= 166.60745199999997 && p.getY() >= 19.279442000000127 && p.getX() <= 166.66247600000005 && p.getY() <= 19.324576999999977) || (p.getX() >= -177.34222399999993 && p.getY() >= 28.19388600000013 && p.getX() <= -177.31750499999995 && p.getY() <= 28.213608000000026) || (p.getX() >= -177.395844 && p.getY() >= 28.18415800000008 && p.getX() <= -177.35803199999998 && p.getY() <= 28.22193499999992)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/UnitedStatesMinorOutlyingIslands.data"));
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
