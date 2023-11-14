package com.benchmark.app;

// 3p dependency incompatible with Java 17 (deprecated in favor of java.util.Base64)
import sun.misc.BASE64Encoder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println("Encoded: " + encode());
    }

    public static String encode(){
        String originalString = "Hello, World!";
        byte[] bytesToEncode = originalString.getBytes();
        BASE64Encoder encoder = new BASE64Encoder();
        String encodedString = encoder.encode(bytesToEncode);
    
        return encodedString;
    }
}
