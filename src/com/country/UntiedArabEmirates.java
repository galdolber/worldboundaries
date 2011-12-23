package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class UntiedArabEmirates {

  public static boolean test(Point p) {
    if ((p.getX() >= 53.62388600000003 && p.getY() >= 24.124996000000007 && p.getX() <= 53.96527100000014 && p.getY() <= 24.269165000000044) || (p.getX() >= 53.24360700000005 && p.getY() >= 24.258331 && p.getX() <= 53.348885000000045 && p.getY() <= 24.328888000000063) || (p.getX() >= 53.07860599999998 && p.getY() >= 24.309718999999973 && p.getX() <= 53.10971800000009 && p.getY() <= 24.355831000000023) || (p.getX() >= 54.17443800000001 && p.getY() >= 24.269165000000044 && p.getX() <= 54.269997000000046 && p.getY() <= 24.35611) || (p.getX() >= 52.57166300000006 && p.getY() >= 24.26694100000003 && p.getX() <= 52.658882000000006 && p.getY() <= 24.373333000000056) || (p.getX() >= 53.377495000000074 && p.getY() >= 24.32027400000004 && p.getX() <= 53.43332700000001 && p.getY() <= 24.374164999999948) || (p.getX() >= 54.32833100000005 && p.getY() >= 24.417220999999984 && p.getX() <= 54.475273000000016 && p.getY() <= 24.502499) || (p.getX() >= 54.469719 && p.getY() >= 24.495277000000044 && p.getX() <= 54.51722000000007 && p.getY() <= 24.54555500000004) || (p.getX() >= 54.40083299999998 && p.getY() >= 24.50111000000004 && p.getX() <= 54.4738850000001 && p.getY() <= 24.58999600000004) || (p.getX() >= 55.60971800000009 && p.getY() >= 25.56638700000002 && p.getX() <= 55.620551999999975 && p.getY() <= 25.58361099999996) || (p.getX() >= 51.583328 && p.getY() >= 22.63332900000006 && p.getX() <= 56.38166000000001 && p.getY() <= 26.08416)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/UntiedArabEmirates.data"));
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
