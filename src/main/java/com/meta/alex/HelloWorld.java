package com.meta.alex;

/**
 * Created by oywjq3z on 11.03.2016.
 */
public class HelloWorld {

    /**
     * Public method to be used
     *
     * @return String
     */
    public String runMe() {
        return doSomethingUseful();
    }

    /**
     * Private method to be unit tested
     *
     * @return String
     */
    private String doSomethingUseful() {
        return "Hello World";
    }
}
