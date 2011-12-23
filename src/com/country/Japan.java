package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Japan {

  public static boolean test(Point p) {
    if ((p.getX() >= 153.93887299999994 && p.getY() >= 24.29277400000001 && p.getX() <= 153.96579000000006 && p.getY() <= 24.321663) || (p.getX() >= 123.67886399999996 && p.getY() >= 24.250832000000003 && p.getX() <= 123.93665300000008 && p.getY() <= 24.418053000000043) || (p.getX() >= 122.93525700000008 && p.getY() >= 24.434719000000033 && p.getX() <= 123.01805100000013 && p.getY() <= 24.470828999999924) || (p.getX() >= 131.239685 && p.getY() >= 24.454441000000088 && p.getX() <= 131.27636700000016 && p.getY() <= 24.486381999999992) || (p.getX() >= 124.07582100000002 && p.getY() >= 24.32722100000001 && p.getX() <= 124.330551 && p.getY() <= 24.588051000000007) || (p.getX() >= 141.28442400000003 && p.getY() >= 24.725273000000072 && p.getX() <= 141.36358600000003 && p.getY() <= 24.794163000000083) || (p.getX() >= 125.25221299999998 && p.getY() >= 24.71610600000008 && p.getX() <= 125.4511030000001 && p.getY() <= 24.884440999999924) || (p.getX() >= 141.26608300000007 && p.getY() >= 25.417774000000065 && p.getX() <= 141.30191000000002 && p.getY() <= 25.454162999999937) || (p.getX() >= 131.20800800000006 && p.getY() >= 25.8127750000001 && p.getX() <= 131.27386500000011 && p.getY() <= 25.87249800000012) || (p.getX() >= 126.69193299999995 && p.getY() >= 26.296944 && p.getX() <= 126.81109600000002 && p.getY() <= 26.387774999999976) || (p.getX() >= 142.10913100000002 && p.getY() >= 26.612217000000044 && p.getX() <= 142.17776500000002 && p.getY() <= 26.71666299999993) || (p.getX() >= 127.63997700000003 && p.getY() >= 26.078609000000085 && p.getX() <= 128.33551000000014 && p.getY() <= 26.854996000000085) || (p.getX() >= 142.17608600000003 && p.getY() >= 27.032496999999974 && p.getX() <= 142.2402340000001 && p.getY() <= 27.095276000000126) || (p.getX() >= 142.178589 && p.getY() >= 27.145550000000128 && p.getX() <= 142.204132 && p.getY() <= 27.191105000000107) || (p.getX() >= 140.86245700000015 && p.getY() >= 27.218327000000045 && p.getX() <= 140.881622 && p.getY() <= 27.24360700000005) || (p.getX() >= 128.52249100000017 && p.getY() >= 27.346663999999976 && p.getX() <= 128.70385700000008 && p.getY() <= 27.4486050000001) || (p.getX() >= 142.16998300000012 && p.getY() >= 27.59916300000009 && p.getX() <= 142.19940200000008 && p.getY() <= 27.625275000000045) || (p.getX() >= 142.068848 && p.getY() >= 27.71693800000014 && p.getX() <= 142.09164399999997 && p.getY() <= 27.732773000000066) || (p.getX() >= 128.8802489999999 && p.getY() >= 27.675552000000096 && p.getX() <= 129.02996799999994 && p.getY() <= 27.907497000000088) || (p.getX() >= 129.18469200000004 && p.getY() >= 28.075275000000037 && p.getX() <= 129.35385100000008 && p.getY() <= 28.191395000000117) || (p.getX() >= 129.91442900000004 && p.getY() >= 28.279999000000032 && p.getX() <= 130.0330510000001 && p.getY() <= 28.366385999999977) || (p.getX() >= 129.14303600000002 && p.getY() >= 28.115273 && p.getX() <= 129.71829200000002 && p.getY() <= 28.497719000000014) || (p.getX() >= 129.70608500000003 && p.getY() >= 29.60638399999999 && p.getX() <= 129.75332600000016 && p.getY() <= 29.663330000000087) || (p.getX() >= 129.851898 && p.getY() >= 29.81805399999996 && p.getX() <= 129.923309 && p.getY() <= 29.87694200000004) || (p.getX() >= 129.92358400000015 && p.getY() >= 29.956383000000127 && p.getX() <= 129.97106900000003 && p.getY() <= 30.00166300000012) || (p.getX() >= 130.38024900000005 && p.getY() >= 30.235828000000083 && p.getX() <= 130.67190600000004 && p.getY() <= 30.460827000000048) || (p.getX() >= 140.30136100000016 && p.getY() >= 30.458328000000048 && p.getX() <= 140.335785 && p.getY() <= 30.48388300000005) || (p.getX() >= 130.86163300000007 && p.getY() >= 30.353607000000068 && p.getX() <= 131.08551000000003 && p.getY() <= 30.84027500000002) || (p.getX() >= 129.67053199999998 && p.getY() >= 31.631107000000043 && p.getX() <= 129.80191000000002 && p.getY() <= 31.793331000000023) || (p.getX() >= 139.99939000000006 && p.getY() >= 31.93110700000005 && p.getX() <= 140.028595 && p.getY() <= 31.946663) || (p.getX() >= 130.10885599999995 && p.getY() >= 32.10804700000011 && p.getX() <= 130.1955260000001 && p.getY() <= 32.21666000000005) || (p.getX() >= 130.20773300000008 && p.getY() >= 32.370544000000045 && p.getX() <= 130.44802900000002 && p.getY() <= 32.522217000000126) || (p.getX() >= 129.95523100000003 && p.getY() >= 32.188315999999986 && p.getX() <= 130.21109 && p.getY() <= 32.54361) || (p.getX() >= 128.60107400000015 && p.getY() >= 32.58915700000006 && p.getX() <= 128.902191 && p.getY() <= 32.79249599999997) || (p.getX() >= 129.00555399999996 && p.getY() >= 32.81638300000003 && p.getX() <= 129.1830440000001 && p.getY() <= 33.145546000000024) || (p.getX() >= 139.73968500000012 && p.getY() >= 33.03472100000005 && p.getX() <= 139.87219200000004 && p.getY() <= 33.147491) || (p.getX() >= 129.35995500000013 && p.getY() >= 33.164710999999954 && p.getX() <= 129.569702 && p.getY() <= 33.389717000000125) || (p.getX() >= 129.81359899999998 && p.getY() >= 33.3394320000001 && p.getX() <= 129.86108400000015 && p.getY() <= 33.39860500000009) || (p.getX() >= 132.18551600000012 && p.getY() >= 33.75443999999999 && p.getX() <= 132.27609300000006 && p.getY() <= 33.79610400000007) || (p.getX() >= 129.65887500000008 && p.getY() >= 33.69748699999997 && p.getX() <= 129.79412800000011 && p.getY() <= 33.85694100000006) || (p.getX() >= 139.58136000000013 && p.getY() >= 33.83194000000009 && p.getX() <= 139.626892 && p.getY() <= 33.88916000000012) || (p.getX() >= 129.56387299999994 && p.getY() >= 30.99666200000001 && p.getX() <= 131.98941000000002 && p.getY() <= 33.936653000000035) || (p.getX() >= 132.18441800000002 && p.getY() >= 33.84915899999993 && p.getX() <= 132.45163000000002 && p.getY() <= 33.94748700000014) || (p.getX() >= 139.48217799999998 && p.getY() >= 34.03221100000002 && p.getX() <= 139.57440199999996 && p.getY() <= 34.110550000000046) || (p.getX() >= 132.456635 && p.getY() >= 34.061104 && p.getX() <= 132.585236 && p.getY() <= 34.182495000000074) || (p.getX() >= 132.38552900000002 && p.getY() >= 34.11415900000003 && p.getX() <= 132.49883999999997 && p.getY() <= 34.279160000000104) || (p.getX() >= 132.94998199999998 && p.getY() >= 34.184990000000084 && p.getX() <= 133.05554200000006 && p.getY() <= 34.29415899999998) || (p.getX() >= 129.18331899999998 && p.getY() >= 34.07360800000004 && p.getX() <= 129.34939600000007 && p.getY() <= 34.32222000000007) || (p.getX() >= 132.015808 && p.getY() >= 32.735550000000046 && p.getX() <= 134.75305200000003 && p.getY() <= 34.38749700000011) || (p.getX() >= 139.24856599999998 && p.getY() >= 34.31721500000003 && p.getX() <= 139.30246 && p.getY() <= 34.41971600000011) || (p.getX() >= 134.1927489999999 && p.getY() >= 34.42860400000012 && p.getX() <= 134.3715820000001 && p.getY() <= 34.551383999999985) || (p.getX() >= 134.660522 && p.getY() >= 34.18443300000001 && p.getX() <= 135.02804600000013 && p.getY() <= 34.59526800000009) || (p.getX() >= 129.24523900000008 && p.getY() >= 34.29471600000005 && p.getX() <= 129.50582900000006 && p.getY() <= 34.690269000000114) || (p.getX() >= 139.35858199999996 && p.getY() >= 34.66944100000006 && p.getX() <= 139.45831299999998 && p.getY() <= 34.78777300000013) || (p.getX() >= 133.01080300000012 && p.getY() >= 35.989716000000044 && p.getX() <= 133.07663000000014 && p.getY() <= 36.02249100000006) || (p.getX() >= 133.07440199999996 && p.getY() >= 36.02027100000004 && p.getX() <= 133.13388099999997 && p.getY() <= 36.10332499999993) || (p.getX() >= 132.95053100000007 && p.getY() >= 36.03166199999998 && p.getX() <= 133.0916440000001 && p.getY() <= 36.12526700000001) || (p.getX() >= 133.1824650000001 && p.getY() >= 36.151382000000005 && p.getX() <= 133.38525400000015 && p.getY() <= 36.32499700000011) || (p.getX() >= 136.90942400000017 && p.getY() >= 37.089432000000045 && p.getX() <= 137.05801400000007 && p.getY() <= 37.154991) || (p.getX() >= 138.20913700000003 && p.getY() >= 37.79361000000006 && p.getX() <= 138.58108500000014 && p.getY() <= 38.322495) || (p.getX() >= 130.87966900000004 && p.getY() >= 33.454994 && p.getX() <= 142.069702 && p.getY() <= 41.530273000000136) || (p.getX() >= 139.40774499999998 && p.getY() >= 42.047217999999994 && p.getX() <= 139.56301900000017 && p.getY() <= 42.237770000000125) || (p.getX() >= 145.22000100000014 && p.getY() >= 43.536662999999976 && p.getX() <= 145.36108400000012 && p.getY() <= 43.60255100000012) || (p.getX() >= 143.81192 && p.getY() >= 44.140549000000014 && p.getX() <= 143.97051999999996 && p.getY() <= 44.17276800000008) || (p.getX() >= 141.12744099999998 && p.getY() >= 45.09693900000001 && p.getX() <= 141.33468600000003 && p.getY() <= 45.25138899999996) || (p.getX() >= 140.96801800000014 && p.getY() >= 45.26471699999996 && p.getX() <= 141.07440200000008 && p.getY() <= 45.46554600000008) || (p.getX() >= 139.76831100000004 && p.getY() >= 41.39499699999999 && p.getX() <= 145.82220500000003 && p.getY() <= 45.486382000000106)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Japan.data"));
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
