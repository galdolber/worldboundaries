package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Tuvalu {

  public static boolean test(Point p) {
    if ((p.getX() >= 179.19815100000002 && p.getY() >= -8.56129199999998 && p.getX() <= 179.23228499999993 && p.getY() <= -8.46244299999995) || (p.getX() >= 178.35580400000003 && p.getY() >= -8.066665999999998 && p.getX() <= 178.37496899999996 && p.getY() <= -8.027499999999918) || (p.getX() >= 178.39025900000013 && p.getY() >= -8.01666599999993 && p.getX() <= 178.40801999999996 && p.getY() <= -7.991387999999915) || (p.getX() >= 178.68609600000013 && p.getY() >= -7.484165999999959 && p.getX() <= 178.703308 && p.getY() <= -7.464445000000012) || (p.getX() >= 177.141663 && p.getY() >= -7.191943999999921 && p.getX() <= 177.15887500000005 && p.getY() <= -7.173610999999937) || (p.getX() >= 176.295258 && p.getY() >= -6.288332999999966 && p.getX() <= 176.31442300000012 && p.getY() <= -6.257500999999934) || (p.getX() >= 177.27804600000013 && p.getY() >= -6.114444999999932 && p.getX() <= 177.30886799999996 && p.getY() <= -6.089444000000015) || (p.getX() >= 176.12524400000007 && p.getY() >= -5.693888999999956 && p.getX() <= 176.13970900000004 && p.getY() <= -5.675000000000011) || (p.getX() >= 176.0663760000001 && p.getY() >= -5.668055999999922 && p.getX() <= 176.08358799999996 && p.getY() <= -5.657777999999951)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Tuvalu.data"));
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
