package com.country;

import com.google.common.io.ByteStreams;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Geometry;
import com.world.Util;
import java.io.IOException;

public class Bahrain {

  public static boolean test(Point p) {
    if ((p.getX() >= 50.782219 && p.getY() >= 25.64194100000003 && p.getX() <= 50.822495 && p.getY() <= 25.66221999999999) || (p.getX() >= 50.804161000000015 && p.getY() >= 25.676666000000125 && p.getX() <= 50.814438 && p.getY() <= 25.689720000000023) || (p.getX() >= 50.74166100000008 && p.getY() >= 25.57194100000004 && p.getX() <= 50.796660999999965 && p.getY() <= 25.72833300000008) || (p.getX() >= 50.760551000000014 && p.getY() >= 25.745830999999956 && p.getX() <= 50.76999699999999 && p.getY() <= 25.754719000000136) || (p.getX() >= 50.453049000000135 && p.getY() >= 25.809722999999963 && p.getX() <= 50.61972000000002 && p.getY() <= 26.24055499999997) || (p.getX() >= 50.60333300000001 && p.getY() >= 26.244720000000143 && p.getX() <= 50.655830000000094 && p.getY() <= 26.288887000000045)) {
      byte[] data;
      try {
        data = ByteStreams.toByteArray(Antarctica.class.getClassLoader().getResourceAsStream("com/country/Bahrain.data"));
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
