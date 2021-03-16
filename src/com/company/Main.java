package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Character> charList = GenericMethods.arrayToList(GenericMethods.charArray, new ArrayList<>());
        List<Boolean> boolList = GenericMethods.arrayToList(GenericMethods.boolArray, new ArrayList<>());
        List<Integer> intList = GenericMethods.arrayToList(GenericMethods.intArray, new ArrayList<>());

    }
}
