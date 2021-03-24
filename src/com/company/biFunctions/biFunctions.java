package com.company.biFunctions;

import java.util.function.BiFunction;

public class biFunctions {
    public static void main(String[] args) {
        System.out.println(add.apply(32, 32));
        System.out.println(addThree.apply(32, 32, 32));
        System.out.println(sayHello.apply());
    }

    public static BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
    public static TriFunction<Integer, Integer, Integer, Integer> addThree = (x, z, y) -> z + x + y;
    public static NoArgFunction<String> sayHello = () -> "Hello!";
}
