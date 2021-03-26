package com.company.returningFunction;

import java.util.function.Function;

public class MyMath {
    public static Integer timesTwo(Integer x){
        return x * 2;
    }
    public static Integer timesThree(Integer x){
        return x * 3;
    }
    public static Integer timesFour(Integer x){
        return x * 4;
    }
    //This one function we can use instead others three above from same functionality
    public static Function<Integer, Integer> createMultiplier(Integer y){
        return (Integer x) -> x * y;
    }
}
