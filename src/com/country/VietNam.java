package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class VietNam {

  public static boolean test(Point p) {
    if ((p.getX() >= 106.555252 && p.getY() >= 8.647221000000116 && p.getX() <= 106.66638200000001 && p.getY() <= 8.764740000000074) || (p.getX() >= 103.462486 && p.getY() >= 9.278331999999978 && p.getX() <= 103.4994200000001 && p.getY() <= 9.314444000000094) || (p.getX() >= 106.08805800000003 && p.getY() >= 9.528886999999996 && p.getX() <= 106.29329699999994 && p.getY() <= 9.754437999999992) || (p.getX() >= 106.4185790000001 && p.getY() >= 9.82472000000007 && p.getX() <= 106.54692100000013 && p.getY() <= 9.935831000000064) || (p.getX() >= 106.58690600000001 && p.getY() >= 10.239441 && p.getX() <= 106.66441299999997 && p.getY() <= 10.257221000000072) || (p.getX() >= 106.511642 && p.getY() >= 10.220831000000087 && p.getX() <= 106.75443299999995 && p.getY() <= 10.296387000000095) || (p.getX() >= 103.837196 && p.getY() >= 10.080275999999968 && p.getX() <= 104.08690599999994 && p.getY() <= 10.439432000000012) || (p.getX() >= 107.06273699999997 && p.getY() >= 10.321110000000033 && p.getX() <= 107.20636000000007 && p.getY() <= 10.464165000000037) || (p.getX() >= 106.8743970000001 && p.getY() >= 10.370551999999918 && p.getX() <= 106.97914100000014 && p.getY() <= 10.518102999999996) || (p.getX() >= 108.92552200000013 && p.getY() >= 10.503331999999943 && p.getX() <= 108.971359 && p.getY() <= 10.552498000000128) || (p.getX() >= 106.85051700000008 && p.getY() >= 10.519444000000078 && p.getX() <= 106.93108400000013 && p.getY() <= 10.637220000000012) || (p.getX() >= 106.74968700000004 && p.getY() >= 10.402221999999997 && p.getX() <= 106.87413000000004 && p.getY() <= 10.663170000000036) || (p.getX() >= 109.244141 && p.getY() >= 12.181942000000047 && p.getX() <= 109.34387200000008 && p.getY() <= 12.228053999999927) || (p.getX() >= 109.38498700000008 && p.getY() >= 12.349164999999914 && p.getX() <= 109.395538 && p.getY() <= 12.366941000000054) || (p.getX() >= 107.66121699999997 && p.getY() >= 16.34638599999994 && p.getX() <= 107.92249300000015 && p.getY() <= 16.572613000000047) || (p.getX() >= 107.71164700000008 && p.getY() >= 20.12694200000004 && p.getX() <= 107.73831200000012 && p.getY() <= 20.14499699999999) || (p.getX() >= 107.333054 && p.getY() >= 20.79749700000013 && p.getX() <= 107.38275100000003 && p.getY() <= 20.84749599999992) || (p.getX() >= 106.90721100000013 && p.getY() >= 20.703884000000016 && p.getX() <= 107.10331700000006 && p.getY() <= 20.85777300000012) || (p.getX() >= 106.71914700000002 && p.getY() >= 20.852219000000105 && p.getX() <= 106.75277700000008 && p.getY() <= 20.87443900000005) || (p.getX() >= 106.760239 && p.getY() >= 20.786110000000008 && p.getX() <= 106.8936 && p.getY() <= 20.924717000000044) || (p.getX() >= 106.92746699999998 && p.getY() >= 20.93416200000013 && p.getX() <= 106.94802900000008 && p.getY() <= 20.946663000000058) || (p.getX() >= 107.46470599999992 && p.getY() >= 20.821384000000023 && p.getX() <= 107.55835000000013 && p.getY() <= 20.966106000000135) || (p.getX() >= 106.88804600000003 && p.getY() >= 20.952773999999977 && p.getX() <= 106.91665600000003 && p.getY() <= 20.96666300000004) || (p.getX() >= 107.45471199999992 && p.getY() >= 20.94221900000008 && p.getX() <= 107.47831700000013 && p.getY() <= 20.97332800000009) || (p.getX() >= 106.67942800000009 && p.getY() >= 20.950549999999964 && p.getX() <= 106.75499000000009 && p.getY() <= 20.981106000000068) || (p.getX() >= 107.73664900000003 && p.getY() >= 20.934441000000103 && p.getX() <= 107.790817 && p.getY() <= 21.019164999999987) || (p.getX() >= 107.39498900000007 && p.getY() >= 20.892773000000037 && p.getX() <= 107.55956300000014 && p.getY() <= 21.038052000000047) || (p.getX() >= 107.80609100000004 && p.getY() >= 20.981106000000068 && p.getX() <= 107.86248800000003 && p.getY() <= 21.03916500000008) || (p.getX() >= 107.56109599999996 && p.getY() >= 20.97304900000012 && p.getX() <= 107.62074300000013 && p.getY() <= 21.117836000000068) || (p.getX() >= 107.50804100000009 && p.getY() >= 21.128052000000025 && p.getX() <= 107.53221100000013 && p.getY() <= 21.146942000000134) || (p.getX() >= 107.37525900000009 && p.getY() >= 21.045830000000024 && p.getX() <= 107.60581999999992 && p.getY() <= 21.271419999999974) || (p.getX() >= 107.7083280000001 && p.getY() >= 21.30360800000011 && p.getX() <= 107.81887800000003 && p.getY() <= 21.36166400000008) || (p.getX() >= 107.82859799999994 && p.getY() >= 21.364161999999965 && p.getX() <= 107.996643 && p.getY() <= 21.401386000000056) || (p.getX() >= 102.14074700000008 && p.getY() >= 8.558609000000047 && p.getX() <= 109.46637699999997 && p.getY() <= 23.334721000000055)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/VietNam.data"));
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