package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Argentina {

  public static boolean test(Point p) {
    if ((p.getX() >= -68.64311199999997 && p.getY() >= -54.89139599999999 && p.getX() <= -68.55723599999999 && p.getY() <= -54.80477100000002) || (p.getX() >= -64.75584399999997 && p.getY() >= -54.90722699999998 && p.getX() <= -63.81361400000003 && p.getY() <= -54.713615) || (p.getX() >= -68.63583399999999 && p.getY() >= -55.05167399999999 && p.getX() <= -65.13806199999999 && p.getY() <= -52.641509999999926) || (p.getX() >= -62.099167000000016 && p.getY() >= -39.24361399999999 && p.getX() <= -61.858894000000014 && p.getY() <= -39.086113000000005) || (p.getX() >= -62.13278200000001 && p.getY() >= -39.067504999999926 && p.getX() <= -61.962783999999935 && p.getY() <= -39.002501999999936) || (p.getX() >= -73.58361799999993 && p.getY() >= -52.381393 && p.getX() <= -53.649726999999984 && p.getY() <= -21.780520999999965)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Argentina.data"));
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
