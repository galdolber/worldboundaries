package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class GuineaBissau {

  public static boolean test(Point p) {
    if ((p.getX() >= -15.983056999999915 && p.getY() >= 11.043054999999924 && p.getX() <= -15.877500999999995 && p.getY() <= 11.194999999999936) || (p.getX() >= -16.06194699999992 && p.getY() >= 11.066110999999978 && p.getX() <= -15.96888899999999 && p.getY() <= 11.202499000000104) || (p.getX() >= -16.244166999999948 && p.getY() >= 11.024721 && p.getX() <= -16.048614999999927 && p.getY() <= 11.20694400000002) || (p.getX() >= -15.906388999999931 && p.getY() >= 11.195555000000011 && p.getX() <= -15.820834999999988 && p.getY() <= 11.302499999999952) || (p.getX() >= -15.778611999999953 && p.getY() >= 11.163886999999932 && p.getX() <= -15.655279000000007 && p.getY() <= 11.306389000000024) || (p.getX() >= -16.284446999999943 && p.getY() >= 11.209721000000116 && p.getX() <= -16.143332999999927 && p.getY() <= 11.308332000000064) || (p.getX() >= -15.743056999999965 && p.getY() >= 11.434166000000005 && p.getX() <= -15.651112000000012 && p.getY() <= 11.502222000000131) || (p.getX() >= -16.30055600000003 && p.getY() >= 11.436388000000022 && p.getX() <= -16.161391999999978 && p.getY() <= 11.519998999999984) || (p.getX() >= -16.42250100000001 && p.getY() >= 11.4772210000001 && p.getX() <= -16.23889200000002 && p.getY() <= 11.577498999999932) || (p.getX() >= -16.065001999999993 && p.getY() >= 11.41722100000004 && p.getX() <= -15.903056999999931 && p.getY() <= 11.594165999999973) || (p.getX() >= -15.633611999999973 && p.getY() >= 11.505554000000132 && p.getX() <= -15.470834999999964 && p.getY() <= 11.633055000000011) || (p.getX() >= -16.165557999999976 && p.getY() >= 11.753611000000092 && p.getX() <= -15.97833399999996 && p.getY() <= 11.905831999999975) || (p.getX() >= -16.316112999999973 && p.getY() >= 11.833887000000004 && p.getX() <= -16.181945999999925 && p.getY() <= 11.971666000000084) || (p.getX() >= -16.717769999999973 && p.getY() >= 10.92277699999994 && p.getX() <= -13.643057 && p.getY() <= 12.684721000000025)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/GuineaBissau.data"));
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
