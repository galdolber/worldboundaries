package com.world;

import com.country.CountryDecoder;

import org.junit.Test;

public class DecoderTest {

  @Test
  public void testDecoder() {
    System.out.println(CountryDecoder.decode(20.33, 15.0));
  }
}
