package com.company.biFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class biFunctions {
    public static void main(String[] args) {
        System.out.println(add.apply(32, 32));
        System.out.println(addThree.apply(32, 32, 32));
        System.out.println(sayHello.apply());
        System.out.println(addMany.apply(2, 2, 2, 2, 2));
    }

    public static BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
    public static TriFunction<Integer, Integer, Integer, Integer> addThree = (x, z, y) -> z + x + y;
    public static NoArgFunction<String> sayHello = () -> "Hello!";
    public static ManyFunctions<Integer, Integer> addMany = (x) -> toList(x).stream().reduce(0, (a, b) -> a+b);

    private static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T elt : arr) list.add(elt);
        return list;
    }
}
