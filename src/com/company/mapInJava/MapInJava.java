package com.company.mapInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapInJava {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        //Original way example:
        List<Integer> doubled = new ArrayList<>();
        for(int i = 0; i<listOfIntegers.size(); i++){
            Integer result = listOfIntegers.get(i) * 2;
            doubled.add(result);
        }
        // with stream() example:
        Function<Integer, Integer> timesTwo = (x) -> x * 2;
        List<Integer> doubledWithStreams = listOfIntegers
                .stream()
                .map(timesTwo)
                .collect(Collectors.toList());
        System.out.println("Original way: "+doubled +
                "\nWith stream(): "+ doubledWithStreams);
    }

}
