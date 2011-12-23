package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Thailand {

  public static boolean test(Point p) {
    if ((p.getX() >= 99.159988 && p.getY() >= 6.528610000000072 && p.getX() <= 99.25944500000014 && p.getY() <= 6.575000000000045) || (p.getX() >= 99.59498600000006 && p.getY() >= 6.491943000000106 && p.getX() <= 99.7038730000001 && p.getY() <= 6.70299499999993) || (p.getX() >= 100.52081300000009 && p.getY() >= 7.152777000000071 && p.getX() <= 100.5419240000001 && p.getY() <= 7.174166000000014) || (p.getX() >= 99.36886600000014 && p.getY() >= 7.194165000000055 && p.getX() <= 99.41914400000007 && p.getY() <= 7.270555000000115) || (p.getX() >= 99.022217 && p.getY() >= 7.463055000000111 && p.getX() <= 99.11276199999996 && p.getY() <= 7.638611000000083) || (p.getX() >= 99.040543 && p.getY() >= 7.590555000000109 && p.getX() <= 99.12719700000008 && p.getY() <= 7.673332000000016) || (p.getX() >= 98.41804500000013 && p.getY() >= 7.927776000000108 && p.getX() <= 98.43830900000006 && p.getY() <= 7.943609999999978) || (p.getX() >= 98.526093 && p.getY() >= 7.897778000000017 && p.getX() <= 98.61192300000009 && p.getY() <= 8.121385999999916) || (p.getX() >= 98.27192699999993 && p.getY() >= 7.755832999999996 && p.getX() <= 98.44108599999998 && p.getY() <= 8.186943000000042) || (p.getX() >= 98.568329 && p.getY() >= 8.083887000000004 && p.getX() <= 98.63554399999998 && p.getY() <= 8.18916500000006) || (p.getX() >= 98.241089 && p.getY() >= 9.029998999999918 && p.getX() <= 98.324432 && p.getY() <= 9.158053999999993) || (p.getX() >= 97.83305400000013 && p.getY() >= 9.379719000000136 && p.getX() <= 97.88108800000003 && p.getY() <= 9.432219999999973) || (p.getX() >= 97.84610000000004 && p.getY() >= 9.42527600000011 && p.getX() <= 97.90664700000002 && p.getY() <= 9.475554000000043) || (p.getX() >= 99.66220100000005 && p.getY() >= 9.506109000000096 && p.getX() <= 99.70999100000004 && p.getY() <= 9.54226100000011) || (p.getX() >= 98.45721400000002 && p.getY() >= 9.57249800000011 && p.getX() <= 98.469711 && p.getY() <= 9.585554000000002) || (p.getX() >= 99.93220500000012 && p.getY() >= 9.41361000000012 && p.getX() <= 100.09220900000008 && p.getY() <= 9.588610000000074) || (p.getX() >= 99.67359900000001 && p.getY() >= 9.604718999999932 && p.getX() <= 99.689148 && p.getY() <= 9.629163999999946) || (p.getX() >= 98.38081399999999 && p.getY() >= 9.706108000000086 && p.getX() <= 98.42082200000003 && p.getY() <= 9.770831999999984) || (p.getX() >= 99.96914700000013 && p.getY() >= 9.682219999999916 && p.getX() <= 100.0833280000001 && p.getY() <= 9.79694400000011) || (p.getX() >= 102.52857999999996 && p.getY() >= 11.563052999999968 && p.getX() <= 102.610519 && p.getY() <= 11.754395999999986) || (p.getX() >= 102.25054899999996 && p.getY() >= 11.952496999999994 && p.getX() <= 102.44773900000008 && p.getY() <= 12.151388000000113) || (p.getX() >= 102.23526000000005 && p.getY() >= 12.283332999999972 && p.getX() <= 102.24471300000009 && p.getY() <= 12.299442000000056) || (p.getX() >= 100.66943400000001 && p.getY() >= 12.923332000000016 && p.getX() <= 100.69246699999991 && p.getY() <= 12.953609000000142) || (p.getX() >= 100.80497700000006 && p.getY() >= 13.129164000000005 && p.getX() <= 100.8227690000001 && p.getY() <= 13.180276999999933) || (p.getX() >= 97.345261 && p.getY() >= 5.631109999999978 && p.getX() <= 105.63942700000013 && p.getY() <= 20.455273000000087)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Thailand.data"));
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
