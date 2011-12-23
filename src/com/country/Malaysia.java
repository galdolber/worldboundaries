package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Malaysia {

  public static boolean test(Point p) {
    if ((p.getX() >= 104.09470399999998 && p.getY() >= 2.276665999999977 && p.getX() <= 104.15524300000003 && p.getY() <= 2.320555000000127) || (p.getX() >= 111.29332 && p.getY() >= 2.358889000000033 && p.getX() <= 111.41387900000012 && p.getY() <= 2.781388000000106) || (p.getX() >= 104.12329100000004 && p.getY() >= 2.705277000000024 && p.getX() <= 104.22162600000013 && p.getY() <= 2.895000000000095) || (p.getX() >= 117.63889299999994 && p.getY() >= 4.168335999999954 && p.getX() <= 117.90355700000008 && p.getY() <= 4.260592999999972) || (p.getX() >= 118.63997700000003 && p.getY() >= 4.441110000000037 && p.getX() <= 118.76277200000015 && p.getY() <= 4.499721000000079) || (p.getX() >= 118.49136400000008 && p.getY() >= 4.527777000000128 && p.getX() <= 118.51805100000013 && p.getY() <= 4.554443000000049) || (p.getX() >= 118.34387200000003 && p.getY() >= 4.598055000000045 && p.getX() <= 118.59832800000017 && p.getY() <= 4.689165000000003) || (p.getX() >= 115.15833300000008 && p.getY() >= 5.249443000000042 && p.getX() <= 115.26304600000003 && p.getY() <= 5.384722000000068) || (p.getX() >= 100.17968800000001 && p.getY() >= 5.252777000000037 && p.getX() <= 100.32469200000014 && p.getY() <= 5.466944000000069) || (p.getX() >= 115.62776199999996 && p.getY() >= 5.705832000000044 && p.getX() <= 115.67221099999993 && p.getY() <= 5.735831999999959) || (p.getX() >= 118.15833299999997 && p.getY() >= 5.812220999999965 && p.getX() <= 118.23499300000003 && p.getY() <= 5.855832000000078) || (p.getX() >= 116.01416000000006 && p.getY() >= 6.002500000000055 && p.getX() <= 116.06609300000001 && p.getY() <= 6.04111000000006) || (p.getX() >= 115.59274300000016 && p.getY() >= 6.194442999999978 && p.getX() <= 115.61943099999996 && p.getY() <= 6.22111000000001) || (p.getX() >= 99.64082300000013 && p.getY() >= 6.156665999999973 && p.getX() <= 99.92301899999997 && p.getY() <= 6.464153000000067) || (p.getX() >= 100.126862 && p.getY() >= 1.269528000000037 && p.getX() <= 104.293297 && p.getY() <= 6.711110000000076) || (p.getX() >= 117.33527400000014 && p.getY() >= 6.625554000000136 && p.getX() <= 117.51554900000009 && p.getY() <= 6.762500000000045) || (p.getX() >= 109.54665399999992 && p.getY() >= 0.852778000000058 && p.getX() <= 119.27581799999997 && p.getY() <= 7.023610000000019) || (p.getX() >= 117.051651 && p.getY() >= 7.101110000000062 && p.getX() <= 117.28333300000008 && p.getY() <= 7.352777000000117) || (p.getX() >= 116.85164600000007 && p.getY() >= 7.18388699999997 && p.getX() <= 117.020538 && p.getY() <= 7.353610000000117)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Malaysia.data"));
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
