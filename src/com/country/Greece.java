package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Greece {

  public static boolean test(Point p) {
    if ((p.getX() >= 24.044719999999927 && p.getY() >= 34.808884000000035 && p.getX() <= 24.12860900000004 && p.getY() <= 34.868607000000054) || (p.getX() >= 26.84971999999999 && p.getY() >= 35.34332999999998 && p.getX() <= 27.019997000000103 && p.getY() <= 35.43444100000005) || (p.getX() >= 23.519997000000103 && p.getY() >= 34.930550000000096 && p.getX() <= 26.301109 && p.getY() <= 35.68777499999999) || (p.getX() >= 27.066108999999983 && p.getY() >= 35.39971900000006 && p.getX() <= 27.23138799999998 && p.getY() <= 35.82694200000003) || (p.getX() >= 23.273051999999954 && p.getY() >= 35.82249500000012 && p.getX() <= 23.332222000000055 && p.getY() <= 35.899993999999936) || (p.getX() >= 22.895275000000023 && p.getY() >= 36.13582600000007 && p.getX() <= 23.10833000000008 && p.getY() <= 36.38610800000004) || (p.getX() >= 25.73027000000013 && p.getY() >= 36.34555100000006 && p.getX() <= 25.856937000000126 && p.getY() <= 36.401931999999995) || (p.getX() >= 25.390831000000105 && p.getY() >= 36.39444000000003 && p.getX() <= 25.410275000000073 && p.getY() <= 36.411942000000074) || (p.getX() >= 27.719166000000087 && p.getY() >= 35.89027400000003 && p.getX() <= 28.238049000000046 && p.getY() <= 36.45776400000011) || (p.getX() >= 27.294719999999984 && p.getY() >= 36.37166600000006 && p.getX() <= 27.44749500000012 && p.getY() <= 36.47666200000003) || (p.getX() >= 25.368889000000024 && p.getY() >= 36.329163 && p.getX() <= 25.48888800000003 && p.getY() <= 36.477219000000105) || (p.getX() >= 26.25999500000012 && p.getY() >= 36.504714999999976 && p.getX() <= 26.47221800000005 && p.getY() <= 36.64054900000008) || (p.getX() >= 27.764996000000053 && p.getY() >= 36.524994000000106 && p.getX() <= 27.876389000000128 && p.getY() <= 36.65026899999999) || (p.getX() >= 24.840832000000034 && p.getY() >= 36.590553 && p.getX() <= 24.962497999999925 && p.getY() <= 36.66249800000002) || (p.getX() >= 25.063606000000046 && p.getY() >= 36.63194299999998 && p.getX() <= 25.188332000000003 && p.getY() <= 36.71665999999999) || (p.getX() >= 21.748607999999994 && p.getY() >= 36.69777699999992 && p.getX() <= 21.785831000000144 && p.getY() <= 36.754997) || (p.getX() >= 24.322776999999974 && p.getY() >= 36.64999399999999 && p.getX() <= 24.550552000000096 && p.getY() <= 36.767494) || (p.getX() >= 25.258609999999976 && p.getY() >= 36.644997000000046 && p.getX() <= 25.408332999999967 && p.getY() <= 36.78916200000009) || (p.getX() >= 24.609722000000037 && p.getY() >= 36.74666600000006 && p.getX() <= 24.67083000000008 && p.getY() <= 36.789444) || (p.getX() >= 21.69388600000002 && p.getY() >= 36.73888399999993 && p.getX() <= 21.728611000000114 && p.getY() <= 36.79916400000008) || (p.getX() >= 24.52111100000008 && p.getY() >= 36.77471900000006 && p.getX() <= 24.599162999999976 && p.getY() <= 36.84861000000012) || (p.getX() >= 25.420277 && p.getY() >= 36.820267 && p.getX() <= 25.48333000000008 && p.getY() <= 36.86916400000007) || (p.getX() >= 25.736938000000123 && p.getY() >= 36.764153000000135 && p.getX() <= 25.976661999999976 && p.getY() <= 36.88943500000005) || (p.getX() >= 26.91777000000013 && p.getY() >= 36.67221100000006 && p.getX() <= 27.355553000000043 && p.getY() <= 36.90055100000001) || (p.getX() >= 25.60916099999997 && p.getY() >= 36.87638900000013 && p.getX() <= 25.683883999999978 && p.getY() <= 36.906097000000045) || (p.getX() >= 25.02360500000009 && p.getY() >= 36.943871 && p.getX() <= 25.08694100000008 && p.getY() <= 37.042480000000126) || (p.getX() >= 24.63999899999999 && p.getY() >= 36.903053000000114 && p.getX() <= 24.76694099999997 && p.getY() <= 37.04361) || (p.getX() >= 26.881942999999975 && p.getY() >= 36.92443100000003 && p.getX() <= 27.04999500000008 && p.getY() <= 37.07637799999998) || (p.getX() >= 25.782493999999986 && p.getY() >= 37.09027100000003 && p.getX() <= 25.838608000000026 && p.getY() <= 37.125542) || (p.getX() >= 25.09832800000009 && p.getY() >= 36.973885 && p.getX() <= 25.284443000000067 && p.getY() <= 37.14083100000005) || (p.getX() >= 26.768330000000105 && p.getY() >= 37.09527600000007 && p.getX() <= 26.889720999999952 && p.getY() <= 37.19081900000003) || (p.getX() >= 25.341106000000025 && p.getY() >= 36.9183200000001 && p.getX() <= 25.600551999999997 && p.getY() <= 37.198601) || (p.getX() >= 24.414719000000048 && p.getY() >= 37.110274999999945 && p.getX() <= 24.535000000000135 && p.getY() <= 37.20277400000009) || (p.getX() >= 26.759995000000004 && p.getY() >= 37.185555000000015 && p.getX() <= 26.788609000000008 && p.getY() <= 37.209717000000126) || (p.getX() >= 23.096107000000018 && p.getY() >= 37.23722100000009 && p.getX() <= 23.168331000000023 && p.getY() <= 37.284163999999976) || (p.getX() >= 23.373886000000027 && p.getY() >= 37.29610400000007 && p.getX() <= 23.58333200000004 && p.getY() <= 37.36943800000012) || (p.getX() >= 24.36666500000007 && p.getY() >= 37.30555000000004 && p.getX() <= 24.483608000000004 && p.getY() <= 37.481941000000006) || (p.getX() >= 25.309166000000005 && p.getY() >= 37.407219000000055 && p.getX() <= 25.463608000000026 && p.getY() <= 37.50138900000008) || (p.getX() >= 24.884440999999924 && p.getY() >= 37.36360900000005 && p.getX() <= 24.97250000000008 && p.getY() <= 37.51249700000011) || (p.getX() >= 23.432776999999927 && p.getY() >= 37.50388300000003 && p.getX() <= 23.523331000000095 && p.getY() <= 37.53777300000013) || (p.getX() >= 24.974997999999967 && p.getY() >= 37.527222000000044 && p.getX() <= 25.255550000000085 && p.getY() <= 37.67749800000013) || (p.getX() >= 24.269165000000044 && p.getY() >= 37.52471900000006 && p.getX() <= 24.411387999999988 && p.getY() <= 37.68222000000002) || (p.getX() >= 25.974716000000114 && p.getY() >= 37.506943000000085 && p.getX() <= 26.361664000000133 && p.getY() <= 37.68666100000013) || (p.getX() >= 23.423611000000047 && p.getY() >= 37.677216000000094 && p.getX() <= 23.564720000000023 && p.getY() <= 37.7708280000001) || (p.getX() >= 26.571663000000115 && p.getY() >= 37.63665800000001 && p.getX() <= 27.069442999999975 && p.getY() <= 37.81137800000005) || (p.getX() >= 20.61999900000012 && p.getY() >= 37.64638500000012 && p.getX() <= 20.998607999999933 && p.getY() <= 37.930275) || (p.getX() >= 24.690276999999924 && p.getY() >= 37.685555000000136 && p.getX() <= 24.998885999999967 && p.getY() <= 37.998329000000126) || (p.getX() >= 23.40361000000001 && p.getY() >= 37.87777700000004 && p.getX() <= 23.54722199999992 && p.getY() <= 38.00083200000012) || (p.getX() >= 20.339995999999985 && p.getY() >= 38.05944099999999 && p.getX() <= 20.813609999999983 && p.getY() <= 38.47193900000001) || (p.getX() >= 20.613331000000127 && p.getY() >= 38.305275 && p.getX() <= 20.76110800000004 && p.getY() <= 38.50110600000011) || (p.getX() >= 25.824997000000053 && p.getY() >= 38.14943699999998 && p.getX() <= 26.163051999999997 && p.getY() <= 38.60137900000007) || (p.getX() >= 20.89611099999996 && p.getY() >= 38.54416699999996 && p.getX() <= 20.941386999999963 && p.getY() <= 38.605270000000125) || (p.getX() >= 25.52722200000011 && p.getY() >= 38.530823000000055 && p.getX() <= 25.620273999999995 && p.getY() <= 38.60833000000002) || (p.getX() >= 20.542221000000097 && p.getY() >= 38.564438 && p.getX() <= 20.73000000000013 && p.getY() <= 38.83554800000008) || (p.getX() >= 24.449718000000075 && p.getY() >= 38.76082600000012 && p.getX() <= 24.683608999999993 && p.getY() <= 38.978607000000075) || (p.getX() >= 22.82999800000005 && p.getY() >= 37.95333100000005 && p.getX() <= 24.590832000000088 && p.getY() <= 39.038886999999995) || (p.getX() >= 23.58999600000004 && p.getY() >= 39.07138800000007 && p.getX() <= 23.78916500000008 && p.getY() <= 39.207497000000046) || (p.getX() >= 23.39249800000005 && p.getY() >= 39.129996999999946 && p.getX() <= 23.512218000000015 && p.getY() <= 39.20832800000005) || (p.getX() >= 20.1227760000001 && p.getY() >= 39.17416400000002 && p.getX() <= 20.20222100000001 && p.getY() <= 39.240273) || (p.getX() >= 23.83361099999996 && p.getY() >= 39.133049000000085 && p.getX() <= 23.97944300000012 && p.getY() <= 39.28971900000005) || (p.getX() >= 25.832222000000115 && p.getY() >= 38.968323000000055 && p.getX() <= 26.618889000000134 && p.getY() <= 39.38304100000005) || (p.getX() >= 24.969719 && p.getY() >= 39.464722000000044 && p.getX() <= 25.05360800000011 && p.getY() <= 39.56330899999995) || (p.getX() >= 19.639999000000103 && p.getY() >= 39.36305199999998 && p.getX() <= 20.122219000000033 && p.getY() <= 39.81832899999994) || (p.getX() >= 19.376110000000097 && p.getY() >= 39.83833300000009 && p.getX() <= 19.43055300000003 && p.getY() <= 39.87110899999999) || (p.getX() >= 25.043053000000043 && p.getY() >= 39.7863850000001 && p.getX() <= 25.45360600000004 && p.getY() <= 40.03387500000008) || (p.getX() >= 25.443885999999964 && p.getY() >= 40.39777400000015 && p.getX() <= 25.69611000000009 && p.getY() <= 40.511658000000075) || (p.getX() >= 24.509440999999924 && p.getY() >= 40.570831000000055 && p.getX() <= 24.77333100000004 && p.getY() <= 40.797775) || (p.getX() >= 20.010029000000088 && p.getY() >= 36.38610800000004 && p.getX() <= 26.63721500000014 && p.getY() <= 41.74832200000003)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Greece.data"));
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