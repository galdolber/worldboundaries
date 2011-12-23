package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Mexico {

  public static boolean test(Point p) {
    if ((p.getX() >= -114.80306999999992 && p.getY() >= 18.318054000000128 && p.getX() <= -114.72057299999993 && p.getY() <= 18.354164000000083) || (p.getX() >= -87.37695299999997 && p.getY() >= 18.399165999999923 && p.getX() <= -87.32167099999992 && p.getY() <= 18.50305200000008) || (p.getX() >= -87.265015 && p.getY() >= 18.627776999999924 && p.getX() <= -87.24500999999998 && p.getY() <= 18.73388700000004) || (p.getX() >= -91.84529099999997 && p.getY() >= 18.638054000000125 && p.getX() <= -91.521118 && p.getY() <= 18.788609000000008) || (p.getX() >= -111.07362399999994 && p.getY() >= 18.71611000000001 && p.getX() <= -110.90972899999991 && p.getY() <= 18.867496000000127) || (p.getX() >= -110.83862299999998 && p.getY() >= 19.271111000000015 && p.getX() <= -110.78861999999992 && p.getY() <= 19.341663000000096) || (p.getX() >= -87.02278100000001 && p.getY() >= 20.25555399999996 && p.getX() <= -86.73278800000003 && p.getY() <= 20.590831999999978) || (p.getX() >= -86.75279199999994 && p.getY() >= 21.193054000000014 && p.getX() <= -86.70140099999996 && p.getY() <= 21.286387999999988) || (p.getX() >= -106.27806099999998 && p.getY() >= 21.25416600000005 && p.getX() <= -106.19306899999992 && p.getY() <= 21.34111000000013) || (p.getX() >= -106.51139799999994 && p.getY() >= 21.41972000000004 && p.getX() <= -106.32613400000001 && p.getY() <= 21.512218000000075) || (p.getX() >= -106.64584399999997 && p.getY() >= 21.509163000000115 && p.getX() <= -106.49778699999997 && p.getY() <= 21.715832000000034) || (p.getX() >= -106.68112199999999 && p.getY() >= 21.73999800000007 && p.getX() <= -106.643623 && p.getY() <= 21.81638700000008) || (p.getX() >= -97.68583699999992 && p.getY() >= 21.735554000000093 && p.getX() <= -97.60028099999994 && p.getY() <= 21.85999700000008) || (p.getX() >= -97.83084100000002 && p.getY() >= 22.681109999999993 && p.getX() <= -97.777237 && p.getY() <= 22.77416600000004) || (p.getX() >= -97.78250099999997 && p.getY() >= 22.78944400000012 && p.getX() <= -97.758621 && p.getY() <= 22.8341640000001) || (p.getX() >= -109.925003 && p.getY() >= 24.131942999999975 && p.getX() <= -109.781403 && p.getY() <= 24.36888900000008) || (p.getX() >= -111.67028799999997 && p.getY() >= 24.35027700000001 && p.getX() <= -111.49474299999997 && p.getY() <= 24.392776000000083) || (p.getX() >= -112.01667799999997 && p.getY() >= 24.32833099999999 && p.getX() <= -111.69473299999994 && p.getY() <= 24.54388800000009) || (p.getX() >= -110.40390000000002 && p.getY() >= 24.400555 && p.getX() <= -110.29917899999998 && p.getY() <= 24.58721900000012) || (p.getX() >= -110.70889299999992 && p.getY() >= 24.881943000000035 && p.getX() <= -110.530006 && p.getY() <= 25.093886999999995) || (p.getX() >= -112.25279199999994 && p.getY() >= 24.518055000000004 && p.getX() <= -112.04028299999992 && p.getY() <= 25.28110900000007) || (p.getX() >= -109.01112399999994 && p.getY() >= 25.37055199999997 && p.getX() <= -108.78584299999994 && p.getY() <= 25.44527400000004) || (p.getX() >= -110.825287 && p.getY() >= 25.594719 && p.getX() <= -110.78861999999992 && p.getY() <= 25.695831000000112) || (p.getX() >= -111.22334299999994 && p.getY() >= 25.802775999999994 && p.getX() <= -111.08112299999992 && p.getY() <= 26.074718000000015) || (p.getX() >= -110.03444699999993 && p.getY() >= 27.017498000000103 && p.getX() <= -109.94889799999994 && p.getY() <= 27.09277700000013) || (p.getX() >= -110.60278299999992 && p.getY() >= 27.30138799999997 && p.getX() <= -110.52584799999994 && p.getY() <= 27.415276000000063) || (p.getX() >= -114.32417299999997 && p.getY() >= 27.734444000000114 && p.getX() <= -114.21972700000003 && p.getY() <= 27.835552000000064) || (p.getX() >= -115.32668299999993 && p.getY() >= 28.024719000000005 && p.getX() <= -115.14306599999996 && p.getY() <= 28.37055200000009) || (p.getX() >= -112.885834 && p.getY() >= 28.589165000000094 && p.getX() <= -112.75306699999992 && p.getY() <= 28.68388700000014) || (p.getX() >= -112.60362199999992 && p.getY() >= 28.66999800000008 && p.getX() <= -112.53945899999997 && p.getY() <= 28.739998000000128) || (p.getX() >= -118.40416699999997 && p.getY() >= 28.881107000000043 && p.getX() <= -118.23722799999999 && p.getY() <= 29.19527400000004) || (p.getX() >= -112.56417799999991 && p.getY() >= 28.756385999999964 && p.getX() <= -112.200287 && p.getY() <= 29.23749900000001) || (p.getX() >= -113.600571 && p.getY() >= 29.01777599999997 && p.getX() <= -113.12445100000002 && p.getY() <= 29.587497999999982) || (p.getX() >= -114.79305999999993 && p.getY() >= 31.6852760000001 && p.getX() <= -114.65084799999994 && p.getY() <= 31.80138799999997) || (p.getX() >= -117.12695299999997 && p.getY() >= 14.550547000000108 && p.getX() <= -86.77278099999995 && p.getY() <= 32.718456)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Mexico.data"));
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