package com.company.passingFunctionsAsArguments;

import java.util.function.BiFunction;

public class Math {
    public static Integer add(Integer x, Integer y){
        return x + y;
    }
    public static Integer substract(Integer x, Integer y){
        return x - y;
    }
    public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc){
        return combineFunc.apply(2, 3);
    }
}
