package com.he.boot.util;

import java.util.UUID;


public class UUIDUtils {


  public static String getUUID() {
    UUID uuid = UUID.randomUUID();
    String str = uuid.toString();
    String temp = str.replace("-", "");
    return temp;
  }
}
