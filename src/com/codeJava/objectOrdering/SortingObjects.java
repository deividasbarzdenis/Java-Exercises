package com.codeJava.objectOrdering;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

/*
* Understanding Object Ordering in Java with Comparable and Comparator
 * */
public class SortingObjects {
    public static void main(String[] args) throws ParseException {
        // String sort example in collection:
        var names = Arrays.asList(
                "Tom", "Peter", "Alice", "Bob", "Sam",
                "Mary", "Jane", "Bill", "Tim", "Kevin"
        );
        System.out.println("Before sorting: " + names);
        Collections.sort(names);
        System.out.println("After sorting: " + names);

        // Number sort example in collection:
        var numbers = Arrays.asList(8, 2, 5, 1, 3, 4, 9, 6, 7, 10);
        System.out.println("Before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);

        // Date objects sort example in collection:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        var birthdays = new ArrayList<Date>();
        birthdays.add(dateFormat.parse("2016-01-30"));
        birthdays.add(dateFormat.parse("1998-12-03"));
        birthdays.add(dateFormat.parse("2009-07-15"));
        birthdays.add(dateFormat.parse("2012-04-30"));
        System.out.println("Before sorting:");
        birthdays.forEach(e -> System.out.println(dateFormat.format(e)));
        Collections.sort(birthdays);
        System.out.println("After sorting:");
        birthdays.forEach(e -> System.out.println(dateFormat.format(e)));

        /*
        * Natural ordering is the default ordering of objects of a specific type when they are sorted in an array or
        * a collection. The Java language provides the Comparable interface that allows us define the natural
        * ordering of a class.
         * compare value = 0: two objects are equal.
         *  compare value > 0: the first object (the current object) is greater than the second one.
         *  compare value < 0: the first object is less than the second one.
         *
         * In the above examples, we don’t have to write code to implement the Comparableinterface because the String,
         * Integer and Date classes already implemented this interface. Hence we can sort a collection containing objects of these types.
            Other wrapper types in Java are also comparable: Long, Double, Float, etc.
         *
         * When we create our own type, we have to implement the Comparableinterface in order to have objects of our
         * type eligible to be sorted in collections or arrays. Let’s see an example to understand how
         * the Comparableinterface is used.
        * */


    }
}
