package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class IranIslamicRepublicof {

  public static boolean test(Point p) {
    if ((p.getX() >= 53.90360299999992 && p.getY() >= 26.48360399999996 && p.getX() <= 54.05138400000004 && p.getY() <= 26.56166500000012) || (p.getX() >= 53.151657 && p.getY() >= 26.785275000000073 && p.getX() <= 53.31805400000013 && p.getY() <= 26.85666300000014) || (p.getX() >= 56.31721500000009 && p.getY() >= 26.821663000000058 && p.getX() <= 56.41110200000014 && p.getY() <= 26.892494000000056) || (p.getX() >= 55.62638099999998 && p.getY() >= 26.784443000000124 && p.getX() <= 55.73499300000003 && p.getY() <= 26.930827999999963) || (p.getX() >= 55.274994000000106 && p.getY() >= 26.54027600000001 && p.getX() <= 56.29027600000012 && p.getY() <= 27.000552999999968) || (p.getX() >= 56.43249500000008 && p.getY() >= 27.03721999999999 && p.getX() <= 56.50916300000006 && p.getY() <= 27.10860800000012) || (p.getX() >= 50.289436000000016 && p.getY() >= 29.20694000000003 && p.getX() <= 50.339432000000095 && p.getY() <= 29.27999899999997) || (p.getX() >= 44.03415700000005 && p.getY() >= 25.07527499999992 && p.getX() <= 63.341934000000094 && p.getY() <= 39.78054000000003)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/IranIslamicRepublicof.data"));
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
