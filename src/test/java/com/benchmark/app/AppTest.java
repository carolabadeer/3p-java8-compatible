package com.benchmark.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.benchmark.app.App;

public class AppTest 
{
    @Test
    public void test3pHelloWorldStringEncoding()
    {
        String encoded = App.encode();
        assertEquals(encoded, "SGVsbG8sIFdvcmxkIQ==");
        System.out.println("This unit test verifies 3p dependency functionality - no 1p verification");

    }
}
