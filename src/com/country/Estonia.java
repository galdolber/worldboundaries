package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Estonia {

  public static boolean test(Point p) {
    if ((p.getX() >= 23.938606000000046 && p.getY() >= 58.097771000000016 && p.getX() <= 24.025275999999963 && p.getY() <= 58.157767999999976) || (p.getX() >= 21.83193999999997 && p.getY() >= 57.9083250000001 && p.getX() <= 23.332775000000023 && p.getY() <= 58.61776700000007) || (p.getX() >= 23.057774000000048 && p.getY() >= 58.529716000000064 && p.getX() <= 23.399162000000047 && p.getY() <= 58.679160999999965) || (p.getX() >= 23.110828000000023 && p.getY() >= 58.961104999999975 && p.getX() <= 23.392220000000123 && p.getY() <= 59.0422210000001) || (p.getX() >= 22.042220999999984 && p.getY() >= 58.686653000000085 && p.getX() <= 23.048053999999976 && p.getY() <= 59.06860400000005) || (p.getX() >= 23.407219 && p.getY() >= 57.522217000000126 && p.getX() <= 28.19527400000004 && p.getY() <= 59.66832700000009)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Estonia.data"));
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
