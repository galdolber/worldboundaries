package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class AmericanSamoa {

  public static boolean test(Point p) {
    if ((p.getX() >= -170.560822 && p.getY() >= -14.298612999999932 && p.getX() <= -170.53668199999996 && p.getY() <= -14.282501000000025) || (p.getX() >= -170.82611099999994 && p.getY() >= -14.375554999999965 && p.getX() <= -170.56002799999993 && p.getY() <= -14.252778999999975) || (p.getX() >= -169.53723099999996 && p.getY() >= -14.276669000000028 && p.getX() <= -169.43832399999994 && p.getY() <= -14.22639099999992) || (p.getX() >= -169.64474499999997 && p.getY() >= -14.190833999999938 && p.getX() <= -169.62194799999997 && p.getY() <= -14.166944999999998) || (p.getX() >= -169.694153 && p.getY() >= -14.191943999999978 && p.getX() <= -169.65975999999995 && p.getY() <= -14.166388999999924)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/AmericanSamoa.data"));
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
