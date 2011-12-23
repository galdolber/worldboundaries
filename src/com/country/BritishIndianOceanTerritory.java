package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class BritishIndianOceanTerritory {

  public static boolean test(Point p) {
    if ((p.getX() >= 72.35693400000001 && p.getY() >= -7.436666000000002 && p.getX() <= 72.49443100000006 && p.getY() <= -7.230277999999998) || (p.getX() >= 71.34332300000005 && p.getY() >= -6.658888999999988 && p.getX() <= 71.36526500000014 && p.getY() <= -6.651666999999918) || (p.getX() >= 71.25860600000004 && p.getY() >= -6.392222000000004 && p.getX() <= 71.27026400000011 && p.getY() <= -6.366666000000009) || (p.getX() >= 71.33804300000003 && p.getY() >= -6.208888999999999 && p.getX() <= 71.36303699999996 && p.getY() <= -6.174166999999954) || (p.getX() >= 71.75999500000012 && p.getY() >= -5.441666999999995 && p.getX() <= 71.78248600000012 && p.getY() <= -5.429722000000027) || (p.getX() >= 72.20694000000015 && p.getY() >= -5.363334000000009 && p.getX() <= 72.21638500000006 && p.getY() <= -5.348055999999929) || (p.getX() >= 72.2202610000001 && p.getY() >= -5.335555999999997 && p.getX() <= 72.2335970000001 && p.getY() <= -5.314165999999943) || (p.getX() >= 71.73664900000011 && p.getY() >= -5.293888999999979 && p.getX() <= 71.75109900000001 && p.getY() <= -5.265555999999947) || (p.getX() >= 71.86303700000008 && p.getY() >= -5.257777999999973 && p.getX() <= 71.882202 && p.getY() <= -5.24972200000002)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/BritishIndianOceanTerritory.data"));
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
