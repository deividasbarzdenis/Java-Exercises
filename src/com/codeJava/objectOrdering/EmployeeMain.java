package com.codeJava.objectOrdering;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) throws ParseException {
        /*List<Employee> listEmployees = new ArrayList<>();
        Employee employee1 = new Employee("Tom", "Eagar");
        Employee employee2 = new Employee("Tom", "Smith");
        Employee employee3 = new Employee("Bill", "Joy");
        Employee employee4 = new Employee("Bill", "Gates");
        Employee employee5 = new Employee("Alice", "Wooden");
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        listEmployees.add(employee4);
        listEmployees.add(employee5);

        System.out.println("Before sorting: " + listEmployees);
        Collections.sort(listEmployees);
        System.out.println("After sorting: " + listEmployees);

        // The following example demonstrates how to use a TreeSet to sort Strings:
        Set<String> setNames = new TreeSet<>();
        setNames.addAll(Arrays.asList("Tom", "Peter", "Alice", "Bob", "Sam",
                "Mary", "Jane", "Bill", "Tim", "Kevin"));
        System.out.println(setNames);

        // Similarly, we can sort the Employee objects using a TreeSet like this:
        Set<Employee> setEmployees = new TreeSet<>();
        Employee eemployee1 = new Employee("Tom", "Eagar");
        Employee eemployee2 = new Employee("Tom", "Smith");
        Employee eemployee3 = new Employee("Bill", "Joy");
        Employee eemployee4 = new Employee("Bill", "Gates");
        Employee eemployee5 = new Employee("Alice", "Wooden");
        setEmployees.add(eemployee1);
        setEmployees.add(eemployee2);
        setEmployees.add(eemployee3);
        setEmployees.add(eemployee4);
        setEmployees.add(eemployee5);
        System.out.println(setEmployees);*/

        // Sorted Employee list according the date using Comparator:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Employee> listEmployeesCom = new ArrayList<>();
        Employee employee12 = new Employee("Tom", "Eagar", dateFormat.parse("2007-12-03"));
        Employee employee22 = new Employee("Tom", "Smith", dateFormat.parse("2005-06-20"));
        Employee employee32 = new Employee("Bill", "Joy", dateFormat.parse("2009-01-31"));
        Employee employee42 = new Employee("Bill", "Gates", dateFormat.parse("2005-05-12"));
        Employee employee52 = new Employee("Alice", "Wooden", dateFormat.parse("2009-01-22"));
        listEmployeesCom.add(employee12);
        listEmployeesCom.add(employee22);
        listEmployeesCom.add(employee32);
        listEmployeesCom.add(employee42);
        listEmployeesCom.add(employee52);
        System.out.println("Before sorting: ");
        System.out.println(listEmployeesCom);
        listEmployeesCom.sort(new EmployeeComparator());
        System.out.println("After sorting: ");
        System.out.println(listEmployeesCom);
        listEmployeesCom.sort((emp1, emp2) -> emp1.getJoinDate().compareTo(emp2.getJoinDate()));
    }

    /*
    * Since Java 8, we can use Lambda expressions to create a comparator more easily like this:
Collections.sort(listEmployees,
(emp1, emp2) -> emp1.getJoinDate().compareTo(emp2.getJoinDate()));
We can also pass a comparator when creating a new instance of a TreeSet like this:
Set<Employee> setEmployees = new TreeSet<>(new EmployeeComparator());
Then the TreeSet will sort its elements according to the order defined by the specified comparator.
Using a comparator is useful in the following scenarios:
The class doesn’t have natural ordering (or we don’t have source code to update it).
We want to sort objects in orders other than the natural ordering.
We want to provide multiple ways for sorting the objects, e.g. one comparator for each sorting criteria.
    * */
}
