package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class FrenchPolynesia {

  public static boolean test(Point p) {
    if ((p.getX() >= -143.50946 && p.getY() >= -27.91555399999993 && p.getX() <= -143.47998 && p.getY() <= -27.88999899999999) || (p.getX() >= -144.34750399999996 && p.getY() >= -27.643889999999946 && p.getX() <= -144.28500399999996 && p.getY() <= -27.55333300000001) || (p.getX() >= -147.72167999999996 && p.getY() >= -23.882503999999983 && p.getX() <= -147.646149 && p.getY() <= -23.852779) || (p.getX() >= -149.526672 && p.getY() >= -23.403053 && p.getX() <= -149.44583099999994 && p.getY() <= -23.358611999999997) || (p.getX() >= -135.06308 && p.getY() >= -23.16500499999995 && p.getX() <= -135.02667199999996 && p.getY() <= -23.140282000000013) || (p.getX() >= -135.01556400000004 && p.getY() >= -23.140555999999947 && p.getX() <= -134.94140599999997 && p.getY() <= -23.084998999999925) || (p.getX() >= -152.87972999999997 && p.getY() >= -22.656386999999935 && p.getX() <= -152.82641599999997 && p.getY() <= -22.604445999999935) || (p.getX() >= -151.39669799999996 && p.getY() >= -22.51972599999999 && p.getX() <= -151.350006 && p.getY() <= -22.42499899999996) || (p.getX() >= -138.79916399999996 && p.getY() >= -22.286387999999988 && p.getX() <= -138.70639000000003 && p.getY() <= -22.19972200000001) || (p.getX() >= -140.676147 && p.getY() >= -21.72083699999996 && p.getX() <= -140.60443099999992 && p.getY() <= -21.648890999999992) || (p.getX() >= -144.965027 && p.getY() >= -19.929169 && p.getX() <= -144.95111099999994 && p.getY() <= -19.89528299999995) || (p.getX() >= -150.67001300000004 && p.getY() >= -17.66333800000001 && p.getX() <= -150.64224199999998 && p.getY() <= -17.63833199999999) || (p.getX() >= -149.64169299999995 && p.getY() >= -17.870834000000002 && p.getX() <= -149.14639299999996 && p.getY() <= -17.49360999999999) || (p.getX() >= -149.94168099999993 && p.getY() >= -17.574448000000018 && p.getX() <= -149.78250099999994 && p.getY() <= -17.466662999999983) || (p.getX() >= -149.54556299999993 && p.getY() >= -16.976947999999993 && p.getX() <= -149.53225699999996 && p.getY() <= -16.96194799999995) || (p.getX() >= -149.594452 && p.getY() >= -16.981112999999993 && p.getX() <= -149.57083100000003 && p.getY() <= -16.954448999999954) || (p.getX() >= -151.04003899999998 && p.getY() >= -16.825831999999934 && p.getX() <= -150.96917699999997 && p.getY() <= -16.762504999999976) || (p.getX() >= -151.497772 && p.getY() >= -16.904449 && p.getX() <= -151.348602 && p.getY() <= -16.739165999999955) || (p.getX() >= -151.05248999999998 && p.getY() >= -16.769725999999935 && p.getX() <= -151.00723299999996 && p.getY() <= -16.693054000000018) || (p.getX() >= -151.54364000000004 && p.getY() >= -16.67833300000001 && p.getX() <= -151.436157 && p.getY() <= -16.580832999999984) || (p.getX() >= -151.786987 && p.getY() >= -16.53611799999993 && p.getX() <= -151.74136399999998 && p.getY() <= -16.473330999999973) || (p.getX() >= -146.39669799999993 && p.getY() >= -16.16638899999998 && p.getX() <= -146.32723999999996 && p.getY() <= -16.104172000000005) || (p.getX() >= -148.28613300000004 && p.getY() >= -15.849998000000028 && p.getX() <= -148.230835 && p.getY() <= -15.797503000000006) || (p.getX() >= -144.648376 && p.getY() >= -15.75166699999994 && p.getX() <= -144.616669 && p.getY() <= -15.708054999999945) || (p.getX() >= -138.69833399999993 && p.getY() >= -10.550279999999988 && p.getX() <= -138.611969 && p.getY() <= -10.428333000000007) || (p.getX() >= -139.14529400000004 && p.getY() >= -10.016391999999996 && p.getX() <= -139.04531899999995 && p.getY() <= -9.893891999999994) || (p.getX() >= -139.17254599999995 && p.getY() >= -9.859999000000016 && p.getX() <= -138.809479 && p.getY() <= -9.694722999999954) || (p.getX() >= -140.147827 && p.getY() >= -9.451945999999964 && p.getX() <= -140.03668200000004 && p.getY() <= -9.324724000000003) || (p.getX() >= -139.62890599999997 && p.getY() >= -8.956389999999999 && p.getX() <= -139.502838 && p.getY() <= -8.861391000000026) || (p.getX() >= -140.25613399999997 && p.getY() >= -8.956389999999999 && p.getX() <= -140.01196300000004 && p.getY() <= -8.777502000000027) || (p.getX() >= -140.723907 && p.getY() >= -8.044167999999956 && p.getX() <= -140.63696300000004 && p.getY() <= -7.954446000000019) || (p.getX() >= -140.60748299999995 && p.getY() >= -7.923889999999972 && p.getX() <= -140.55892899999998 && p.getY() <= -7.888332999999989)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/FrenchPolynesia.data"));
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