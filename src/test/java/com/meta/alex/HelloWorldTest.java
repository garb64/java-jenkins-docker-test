package com.meta.alex;

import static org.junit.Assert.*;

/**
 * Created by oywjq3z on 11.03.2016.
 */
public class HelloWorldTest {

    private HelloWorld hw;

    @org.junit.Test
    public void testRunMe() throws Exception {
        hw = new HelloWorld();
        assertEquals("Here is test for Hello World String: ", "Hello World nope", hw.runMe());
    }
}
