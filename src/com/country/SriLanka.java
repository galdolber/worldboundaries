package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SriLanka {

  public static boolean test(Point p) {
    if ((p.getX() >= 81.70166 && p.getY() >= 7.674166000000071 && p.getX() <= 81.71804800000001 && p.getY() <= 7.704998999999987) || (p.getX() >= 81.72331200000002 && p.getY() >= 7.477220999999986 && p.getX() <= 81.82720899999998 && p.getY() <= 7.738610000000108) || (p.getX() >= 79.69303900000011 && p.getY() >= 8.986664000000133 && p.getX() <= 79.9124910000001 && p.getY() <= 9.10333100000014) || (p.getX() >= 79.6519320000001 && p.getY() >= 9.475554000000043 && p.getX() <= 79.72720300000015 && p.getY() <= 9.555832000000123) || (p.getX() >= 79.8452610000001 && p.getY() >= 9.614164000000017 && p.getX() <= 79.97831700000006 && p.getY() <= 9.75999800000011) || (p.getX() >= 79.6974790000001 && p.getY() >= 5.917777000000058 && p.getX() <= 81.89166299999994 && p.getY() <= 9.828331000000048)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SriLanka.data"));
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
