package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Turkey {

  public static boolean test(Point p) {
    if ((p.getX() >= 25.97499500000009 && p.getY() >= 39.77999900000003 && p.getX() <= 26.086388 && p.getY() <= 39.84276600000004) || (p.getX() >= 25.663883000000112 && p.getY() >= 40.09304000000009 && p.getX() <= 26.013611000000022 && p.getY() <= 40.24109600000003) || (p.getX() >= 27.52638200000001 && p.getY() >= 40.57193799999999 && p.getX() <= 27.73638200000005 && p.getY() <= 40.658875000000016) || (p.getX() >= 26.067219000000023 && p.getY() >= 35.81749700000012 && p.getX() <= 44.82276200000001 && p.getY() <= 42.09304000000009) || (p.getX() >= 26.044720000000098 && p.getY() >= 40.04527300000007 && p.getX() <= 29.10916099999997 && p.getY() <= 42.10999300000015)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Turkey.data"));
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
