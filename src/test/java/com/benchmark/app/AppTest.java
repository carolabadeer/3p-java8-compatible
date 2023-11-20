package com.benchmark.app;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void test3pHelloWorldStringEncoding()
    {
        /*
         * This unit test verifies 3p dependency functionality - no 1p verification
         */
        String encoded = App.encode();
        assertEquals(encoded, "SGVsbG8sIFdvcmxkIQ==");
        System.out.println("Hello World");
    }

    // @Test 
    // public void test1pDependency() {
    //     /*
    //      * This unit test verifies 1p dependency functionality - no 3p verification
    //      */

    //     int additionResult = App.call1pDependency();
    //     assertEquals(additionResult, 3);
    // }
}
