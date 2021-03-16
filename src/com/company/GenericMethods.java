package com.company;

import java.util.List;

public class GenericMethods {
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    //Cia ne Generic metodas
/*    public static List arrayToList(Object[] array, List<Object> list){
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }*/

    //Cia Generics metodas
    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for (T t : array) {
            list.add(t);
        }
        return list;
    }
}
