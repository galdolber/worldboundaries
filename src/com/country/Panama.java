package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Panama {

  public static boolean test(Point p) {
    if ((p.getX() >= -81.81916799999999 && p.getY() >= 7.225555000000043 && p.getX() <= -81.77862499999996 && p.getY() <= 7.291111000000058) || (p.getX() >= -81.24972499999996 && p.getY() >= 7.480833000000075 && p.getX() <= -81.033615 && p.getY() <= 7.57916599999993) || (p.getX() >= -81.87695299999997 && p.getY() >= 7.318055000000129 && p.getX() <= -81.58917199999996 && p.getY() <= 7.63916300000011) || (p.getX() >= -81.14917000000001 && p.getY() >= 7.714721999999995 && p.getX() <= -81.10111999999992 && p.getY() <= 7.758887999999956) || (p.getX() >= -81.1744539999999 && p.getY() >= 7.816388000000074 && p.getX() <= -81.16056800000001 && p.getY() <= 7.841665999999975) || (p.getX() >= -82.36639400000001 && p.getY() >= 8.086943000000076 && p.getX() <= -82.31611599999997 && p.getY() <= 8.13666500000005) || (p.getX() >= -82.31390399999998 && p.getY() >= 8.188889000000131 && p.getX() <= -82.20945699999999 && p.getY() <= 8.228054000000043) || (p.getX() >= -78.00389100000001 && p.getY() >= 8.240000000000066 && p.getX() <= -77.98695399999998 && p.getY() <= 8.251665000000003) || (p.getX() >= -82.40362500000003 && p.getY() >= 8.207222000000002 && p.getX() <= -82.3141779999999 && p.getY() <= 8.292500000000075) || (p.getX() >= -79.12472500000001 && p.getY() >= 8.200832000000105 && p.getX() <= -79.05584699999997 && p.getY() <= 8.309166000000005) || (p.getX() >= -79.11944599999998 && p.getY() >= 8.368331999999953 && p.getX() <= -79.07223499999992 && p.getY() <= 8.419998000000021) || (p.getX() >= -78.96334799999998 && p.getY() >= 8.270555000000115 && p.getX() <= -78.82972699999998 && p.getY() <= 8.46388800000011) || (p.getX() >= -82.05111699999992 && p.getY() >= 9.124722000000077 && p.getX() <= -82.004456 && p.getY() <= 9.177500000000125) || (p.getX() >= -82.22944599999998 && p.getY() >= 9.334165999999923 && p.getX() <= -82.22195399999998 && p.getY() <= 9.352498999999966) || (p.getX() >= -82.20834400000001 && p.getY() >= 9.271944000000076 && p.getX() <= -82.07583599999998 && p.getY() <= 9.353611) || (p.getX() >= -82.32501199999997 && p.getY() >= 9.33000000000004 && p.getX() <= -82.22834799999993 && p.getY() <= 9.435276000000044) || (p.getX() >= -83.03028899999993 && p.getY() >= 7.206111000000078 && p.getX() <= -77.198334 && p.getY() <= 9.620277000000044)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Panama.data"));
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
