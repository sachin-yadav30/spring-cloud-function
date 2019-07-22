package com.sachin.serverless;

import java.util.function.Function;

public class HelloWorld implements Function<String,String>{

    @Override
    public String apply(String s) {
        return "Hello "+ s;
    }
}
