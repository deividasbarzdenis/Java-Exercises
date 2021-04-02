package com.company.streamExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExercise {
    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27),
        };
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

        // Get a list that contains all the people's names
        List<String> names = people
                .stream()
                .map((person) -> person.name)
                .collect(Collectors.toList());

        System.out.println(names);
//----------------------------------------------------------------------------------------------------------------------
        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 15000f),
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // Get a list of all the blue cars
        List<Car> bluecars = cars
                .stream()
                .filter(car -> car.color.equals("blue"))
                .collect(Collectors.toList());

        System.out.println(bluecars);
//----------------------------------------------------------------------------------------------------------------------
        Employee[] emplArr = {
                new Employee("John", 34, "developer", 3400f),
                new Employee("Hannah", 24, "developer", 2500f),
                new Employee("Bart", 50, "sales executive", 4800f),
                new Employee("Sophie", 49, "construction worker", 1500f),
                new Employee("Darren", 38, "writer", 5000f),
                new Employee("Nancy", 29, "developer", 3700f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(emplArr));

        // Find the sum of all the employees' salaries
        Float sumOfSalaries = employees
                .stream()
                .map((employee) -> employee.salary)
                .reduce(0f, (acc, x) -> acc + x);

        System.out.println(sumOfSalaries);
    }
}
