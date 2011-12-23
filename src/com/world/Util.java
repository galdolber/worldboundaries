package com.world;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ByteOrderValues;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKBReader;

public class Util {

  public static Geometry convert(byte[] mysqlGeometry) {
    WKBReader wkbReader = new WKBReader();
    // get the geometry from well known binary
    byte wkb[] = new byte[mysqlGeometry.length - 4];
    System.arraycopy(mysqlGeometry, 4, wkb, 0, mysqlGeometry.length - 4);
    Geometry geometry;
    try {
      geometry = wkbReader.read(wkb);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    // get and set the srid
    byte[] buf = new byte[4];
    System.arraycopy(mysqlGeometry, 0, buf, 0, 4);
    int srid = ByteOrderValues.getInt(buf, ByteOrderValues.LITTLE_ENDIAN);
    geometry.setSRID(srid);
    return geometry;
  }
}
