package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class FrenchSouthernandAntarcticLands {

  public static boolean test(Point p) {
    if ((p.getX() >= 69.76193200000006 && p.getY() >= -49.67861199999993 && p.getX() <= 69.81721500000003 && p.getY() <= -49.645003999999965) || (p.getX() >= 69.83554100000003 && p.getY() >= -49.575278999999966 && p.getX() <= 70.01527400000009 && p.getY() <= -49.5005569999999) || (p.getX() >= 69.82527200000004 && p.getY() >= -49.47944599999994 && p.getX() <= 69.90443399999998 && p.getY() <= -49.42222599999997) || (p.getX() >= 68.64444000000003 && p.getY() >= -49.36417399999999 && p.getX() <= 68.80166600000001 && p.getY() <= -49.31528500000002) || (p.getX() >= 69.53305100000006 && p.getY() >= -49.20833600000003 && p.getX() <= 69.67832900000002 && p.getY() <= -49.151115) || (p.getX() >= 69.20304899999996 && p.getY() >= -49.09944899999999 && p.getX() <= 69.408051 && p.getY() <= -48.88417099999998) || (p.getX() >= 69.13888500000002 && p.getY() >= -48.98861699999998 && p.getX() <= 69.2458190000001 && p.getY() <= -48.85611699999993) || (p.getX() >= 69.40193199999999 && p.getY() >= -48.88694799999996 && p.getX() <= 69.51721199999997 && p.getY() <= -48.82695000000001) || (p.getX() >= 68.73916600000007 && p.getY() >= -49.72500599999995 && p.getX() <= 70.56860400000011 && p.getY() <= -48.65138999999999) || (p.getX() >= 68.60611000000011 && p.getY() >= -48.655281 && p.getX() <= 68.68499800000006 && p.getY() <= -48.62805899999995) || (p.getX() >= 68.77415500000012 && p.getY() >= -48.61639399999996 && p.getX() <= 68.83166499999999 && p.getY() <= -48.569167999999934) || (p.getX() >= 52.08833299999992 && p.getY() >= -46.46361499999995 && p.getX() <= 52.31082900000007 && p.getY() <= -46.370834) || (p.getX() >= 51.65083299999998 && p.getY() >= -46.456673000000016 && p.getX() <= 51.864166000000125 && p.getY() <= -46.326393) || (p.getX() >= 50.17416399999996 && p.getY() >= -46.13195000000002 && p.getX() <= 50.298050000000046 && p.getY() <= -46.04611199999994) || (p.getX() >= 77.49971000000009 && p.getY() >= -38.739723000000026 && p.getX() <= 77.53833000000007 && p.getY() <= -38.70389599999999) || (p.getX() >= 77.48165899999998 && p.getY() >= -37.90778399999999 && p.getX() <= 77.58888199999996 && p.getY() <= -37.818610999999976) || (p.getX() >= 42.72110700000013 && p.getY() >= -17.07611499999996 && p.getX() <= 42.763885000000016 && p.getY() <= -17.05111299999993)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/FrenchSouthernandAntarcticLands.data"));
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
