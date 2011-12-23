package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class SolomonIslands {

  public static boolean test(Point p) {
    if ((p.getX() >= 166.74023399999996 && p.getY() >= -11.697499999999993 && p.getX() <= 166.93273900000005 && p.getY() <= -11.573333999999988) || (p.getX() >= 159.9607850000001 && p.getY() >= -11.845833000000027 && p.getX() <= 160.527466 && p.getY() <= -11.467221999999992) || (p.getX() >= 159.77664200000004 && p.getY() >= -11.326110999999967 && p.getX() <= 159.85385099999996 && p.getY() <= -11.284444999999948) || (p.getX() >= 166.48718300000007 && p.getY() >= -11.368331999999953 && p.getX() <= 166.58053600000017 && p.getY() <= -11.271112000000016) || (p.getX() >= 162.46414200000004 && p.getY() >= -10.856667000000016 && p.getX() <= 162.50109900000007 && p.getY() <= -10.807501000000002) || (p.getX() >= 165.777466 && p.getY() >= -10.873609999999983 && p.getX() <= 166.16580199999996 && p.getY() <= -10.665001000000018) || (p.getX() >= 161.71301300000002 && p.getY() >= -10.29499999999996 && p.getX() <= 161.77331500000003 && p.getY() <= -10.213332999999976) || (p.getX() >= 161.27941899999996 && p.getY() >= -10.846111000000008 && p.getX() <= 162.39221200000006 && p.getY() <= -10.20333299999993) || (p.getX() >= 167.1869200000001 && p.getY() >= -9.963612000000012 && p.getX() <= 167.20996100000013 && p.getY() <= -9.941389000000015) || (p.getX() >= 167.10717799999998 && p.getY() >= -9.88138799999996 && p.getX() <= 167.13415500000008 && p.getY() <= -9.866665000000012) || (p.getX() >= 167.08941700000014 && p.getY() >= -9.853053999999927 && p.getX() <= 167.11077899999998 && p.getY() <= -9.840833999999973) || (p.getX() >= 161.9283140000001 && p.getY() >= -9.853053999999927 && p.getX() <= 161.98385599999995 && p.getY() <= -9.68972199999996) || (p.getX() >= 161.381348 && p.getY() >= -9.471945000000003 && p.getX() <= 161.38970900000015 && p.getY() <= -9.454444999999964) || (p.getX() >= 161.34719800000002 && p.getY() >= -9.799167999999952 && p.getX() <= 161.57189900000003 && p.getY() <= -9.338887999999995) || (p.getX() >= 159.60052500000006 && p.getY() >= -9.930000000000009 && p.getX() <= 160.83245800000006 && p.getY() <= -9.254445999999971) || (p.getX() >= 159.80191000000013 && p.getY() >= -9.174443999999994 && p.getX() <= 159.84634399999993 && p.getY() <= -9.110276999999996) || (p.getX() >= 160.21246299999996 && p.getY() >= -9.196111999999973 && p.getX() <= 160.41110200000003 && p.getY() <= -9.060277999999926) || (p.getX() >= 159.16802999999993 && p.getY() >= -9.139444000000026 && p.getX() <= 159.23718300000007 && p.getY() <= -9.025556999999992) || (p.getX() >= 160.07607999999993 && p.getY() >= -9.131942999999922 && p.getX() <= 160.29940799999997 && p.getY() <= -8.996666000000005) || (p.getX() >= 159.03109700000005 && p.getY() >= -9.119719999999973 && p.getX() <= 159.19134500000007 && p.getY() <= -8.99305499999997) || (p.getX() >= 160.06219499999997 && p.getY() >= -9.023055999999997 && p.getX() <= 160.11441000000002 && p.getY() <= -8.94389000000001) || (p.getX() >= 160.00610399999994 && p.getY() >= -8.916111 && p.getX() <= 160.05053699999996 && p.getY() <= -8.880277999999976) || (p.getX() >= 161.00942999999998 && p.getY() >= -8.772500999999977 && p.getX() <= 161.06359899999998 && p.getY() <= -8.737777999999935) || (p.getX() >= 157.443848 && p.getY() >= -8.800833000000011 && p.getX() <= 157.65164200000004 && p.getY() <= -8.691943999999978) || (p.getX() >= 158.14971900000012 && p.getY() >= -8.837499999999977 && p.getX() <= 158.253876 && p.getY() <= -8.681111999999985) || (p.getX() >= 157.87411499999996 && p.getY() >= -8.77305599999994 && p.getX() <= 158.140808 && p.getY() <= -8.507501999999931) || (p.getX() >= 157.198578 && p.getY() >= -8.734443999999996 && p.getX() <= 157.40969800000016 && p.getY() <= -8.410000000000025) || (p.getX() >= 159.53109699999993 && p.getY() >= -8.548333999999954 && p.getX() <= 159.701904 && p.getY() <= -8.377499) || (p.getX() >= 162.72524999999996 && p.getY() >= -8.388333999999986 && p.getX() <= 162.76165800000012 && p.getY() <= -8.373333000000002) || (p.getX() >= 160.57498200000006 && p.getY() >= -9.634999999999993 && p.getX() <= 161.39108300000007 && p.getY() <= -8.30610999999999) || (p.getX() >= 157.02053799999996 && p.getY() >= -8.342777000000012 && p.getX() <= 157.15136700000002 && p.getY() <= -8.19027699999998) || (p.getX() >= 157.09246800000003 && p.getY() >= -8.292777999999998 && p.getX() <= 157.20745799999997 && p.getY() <= -8.163054999999986) || (p.getX() >= 156.77777100000003 && p.getY() >= -8.121666000000005 && p.getX() <= 156.84692400000017 && p.getY() <= -8.055278999999928) || (p.getX() >= 157.21441700000003 && p.getY() >= -8.62083199999995 && p.getX() <= 157.90719600000014 && p.getY() <= -7.965555999999992) || (p.getX() >= 156.524994 && p.getY() >= -8.205277999999964 && p.getX() <= 156.619415 && p.getY() <= -7.943889000000013) || (p.getX() >= 156.944977 && p.getY() >= -8.151666999999975 && p.getX() <= 157.20413199999996 && p.getY() <= -7.851665999999966) || (p.getX() >= 158.53082300000003 && p.getY() >= -7.704999999999984 && p.getX() <= 158.57525600000005 && p.getY() <= -7.662778000000003) || (p.getX() >= 156.49606299999994 && p.getY() >= -7.950832999999932 && p.getX() <= 156.80941800000002 && p.getY() <= -7.57055600000001) || (p.getX() >= 158.31274399999998 && p.getY() >= -7.658888999999988 && p.getX() <= 158.53082300000003 && p.getY() <= -7.567223000000013) || (p.getX() >= 158.48745700000015 && p.getY() >= -8.566389000000015 && p.getX() <= 159.89776600000002 && p.getY() <= -7.55416699999995) || (p.getX() >= 158.26138300000002 && p.getY() >= -7.56305500000002 && p.getX() <= 158.42941299999995 && p.getY() <= -7.465833999999973) || (p.getX() >= 157.6783140000001 && p.getY() >= -7.478055999999981 && p.getX() <= 157.79330400000003 && p.getY() <= -7.389166999999986) || (p.getX() >= 155.507477 && p.getY() >= -7.394443999999964 && p.getX() <= 155.61273199999994 && p.getY() <= -7.324444999999969) || (p.getX() >= 155.669708 && p.getY() >= -7.129443999999978 && p.getX() <= 155.86996500000006 && p.getY() <= -6.967499999999916) || (p.getX() >= 156.04193099999998 && p.getY() >= -6.989443999999935 && p.getX() <= 156.11245700000015 && p.getY() <= -6.818056000000013) || (p.getX() >= 155.99801600000012 && p.getY() >= -6.825277999999969 && p.getX() <= 156.04721100000006 && p.getY() <= -6.787221999999986) || (p.getX() >= 156.43801900000003 && p.getY() >= -7.433887999999968 && p.getX() <= 157.535797 && p.getY() <= -6.600832999999966) || (p.getX() >= 159.703308 && p.getY() >= -5.519444000000021 && p.getX() <= 159.72384600000007 && p.getY() <= -5.483888999999976) || (p.getX() >= 159.49633800000004 && p.getY() >= -5.499721999999963 && p.getX() <= 159.528595 && p.getY() <= -5.464166999999975) || (p.getX() >= 159.34884600000007 && p.getY() >= -5.449165999999991 && p.getX() <= 159.40774499999998 && p.getY() <= -5.411666999999966) || (p.getX() >= 159.24410999999998 && p.getY() >= -5.324166999999989 && p.getX() <= 159.25219700000014 && p.getY() <= -5.293055999999979)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/SolomonIslands.data"));
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