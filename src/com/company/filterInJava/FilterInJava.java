package com.company.filterInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterInJava {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7,8 ,9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        //Original way:
        List<Integer> evens = new ArrayList<>();
        for(int i=0; i<listOfIntegers.size(); i++){
            Boolean isEven = listOfIntegers.get(i) % 2 == 0;
            if(isEven){
                evens.add(listOfIntegers.get(i));
            }
        }
        //functional way:
//      Predicate<Integer> isEven = (x) -> x % 2 == 0; for readability, this way is better
        List<Integer> evensWithStreams = listOfIntegers
                .stream()
                .filter(/*isEven*/ (x) -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original way: "+ evens + "\nFunctional way: " + evensWithStreams);
    //------------------------------------------------------------------------------------------------------------------
        String[] wordsArray = {"Hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        } ;

        Predicate<String> isLongerThen3 = createLengthTest.apply(3);
        Predicate<String> isLongerThen10 = createLengthTest.apply(10);

        List<String> longWords = words
                .stream()
                .filter(isLongerThen10)
                .collect(Collectors.toList());

        System.out.println(longWords);
    }
}
