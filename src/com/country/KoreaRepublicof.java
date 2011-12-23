package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class KoreaRepublicof {

  public static boolean test(Point p) {
    if ((p.getX() >= 126.15525800000013 && p.getY() >= 33.19026900000006 && p.getX() <= 126.94109300000001 && p.getY() <= 33.55193300000013) || (p.getX() >= 126.64582800000017 && p.getY() >= 34.27860300000003 && p.getX() <= 126.77498600000013 && p.getY() <= 34.389160000000004) || (p.getX() >= 127.11136599999996 && p.getY() >= 34.41443600000008 && p.getX() <= 127.24581900000008 && p.getY() <= 34.485550000000046) || (p.getX() >= 127.71192899999994 && p.getY() >= 34.473877000000016 && p.getX() <= 127.798317 && p.getY() <= 34.54193900000013) || (p.getX() >= 126.098877 && p.getY() >= 34.351105000000125 && p.getX() <= 126.38361399999997 && p.getY() <= 34.573326000000066) || (p.getX() >= 127.73304700000016 && p.getY() >= 34.572220000000016 && p.getX() <= 127.81275900000014 && p.getY() <= 34.66415400000011) || (p.getX() >= 125.91442900000015 && p.getY() >= 34.647217000000126 && p.getX() <= 126.00861399999997 && p.getY() <= 34.71693399999998) || (p.getX() >= 125.88832100000013 && p.getY() >= 34.71693399999998 && p.getX() <= 126.00916300000003 && p.getY() <= 34.79249600000014) || (p.getX() >= 127.97331200000009 && p.getY() >= 34.82777399999998 && p.getX() <= 128.085785 && p.getY() <= 34.913879000000065) || (p.getX() >= 125.98359700000003 && p.getY() >= 34.85388200000011 && p.getX() <= 126.09443699999997 && p.getY() <= 34.92832900000002) || (p.getX() >= 127.82222000000014 && p.getY() >= 34.69499200000013 && p.getX() <= 128.07553100000007 && p.getY() <= 34.933051999999975) || (p.getX() >= 128.488556 && p.getY() >= 34.69776900000005 && p.getX() <= 128.75442500000008 && p.getY() <= 34.976654) || (p.getX() >= 126.05609100000017 && p.getY() >= 35.04583000000008 && p.getX() <= 126.16220100000008 && p.getY() <= 35.14610300000004) || (p.getX() >= 126.32499700000017 && p.getY() >= 36.39943699999998 && p.getX() <= 126.43386800000007 && p.getY() <= 36.593048000000074) || (p.getX() >= 126.15804300000013 && p.getY() >= 36.82416500000011 && p.getX() <= 126.17386599999996 && p.getY() <= 36.839989) || (p.getX() >= 130.80581700000016 && p.getY() >= 37.449997 && p.getX() <= 130.92413299999998 && p.getY() <= 37.545546999999935) || (p.getX() >= 126.364151 && p.getY() >= 37.59221600000012 && p.getX() <= 126.53942900000003 && p.getY() <= 37.82193799999999) || (p.getX() >= 124.60971100000006 && p.getY() >= 37.91443600000008 && p.getX() <= 124.74664300000006 && p.getY() <= 37.984161000000086) || (p.getX() >= 126.12359600000013 && p.getY() >= 34.29943800000012 && p.getX() <= 129.588348 && p.getY() <= 38.62524400000007)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/KoreaRepublicof.data"));
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
