package com.meta.alex;

/**
 * Created by Alex on 11.03.2016.
 */
public class HelloWorld {

    /**
     * Public method to be unit tested
     *
     * @return String
     */
    public String runMe() {
        return doSomethingUseful();
    }

    /**
     * Private method
     *
     * @return String
     */
    private String doSomethingUseful() {
        return "Hello World";
    }
}
