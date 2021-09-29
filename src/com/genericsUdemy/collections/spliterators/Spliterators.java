package com.genericsUdemy.collections.spliterators;

import java.util.Arrays;

public class Spliterators {

    public static void main(String[] args) {
        var list = Arrays.asList(3, 5, 11, 70, 5);
        var iterateS = list.spliterator();
        //iterateS.forEachRemaining(i -> System.out.println(i));
        while (iterateS.tryAdvance(i -> System.out.println(i)));
    }
}
