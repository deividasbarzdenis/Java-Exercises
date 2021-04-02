package com.company.streamExercise2;

import com.company.streamExercise.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExercise2 {
    public static void main(String[] args) {
        com.company.streamExercise.Employee[] emplArr = {
                new com.company.streamExercise.Employee("John", 34, "developer", 3400f),
                new com.company.streamExercise.Employee("Hannah", 24, "developer", 2500f),
                new com.company.streamExercise.Employee("Bart", 50, "sales executive", 4800f),
                new com.company.streamExercise.Employee("Sophie", 49, "construction worker", 1500f),
                new com.company.streamExercise.Employee("Darren", 38, "writer", 5000f),
                new com.company.streamExercise.Employee("Nancy", 29, "developer", 3700f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(emplArr));

        Map<String, Float> averageSalariesMap = employees
                .stream()
                .collect(Collectors.groupingBy(
                        (employee) -> employee.jobTitle
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        (entry) -> entry.getKey(),
                        (entry) -> entry.getValue()
                                .stream()
                                .map(employee -> employee.salary)
                                .reduce(0f, (acc, x) -> (acc + x) / entry.getValue().size()
                )));
        System.out.println(averageSalariesMap);
    }
}
