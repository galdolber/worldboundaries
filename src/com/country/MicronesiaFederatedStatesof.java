package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class MicronesiaFederatedStatesof {

  public static boolean test(Point p) {
    if ((p.getX() >= 153.65997300000004 && p.getY() >= 5.286110000000065 && p.getX() <= 153.71414200000004 && p.getY() <= 5.319720999999959) || (p.getX() >= 162.90414400000006 && p.getY() >= 5.261666000000105 && p.getX() <= 163.04330400000003 && p.getY() <= 5.378332) || (p.getX() >= 143.05468800000003 && p.getY() >= 6.706388000000004 && p.getX() <= 143.06720000000007 && p.getY() <= 6.719443000000012) || (p.getX() >= 149.31329300000004 && p.getY() >= 6.696942999999976 && p.getX() <= 149.32775900000013 && p.getY() <= 6.721944000000008) || (p.getX() >= 157.93191500000012 && p.getY() >= 6.717220999999995 && p.getX() <= 157.9524540000001 && p.getY() <= 6.734444000000053) || (p.getX() >= 157.96414200000004 && p.getY() >= 6.737776999999937 && p.getX() <= 157.99273700000012 && p.getY() <= 6.751944000000094) || (p.getX() >= 158.11941500000012 && p.getY() >= 6.780555000000049 && p.getX() <= 158.33551 && p.getY() <= 6.978610000000117) || (p.getX() >= 158.24078399999996 && p.getY() >= 6.981388000000095 && p.getX() <= 158.26220699999996 && p.getY() <= 7.000278000000037) || (p.getX() >= 151.836365 && p.getY() >= 7.316666999999995 && p.getX() <= 151.86663799999997 && p.getY() <= 7.370832000000064) || (p.getX() >= 149.194702 && p.getY() >= 7.36055500000009 && p.getX() <= 149.20495600000004 && p.getY() <= 7.376388000000077) || (p.getX() >= 149.17776500000002 && p.getY() >= 7.371665000000064 && p.getX() <= 149.19134500000007 && p.getY() <= 7.384443999999974) || (p.getX() >= 143.91079700000012 && p.getY() >= 7.376944000000037 && p.getX() <= 143.92163100000002 && p.getY() <= 7.391388000000006) || (p.getX() >= 151.56720000000018 && p.getY() >= 7.326110999999969 && p.getX() <= 151.65081799999996 && p.getY() <= 7.396666999999979) || (p.getX() >= 151.85495000000003 && p.getY() >= 7.419721000000038 && p.getX() <= 151.91720599999996 && p.getY() <= 7.463888000000111) || (p.getX() >= 146.17968800000003 && p.getY() >= 7.502776999999924 && p.getX() <= 146.19470200000012 && p.getY() <= 7.515555000000063) || (p.getX() >= 149.65942400000017 && p.getY() >= 8.574720000000127 && p.getX() <= 149.69164999999998 && p.getY() <= 8.61888700000003) || (p.getX() >= 150.36663799999997 && p.getY() >= 8.61277600000011 && p.getX() <= 150.378021 && p.getY() <= 8.628885000000025) || (p.getX() >= 150.11773700000012 && p.getY() >= 8.976386999999988 && p.getX() <= 150.13552900000002 && p.getY() <= 8.992496000000017) || (p.getX() >= 138.05831900000007 && p.getY() >= 9.411943000000008 && p.getX() <= 138.2199710000001 && p.getY() <= 9.58944100000008)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/MicronesiaFederatedStatesof.data"));
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
