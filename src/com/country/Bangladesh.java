package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Bangladesh {

  public static boolean test(Point p) {
    if ((p.getX() >= 91.84387200000003 && p.getY() >= 21.47332799999998 && p.getX() <= 91.98220800000009 && p.getY() <= 21.755275999999924) || (p.getX() >= 90.46666 && p.getY() >= 21.802776000000108 && p.getX() <= 90.49552900000015 && p.getY() <= 21.822772999999984) || (p.getX() >= 90.41276600000015 && p.getY() >= 21.819442999999975 && p.getX() <= 90.45526100000006 && p.getY() <= 21.850273000000016) || (p.getX() >= 89.04136700000004 && p.getY() >= 21.71388200000001 && p.getX() <= 89.14860500000003 && p.getY() <= 21.914719000000048) || (p.getX() >= 90.73887600000013 && p.getY() >= 21.891662999999998 && p.getX() <= 90.762207 && p.getY() <= 21.92249700000002) || (p.getX() >= 91.8227690000001 && p.getY() >= 21.72166100000004 && p.getX() <= 91.88777200000003 && p.getY() <= 21.928050999999986) || (p.getX() >= 90.63053900000013 && p.getY() >= 21.90527300000008 && p.getX() <= 90.669708 && p.getY() <= 21.95555100000001) || (p.getX() >= 90.67526199999996 && p.getY() >= 21.940830000000062 && p.getX() <= 90.70277399999992 && p.getY() <= 21.972771000000023) || (p.getX() >= 90.50082400000002 && p.getY() >= 21.854716999999997 && p.getX() <= 90.60304300000008 && p.getY() <= 21.98138399999999) || (p.getX() >= 90.31164600000004 && p.getY() >= 21.837497999999925 && p.getX() <= 90.39444000000015 && p.getY() <= 21.99777200000005) || (p.getX() >= 90.393326 && p.getY() >= 21.898884000000063 && p.getX() <= 90.48498500000004 && p.getY() <= 22.042220999999984) || (p.getX() >= 90.33915700000013 && p.getY() >= 21.96638500000012 && p.getX() <= 90.3880460000001 && p.getY() <= 22.050552000000096) || (p.getX() >= 90.47943100000008 && p.getY() >= 21.988049000000046 && p.getX() <= 90.61219800000008 && p.getY() <= 22.166107000000068) || (p.getX() >= 90.51138300000001 && p.getY() >= 22.160553000000046 && p.getX() <= 90.52916000000009 && p.getY() <= 22.179439999999943) || (p.getX() >= 90.9147030000001 && p.getY() >= 22.112774000000115 && p.getX() <= 90.95721400000009 && p.getY() <= 22.209438000000087) || (p.getX() >= 90.97082500000003 && p.getY() >= 22.18027500000011 && p.getX() <= 90.996643 && p.getY() <= 22.259163000000115) || (p.getX() >= 90.93609600000002 && p.getY() >= 22.21999400000004 && p.getX() <= 90.99247700000012 && p.getY() <= 22.35777300000001) || (p.getX() >= 90.9835970000001 && p.getY() >= 22.36805300000003 && p.getX() <= 91.01304600000003 && p.getY() <= 22.414162000000037) || (p.getX() >= 90.59832800000004 && p.getY() >= 22.308331000000067 && p.getX() <= 90.66110200000008 && p.getY() <= 22.45221700000013) || (p.getX() >= 91.01805100000013 && p.getY() >= 22.404442000000127 && p.getX() <= 91.05442800000009 && p.getY() <= 22.45360599999992) || (p.getX() >= 91.16526800000008 && p.getY() >= 22.391105999999976 && p.getX() <= 91.21331800000009 && p.getY() <= 22.461384000000123) || (p.getX() >= 90.9877620000001 && p.getY() >= 22.424164000000015 && p.getX() <= 91.01220700000009 && p.getY() <= 22.476383) || (p.getX() >= 90.645538 && p.getY() >= 22.4247170000001 && p.getX() <= 90.66720599999991 && p.getY() <= 22.478606999999958) || (p.getX() >= 91.02720599999996 && p.getY() >= 22.083885000000063 && p.getX() <= 91.17997700000012 && p.getY() <= 22.525829000000044) || (p.getX() >= 91.40277100000003 && p.getY() >= 22.345551 && p.getX() <= 91.56887800000008 && p.getY() <= 22.624718000000087) || (p.getX() >= 91.30470300000007 && p.getY() >= 22.60888700000009 && p.getX() <= 91.34137000000003 && p.getY() <= 22.636383000000137) || (p.getX() >= 90.55081200000012 && p.getY() >= 21.987216999999987 && p.getX() <= 90.87886000000003 && p.getY() <= 22.783333000000027) || (p.getX() >= 90.45471199999992 && p.getY() >= 22.68582900000001 && p.getX() <= 90.69386300000002 && p.getY() <= 22.882496000000003) || (p.getX() >= 90.50416600000013 && p.getY() >= 22.912216000000058 && p.getX() <= 90.66609200000009 && p.getY() <= 23.04027599999995) || (p.getX() >= 90.45999100000013 && p.getY() >= 23.006942999999975 && p.getX() <= 90.514435 && p.getY() <= 23.062496000000124) || (p.getX() >= 90.5208280000001 && p.getY() >= 23.046943999999936 && p.getX() <= 90.54776000000005 && p.getY() <= 23.065273000000047) || (p.getX() >= 90.42109700000003 && p.getY() >= 23.301941 && p.getX() <= 90.59027100000003 && p.getY() <= 23.384720000000076) || (p.getX() >= 90.65026900000008 && p.getY() >= 23.481937000000126 && p.getX() <= 90.69274900000005 && p.getY() <= 23.507500000000107) || (p.getX() >= 90.56330900000013 && p.getY() >= 23.564442000000096 && p.getX() <= 90.58749399999992 && p.getY() <= 23.58527400000014) || (p.getX() >= 88.04331999999998 && p.getY() >= 20.738048999999933 && p.getX() <= 92.66934200000003 && p.getY() <= 26.631939000000045)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Bangladesh.data"));
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
