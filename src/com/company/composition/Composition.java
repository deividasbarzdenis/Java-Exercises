package com.company.composition;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Composition {
    public static void main(String[] args) {

        Function<Integer, Integer> timesTwo = x -> x * 2;
        Function<Integer, Integer> minusOne = x -> x -1;
        // compose is happens in reverse order.. first this function multiply from two and then subtract one.
        Function<Integer, Integer> timeTwoMinusOne = minusOne.compose(timesTwo);
        // can use andThen() method, result will be same:
        Function<Integer, Integer> timeTwoMinusOne1 = timesTwo.andThen(minusOne);

        System.out.println(timeTwoMinusOne.apply(10));
        System.out.println(timeTwoMinusOne1.apply(10));

        //--------------------------------------------------------------------------------------------------------------

        Employee[] emplArr = {
                new Employee("John", 34, "developer", 3400f),
                new Employee("Hannah", 24, "developer", 2500f),
                new Employee("Bart", 50, "sales executive", 4800f),
                new Employee("Sophie", 49, "construction worker", 1500f),
                new Employee("Darren", 38, "writer", 5000f),
                new Employee("Nancy", 29, "developer", 3700f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(emplArr));

        Function<Employee, String> getName = employee -> employee.name;
        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
        Function<String, String> uppercase = str -> str.toUpperCase();

        Function<Employee, String> getReversedUppercasedName = getName.andThen(reverse).andThen(uppercase);

        List<String> results = employees
                .stream()
                .map(getReversedUppercasedName)
                .collect(Collectors.toList());

        System.out.println(results);
    }
}
