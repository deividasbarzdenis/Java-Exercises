package com.company.lambdaExpressions;

import java.util.function.Function;

public class Chapter2Video2 {
    public static void main(String[] args) {
        System.out.println(absoluteValue.apply(-100));
        System.out.println(absoluteValueWithIf.apply(-100));
    }
    public static Function<Integer, Integer> absoluteValue = (x) -> x <0 ? -x : x;

    public static Function<Integer, Integer> absoluteValueWithIf = (x) -> {
        if (x<0){
            return -x;
        }else{
            return x;
        }
    };
}
