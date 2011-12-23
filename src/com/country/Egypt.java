package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Egypt {

  public static boolean test(Point p) {
    if ((p.getX() >= 33.957222 && p.getY() >= 26.70499800000005 && p.getX() <= 34.00471499999992 && p.getY() <= 26.788609000000008) || (p.getX() >= 33.916382000000056 && p.getY() >= 27.442219000000023 && p.getX() <= 34.0422210000001 && p.getY() <= 27.535831000000087) || (p.getX() >= 32.04083300000002 && p.getY() >= 31.141665999999987 && p.getX() <= 32.05082700000003 && p.getY() <= 31.15805400000005) || (p.getX() >= 33.26666299999994 && p.getY() >= 31.136387000000013 && p.getX() <= 33.47666200000009 && p.getY() <= 31.216942000000127) || (p.getX() >= 32.97666200000003 && p.getY() >= 31.168331000000023 && p.getX() <= 33.26138300000008 && p.getY() <= 31.23416500000013) || (p.getX() >= 24.706664999999987 && p.getY() >= 21.99416400000013 && p.getX() <= 36.89833099999999 && p.getY() <= 31.646941999999967)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Egypt.data"));
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
