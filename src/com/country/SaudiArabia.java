package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SaudiArabia {

  public static boolean test(Point p) {
    if ((p.getX() >= 41.75360899999998 && p.getY() >= 16.562774999999988 && p.getX() <= 42.17999299999997 && p.getY() <= 16.87611000000004) || (p.getX() >= 41.83416000000005 && p.getY() >= 16.75083200000006 && p.getX() <= 41.99221799999999 && p.getY() <= 17.01083) || (p.getX() >= 37.03443900000008 && p.getY() >= 24.95582999999993 && p.getX() <= 37.08055100000013 && p.getY() <= 25.000274999999927) || (p.getX() >= 35.72638699999999 && p.getY() >= 27.07694199999997 && p.getX() <= 35.7577740000001 && p.getY() <= 27.128608999999926) || (p.getX() >= 49.4502720000001 && p.getY() >= 27.28582800000004 && p.getX() <= 49.63861100000008 && p.getY() <= 27.36527300000012) || (p.getX() >= 34.49221800000004 && p.getY() >= 27.908053999999996 && p.getX() <= 34.61721800000009 && p.getY() <= 28.011665000000107) || (p.getX() >= 34.57138800000007 && p.getY() >= 15.616942999999935 && p.getX() <= 55.666106999999954 && p.getY() <= 32.15494200000012)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SaudiArabia.data"));
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
