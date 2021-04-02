package com.company.combineListFunctions;

import com.company.streamExercise.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineListFunctions {
    public static void main(String[] args) {
        com.company.streamExercise.Employee[] emplArr = {
                new com.company.streamExercise.Employee("John", 34, "developer", 80000f),
                new com.company.streamExercise.Employee("Hannah", 24, "developer", 95000f),
                new com.company.streamExercise.Employee("Bart", 50, "sales executive", 100000f),
                new com.company.streamExercise.Employee("Sophie", 49, "construction worker", 40000f),
                new com.company.streamExercise.Employee("Darren", 38, "writer", 50000f),
                new com.company.streamExercise.Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(emplArr));

        Float totalDeveloperSalaries = employees
                .stream()
                .filter(employee -> employee.jobTitle.equals("developer"))
                .map( developer -> developer.salary)
                .reduce(0f, (acc, x) -> acc + x);

        Long numberOfDevelopers = employees
                .stream()
                .filter( developer -> developer.jobTitle.equals("developer"))
                .collect(Collectors.counting());

        Float averageDeveloperSalary = totalDeveloperSalaries / numberOfDevelopers;
        System.out.println("Average developer: " + averageDeveloperSalary);
    }
}
