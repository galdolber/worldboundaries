package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Croatia {

  public static boolean test(Point p) {
    if ((p.getX() >= 16.812496000000124 && p.getY() >= 42.724716000000114 && p.getX() <= 16.940277000000037 && p.getY() <= 42.77777100000003) || (p.getX() >= 17.321663 && p.getY() >= 42.69166600000011 && p.getX() <= 17.746109000000047 && p.getY() <= 42.80221600000005) || (p.getX() >= 16.633053000000075 && p.getY() >= 42.89777400000015 && p.getX() <= 17.183609000000047 && p.getY() <= 42.990829000000126) || (p.getX() >= 17.004165999999998 && p.getY() >= 42.39666000000011 && p.getX() <= 18.526108000000136 && p.getY() <= 43.04888199999999) || (p.getX() >= 16.05055200000004 && p.getY() >= 43.009995 && p.getX() <= 16.25471900000008 && p.getY() <= 43.082497000000096) || (p.getX() >= 16.373055000000136 && p.getY() >= 43.11249500000002 && p.getX() <= 17.19008300000013 && p.getY() <= 43.23308199999997) || (p.getX() >= 16.404719999999998 && p.getY() >= 43.26166500000011 && p.getX() <= 16.888611000000026 && p.getY() <= 43.391106000000086) || (p.getX() >= 16.197220000000016 && p.getY() >= 43.32916300000005 && p.getX() <= 16.39110900000003 && p.getY() <= 43.41416199999992) || (p.getX() >= 15.606667000000073 && p.getY() >= 43.63055400000002 && p.getX() <= 15.703054000000009 && p.getY() <= 43.675551999999925) || (p.getX() >= 15.224997999999973 && p.getY() >= 43.77592500000002 && p.getX() <= 15.376669000000048 && p.getY() <= 43.87666300000012) || (p.getX() >= 15.260831999999994 && p.getY() >= 43.88610799999998 && p.getX() <= 15.448055000000013 && p.getY() <= 44.01082600000001) || (p.getX() >= 15.06222200000002 && p.getY() >= 44.014999000000095 && p.getX() <= 15.25610899999998 && p.getY() <= 44.15749399999999) || (p.getX() >= 14.816319000000078 && p.getY() >= 43.8711090000001 && p.getX() <= 15.226386999999988 && p.getY() <= 44.175278000000105) || (p.getX() >= 14.732776999999942 && p.getY() >= 44.29555499999998 && p.getX() <= 15.251389000000074 && p.getY() <= 44.700271999999984) || (p.getX() >= 14.335278000000017 && p.getY() >= 44.47332800000004 && p.getX() <= 14.534443000000069 && p.getY() <= 44.71027400000008) || (p.getX() >= 14.65925199999998 && p.getY() >= 44.702499000000046 && p.getX() <= 14.865275999999994 && p.getY() <= 44.85333300000013) || (p.getX() >= 14.27333299999998 && p.getY() >= 44.60582700000009 && p.getX() <= 14.531386999999995 && p.getY() <= 45.17582700000003) || (p.getX() >= 14.428055000000027 && p.getY() >= 44.93999500000013 && p.getX() <= 14.81555400000002 && p.getY() <= 45.248329000000126) || (p.getX() >= 13.496387000000084 && p.getY() >= 42.94382499999995 && p.getX() <= 19.426109000000054 && p.getY() <= 46.53582799999992)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Croatia.data"));
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
