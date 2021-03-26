package com.company.returningFunction;

import com.company.biFunctions.NoArgFunction;

import java.util.function.Function;

public class ReturningFunction {
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> /*{
            return*/ () -> "Hello functional";
        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());

        //it's create function on a fly
        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
        Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);
        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));
        System.out.println(timesFour.apply(6));
    }
}
