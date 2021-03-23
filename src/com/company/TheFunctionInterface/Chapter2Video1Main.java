package com.company.TheFunctionInterface;

import java.util.function.Function;

public class Chapter2Video1Main {
    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
