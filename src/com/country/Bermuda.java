package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Bermuda {

  public static boolean test(Point p) {
    if ((p.getX() >= -64.87611400000003 && p.getY() >= 32.276381999999955 && p.getX() <= -64.83805799999993 && p.getY() <= 32.31472000000002) || (p.getX() >= -64.68583699999994 && p.getY() >= 32.35443900000013 && p.getX() <= -64.63862599999999 && p.getY() <= 32.37082700000002) || (p.getX() >= -64.858269 && p.getY() >= 32.26055100000002 && p.getX() <= -64.67167699999999 && p.getY() <= 32.38221700000008)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Bermuda.data"));
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
