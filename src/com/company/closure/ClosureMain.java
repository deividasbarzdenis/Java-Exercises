package com.company.closure;

import com.company.biFunctions.NoArgFunction;

public class ClosureMain {
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Shaun";
            return () -> "Hello, " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
