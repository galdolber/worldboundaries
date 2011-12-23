package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Cuba {

  public static boolean test(Point p) {
    if ((p.getX() >= -78.46055599999998 && p.getY() >= 20.511664999999997 && p.getX() <= -78.32362399999998 && p.getY() <= 20.60972199999992) || (p.getX() >= -78.41445899999991 && p.getY() >= 20.636107999999975 && p.getX() <= -78.377228 && p.getY() <= 20.676941000000056) || (p.getX() >= -78.54750099999995 && p.getY() >= 20.689999000000117 && p.getX() <= -78.43250999999992 && p.getY() <= 20.731667000000016) || (p.getX() >= -78.82556199999999 && p.getY() >= 20.70610800000003 && p.getX() <= -78.75306699999993 && p.getY() <= 20.758053000000075) || (p.getX() >= -75.579453 && p.getY() >= 20.728611000000114 && p.getX() <= -75.48445100000004 && p.getY() <= 20.795276999999945) || (p.getX() >= -78.96583599999997 && p.getY() >= 20.77111100000008 && p.getX() <= -78.84750399999997 && p.getY() <= 20.83583100000004) || (p.getX() >= -79.077515 && p.getY() >= 20.837497999999982 && p.getX() <= -78.96722399999999 && p.getY() <= 20.89916599999998) || (p.getX() >= -79.225571 && p.getY() >= 20.89499699999999 && p.getX() <= -79.07501200000002 && p.getY() <= 21.012218000000015) || (p.getX() >= -79.451126 && p.getY() >= 21.103611000000114 && p.getX() <= -79.39889499999998 && p.getY() <= 21.12722000000008) || (p.getX() >= -79.38417099999992 && p.getY() >= 21.06305300000008 && p.getX() <= -79.29389999999995 && p.getY() <= 21.128052000000025) || (p.getX() >= -81.56167599999996 && p.getY() >= 21.599163000000036 && p.getX() <= -81.36639400000001 && p.getY() <= 21.713333000000038) || (p.getX() >= -83.19306899999998 && p.getY() >= 21.432776999999987 && p.getX() <= -82.54305999999998 && p.getY() <= 21.94277599999998) || (p.getX() >= -77.94723499999996 && p.getY() >= 21.908607000000075 && p.getX() <= -77.62112400000002 && p.getY() <= 22.10277600000012) || (p.getX() >= -78.04611199999998 && p.getY() >= 22.095553999999936 && p.getX() <= -77.82833900000003 && p.getY() <= 22.285275000000073) || (p.getX() >= -77.85000599999995 && p.getY() >= 22.168052999999983 && p.getX() <= -77.77166699999992 && p.getY() <= 22.294719999999927) || (p.getX() >= -78.311401 && p.getY() >= 22.261944000000028 && p.getX() <= -78.01945499999998 && p.getY() <= 22.43722200000002) || (p.getX() >= -78.69667099999998 && p.getY() >= 22.412498000000028 && p.getX() <= -78.27612299999998 && p.getY() <= 22.558887000000027) || (p.getX() >= -79.05445899999995 && p.getY() >= 22.63721800000013 && p.getX() <= -78.952515 && p.getY() <= 22.66944099999995) || (p.getX() >= -79.63250699999996 && p.getY() >= 22.61416600000007 && p.getX() <= -79.323059 && p.getY() <= 22.81305300000008) || (p.getX() >= -79.958618 && p.getY() >= 22.920555000000093 && p.getX() <= -79.87806699999999 && p.getY() <= 22.96527500000008) || (p.getX() >= -80.34945700000003 && p.getY() >= 22.956387000000063 && p.getX() <= -80.22944599999995 && p.getY() <= 23.011107999999975) || (p.getX() >= -80.083618 && p.getY() >= 23.02333100000004 && p.getX() <= -80.04917899999992 && p.getY() <= 23.074443999999968) || (p.getX() >= -80.22416699999997 && p.getY() >= 23.056389000000024 && p.getX() <= -80.14639299999993 && p.getY() <= 23.121943999999928) || (p.getX() >= -80.973618 && p.getY() >= 23.106110000000054 && p.getX() <= -80.79722600000001 && p.getY() <= 23.179442999999992) || (p.getX() >= -84.95333900000003 && p.getY() >= 19.821940999999924 && p.getX() <= -74.13084399999997 && p.getY() <= 23.194442999999975) || (p.getX() >= -80.57972699999998 && p.getY() >= 23.16471899999993 && p.getX() <= -80.48779299999995 && p.getY() <= 23.20416599999993)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Cuba.data"));
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
