package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class NorthernMarianaIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= 145.11996500000006 && p.getY() >= 14.105276000000003 && p.getX() <= 145.28970300000003 && p.getY() <= 14.19833200000005) || (p.getX() >= 145.52359000000013 && p.getY() >= 14.827776000000028 && p.getX() <= 145.57025100000007 && p.getY() <= 14.850274999999954) || (p.getX() >= 145.57220500000017 && p.getY() >= 14.908054000000106 && p.getX() <= 145.66275000000007 && p.getY() <= 15.08388700000006) || (p.getX() >= 145.67691000000002 && p.getY() >= 15.08721900000006 && p.getX() <= 145.82080100000007 && p.getY() <= 15.269165000000044) || (p.getX() >= 145.62551900000017 && p.getY() >= 16.33472100000006 && p.getX() <= 145.71606400000007 && p.getY() <= 16.378608999999983) || (p.getX() >= 145.770264 && p.getY() >= 16.675551999999982 && p.getX() <= 145.80304000000012 && p.getY() <= 16.708607000000086) || (p.getX() >= 145.8366390000001 && p.getY() >= 17.285831000000144 && p.getX() <= 145.868835 && p.getY() <= 17.317219000000023) || (p.getX() >= 145.82302900000002 && p.getY() >= 17.56693999999993 && p.getX() <= 145.87078900000003 && p.getY() <= 17.60888700000004) || (p.getX() >= 145.71664400000006 && p.getY() >= 18.041943000000003 && p.getX() <= 145.8366390000001 && p.getY() <= 18.17555200000004) || (p.getX() >= 145.64331100000004 && p.getY() >= 18.72082900000004 && p.getX() <= 145.71051000000014 && p.getY() <= 18.811107999999994) || (p.getX() >= 145.37829600000006 && p.getY() >= 19.65277500000008 && p.getX() <= 145.41720600000005 && p.getY() <= 19.690273000000047) || (p.getX() >= 145.22552499999995 && p.getY() >= 20.00972000000013 && p.getX() <= 145.27359000000013 && p.getY() <= 20.05221900000004) || (p.getX() >= 144.89859000000013 && p.getY() >= 20.517220000000066 && p.getX() <= 144.9349670000001 && p.getY() <= 20.556384999999977)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/NorthernMarianaIslands.data"));
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
