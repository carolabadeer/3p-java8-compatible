package com.benchmark.app;

// 3p dependency incompatible with Java 17 (deprecated in favor of java.util.Base64)
import sun.misc.BASE64Encoder;

public class App 
{
    public static void main( String[] args ){
        System.out.println("Encoded: " + encode());
        System.out.println("Java 17 incompatible 1p dependency: " + call1pDependency());
    }
  
    public static void call1pDependency() {
      return com.mycompany.app.App.add(1,2);
    }

    public static String encode(){
        String originalString = "Hello, World!";
        byte[] bytesToEncode = originalString.getBytes();
        BASE64Encoder encoder = new BASE64Encoder();
        String encodedString = encoder.encode(bytesToEncode);
    
        return encodedString;
    }
}
