package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Denmark {

  public static boolean test(Point p) {
    if ((p.getX() >= 10.989891000000114 && p.getY() >= 54.61888900000008 && p.getX() <= 11.86222100000009 && p.getY() <= 54.957397000000014) || (p.getX() >= 11.70861100000002 && p.getY() >= 54.56166100000007 && p.getX() <= 12.169443000000058 && p.getY() <= 54.961662000000096) || (p.getX() >= 10.184166000000062 && p.getY() >= 54.82138799999996 && p.getX() <= 10.440832 && p.getY() <= 54.97805) || (p.getX() >= 12.115833000000125 && p.getY() >= 54.88027200000005 && p.getX() <= 12.55749899999995 && p.getY() <= 55.03527100000014) || (p.getX() >= 10.498610000000042 && p.getY() >= 54.94610599999999 && p.getX() <= 10.677221000000031 && p.getY() <= 55.043884000000105) || (p.getX() >= 9.630554000000076 && p.getY() >= 54.85805499999998 && p.getX() <= 10.073055000000068 && p.getY() <= 55.08444199999997) || (p.getX() >= 10.65194299999996 && p.getY() >= 54.72499800000014 && p.getX() <= 10.959720999999943 && p.getY() <= 55.16165900000009) || (p.getX() >= 14.677775999999994 && p.getY() >= 54.994720000000086 && p.getX() <= 15.149999999999975 && p.getY() <= 55.30555000000004) || (p.getX() >= 8.356943000000001 && p.getY() >= 55.33388500000007 && p.getX() <= 8.473330999999973 && p.getY() <= 55.46804800000013) || (p.getX() >= 9.67555399999992 && p.getY() >= 55.028610000000015 && p.getX() <= 10.83472100000006 && p.getY() <= 55.61916400000007) || (p.getX() >= 12.511664999999994 && p.getY() >= 55.54943800000001 && p.getX() <= 12.678609999999937 && p.getY() <= 55.69610599999999) || (p.getX() >= 10.51166500000005 && p.getY() >= 55.75750000000011 && p.getX() <= 10.666943000000115 && p.getY() <= 55.998054999999965) || (p.getX() >= 10.8736100000001 && p.getY() >= 54.96638500000012 && p.getX() <= 12.619719999999916 && p.getY() <= 56.128882999999966) || (p.getX() >= 11.50305400000002 && p.getY() >= 56.66944100000012 && p.getX() <= 11.64861100000013 && p.getY() <= 56.723328000000095) || (p.getX() >= 8.509164999999996 && p.getY() >= 56.674164000000125 && p.getX() <= 8.92472100000009 && p.getY() <= 56.955551000000014) || (p.getX() >= 8.087221 && p.getY() >= 54.8086090000001 && p.getX() <= 10.96305499999994 && p.getY() <= 57.07173200000011) || (p.getX() >= 10.854443000000115 && p.getY() >= 57.221663999999976 && p.getX() <= 11.196942999999976 && p.getY() <= 57.331664999999994) || (p.getX() >= 8.234999000000016 && p.getY() >= 56.58222200000006 && p.getX() <= 10.645953000000134 && p.getY() <= 57.746666000000005)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Denmark.data"));
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
