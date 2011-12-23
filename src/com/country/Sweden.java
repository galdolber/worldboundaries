package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Sweden {

  public static boolean test(Point p) {
    if ((p.getX() >= 16.3916660000001 && p.getY() >= 56.20888500000012 && p.getX() <= 17.124165000000005 && p.getY() <= 57.35916100000002) || (p.getX() >= 18.10999700000008 && p.getY() >= 56.90999600000004 && p.getX() <= 19.033333000000084 && p.getY() <= 57.92277500000006) || (p.getX() >= 19.034443000000067 && p.getY() >= 57.839722000000044 && p.getX() <= 19.335552000000007 && p.getY() <= 57.97666200000003) || (p.getX() >= 11.497221000000025 && p.getY() >= 57.93083200000001 && p.getX() <= 11.742222000000083 && p.getY() <= 58.04916400000008) || (p.getX() >= 16.778053000000114 && p.getY() >= 58.09666400000009 && p.getX() <= 16.81888600000002 && p.getY() <= 58.1244430000001) || (p.getX() >= 11.401110000000015 && p.getY() >= 58.06610900000004 && p.getX() <= 11.815832 && p.getY() <= 58.28665900000009) || (p.getX() >= 19.184166000000065 && p.getY() >= 58.33721899999994 && p.getX() <= 19.33110800000003 && p.getY() <= 58.391388000000006) || (p.getX() >= 17.639163999999937 && p.getY() >= 58.90444200000013 && p.getX() <= 17.721664000000033 && p.getY() <= 59.05471800000009) || (p.getX() >= 18.357219999999984 && p.getY() >= 59.01944000000009 && p.getX() <= 18.49166500000007 && p.getY() <= 59.12055200000003) || (p.getX() >= 18.389442000000088 && p.getY() >= 59.22305300000011 && p.getX() <= 18.610275000000115 && p.getY() <= 59.29276999999996) || (p.getX() >= 17.605553000000043 && p.getY() >= 59.3086090000001 && p.getX() <= 17.789165000000025 && p.getY() <= 59.42610900000011) || (p.getX() >= 17.518887000000063 && p.getY() >= 59.27777100000009 && p.getX() <= 17.817497000000003 && p.getY() <= 59.42860400000012) || (p.getX() >= 17.070000000000107 && p.getY() >= 59.37332900000007 && p.getX() <= 17.31805399999996 && p.getY() <= 59.45999899999998) || (p.getX() >= 18.519997000000046 && p.getY() >= 59.44749499999995 && p.getX() <= 18.74694400000004 && p.getY() <= 59.55666400000007) || (p.getX() >= 18.37166600000012 && p.getY() >= 60.3052750000001 && p.getX() <= 18.572777000000087 && p.getY() <= 60.50555400000013) || (p.getX() >= 17.36722200000014 && p.getY() >= 62.36305199999998 && p.getX() <= 17.54249999999996 && p.getY() <= 62.47444200000001) || (p.getX() >= 18.019165000000044 && p.getY() >= 62.66999800000008 && p.getX() <= 18.156943999999957 && p.getY() <= 62.74555200000009) || (p.getX() >= 20.837497999999982 && p.getY() >= 63.74916100000007 && p.getX() <= 20.92860800000011 && p.getY() <= 63.79610400000013) || (p.getX() >= 11.106943 && p.getY() >= 55.339165000000094 && p.getX() <= 24.16861 && p.getY() <= 69.06030299999992)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Sweden.data"));
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
