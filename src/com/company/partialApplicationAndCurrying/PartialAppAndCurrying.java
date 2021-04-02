package com.company.partialApplicationAndCurrying;

import com.company.biFunctions.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PartialAppAndCurrying {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add =
                (x, y, z) -> x + y + z;

        // function for pass 2 values later (order of elements can be changed):
        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial =
                (x) -> (y, z) -> add.apply(x, y, z);
        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);
        System.out.println(add5.apply(6, 7));

        // function for pass 1 value later:
        BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial1 =
                (x, y) -> (z) -> add.apply(x, y, z);
        Function<Integer, Integer> add5And6 = addPartial1.apply(5, 6);
        System.out.println(add5And6.apply(7));

        // function for pass each value separately [calls currying]:
        Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial2 =
                (x) -> (y) -> (z) -> add.apply(x, y, z);
        Function<Integer, Function<Integer, Integer>> add5A = addPartial2.apply(5);
        Function<Integer, Integer> add5And6A = add5A.apply(6);
        Integer sum = add5And6A.apply(7);
        System.out.println(sum);

    }
}
