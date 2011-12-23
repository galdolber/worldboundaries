package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class CapeVerde {

  public static boolean test(Point p) {
    if ((p.getX() >= -24.52528000000001 && p.getY() >= 14.811110000000042 && p.getX() <= -24.295559000000026 && p.getY() <= 15.047499000000016) || (p.getX() >= -23.792503000000007 && p.getY() >= 14.896111000000133 && p.getX() <= -23.44472499999995 && p.getY() <= 15.29499800000002) || (p.getX() >= -22.962222999999938 && p.getY() >= 15.9780540000001 && p.getX() <= -22.665836000000013 && p.getY() <= 16.235275000000115) || (p.getX() >= -24.43222399999996 && p.getY() >= 16.482777 && p.getX() <= -24.023613000000008 && p.getY() <= 16.684718999999973) || (p.getX() >= -25.093334000000027 && p.getY() >= 16.779719999999998 && p.getX() <= -24.876113999999973 && p.getY() <= 16.921386999999925) || (p.getX() >= -25.360558000000022 && p.getY() >= 16.913329999999974 && p.getX() <= -24.97250400000001 && p.getY() <= 17.193054000000075)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/CapeVerde.data"));
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
