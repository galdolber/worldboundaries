package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Spain {

  public static boolean test(Point p) {
    if ((p.getX() >= -18.17055899999997 && p.getY() >= 27.637497 && p.getX() <= -17.881389999999953 && p.getY() <= 27.84971999999993) || (p.getX() >= -15.823056999999949 && p.getY() >= 27.731109999999944 && p.getX() <= -15.365001999999947 && p.getY() <= 28.15610900000013) || (p.getX() >= -17.332499999999982 && p.getY() >= 28.009998000000053 && p.getX() <= -17.089168999999913 && p.getY() <= 28.20638700000012) || (p.getX() >= -16.912780999999995 && p.getY() >= 27.984165000000075 && p.getX() <= -16.156390999999985 && p.getY() <= 28.57222000000013) || (p.getX() >= -14.444167999999992 && p.getY() >= 28.044441000000063 && p.getX() <= -13.819444999999916 && p.getY() <= 28.756106999999982) || (p.getX() >= -18.003612999999916 && p.getY() >= 28.45249900000005 && p.getX() <= -17.716392999999982 && p.getY() <= 28.849442000000007) || (p.getX() >= -13.852221999999928 && p.getY() >= 28.83777600000008 && p.getX() <= -13.420278999999937 && p.getY() <= 29.24305299999997) || (p.getX() >= -2.971111000000008 && p.getY() >= 35.26305400000007 && p.getX() <= -2.914721999999927 && p.getY() <= 35.32916300000005) || (p.getX() >= -5.395556999999997 && p.getY() >= 35.841660000000104 && p.getX() <= -5.319444999999916 && p.getY() <= 35.9180530000001) || (p.getX() >= -3.051110999999992 && p.getY() >= 35.90777600000007 && p.getX() <= -3.027222999999935 && p.getY() <= 35.92499499999997) || (p.getX() >= -6.973055999999985 && p.getY() >= 37.16221600000006 && p.getX() <= -6.921389999999917 && p.getY() <= 37.212219000000005) || (p.getX() >= 1.38305500000007 && p.getY() >= 38.643325999999945 && p.getX() <= 1.58805499999994 && p.getY() <= 38.74110400000012) || (p.getX() >= 1.211944000000017 && p.getY() >= 38.830826 && p.getX() <= 1.615000000000066 && p.getY() <= 39.11833200000007) || (p.getX() >= 2.364166000000012 && p.getY() >= 39.26305400000001 && p.getX() <= 3.480278000000055 && p.getY() <= 39.921944000000046) || (p.getX() >= 3.796944000000053 && p.getY() >= 39.80638900000008 && p.getX() <= 4.316944000000092 && p.getY() <= 40.05888400000004) || (p.getX() >= -9.293335000000011 && p.getY() >= 36.00610400000005 && p.getX() <= 3.319166999999993 && p.getY() <= 43.772217000000005)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Spain.data"));
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
