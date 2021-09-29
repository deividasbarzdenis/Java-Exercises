package com.codeJava.objectOrdering;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    /*
    * Like the Comparable interface, this interface is also parameterized for any specific type.
    * The compare() method is similar except it takes both the objects to be compared as arguments.
    * The return value is also evaluated similarly .
    * For example, the following class compares two Employee objects using the Comparator interface:
    * */
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getJoinDate().compareTo(emp2.getJoinDate());
    }
}
