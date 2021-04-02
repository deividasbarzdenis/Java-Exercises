package com.company.collectInJava;

import java.util.*;
import java.util.stream.Collectors;

public class CollectInJava {
    public static void main(String[] args) {
        String[] wordsArr = {"hello", "functional", "programming", "is", "is", "cool", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        //Collect : toList, toSet, joining, counting, groupingBy, partitioningBy
        Set<String> longWordsWithList = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toSet());

        Set<String> longWordsWithSet = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toSet());

        String longWordsWithJoining = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.joining(", "));

        Long longWordsWithCounting = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.counting());

        Map<Integer, List<String>> longWordsWithGroupingBy = words
                .stream()
                .collect(Collectors.groupingBy(
                        (word) -> word.length()
                ));

        Map<Boolean, List<String>> longWordsWithPartitioningBy = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length() > 5
                ));

        System.out.println(longWordsWithList + "\n" + longWordsWithSet + "\n" + longWordsWithJoining + "\n" +
                longWordsWithCounting + "\n" + longWordsWithGroupingBy + "\n" + longWordsWithPartitioningBy);
    }
}
