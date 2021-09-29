package com.codeJava.objectOrdering;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Employee.java
 *
 * @author debarz
 */
public class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    Date joinDate;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, Date joinDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

/*    @Override
    public String toString() {
        return firstName + " " +lastName ;
    }*/

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return firstName + " " + lastName + " " + dateFormat.format(joinDate);
    }

    /*
     * First, we compare the first name by using the String’s compareTo() method. We can safely use this method of
     * the built-in types in Java: String, Date, Integer, Long, etc.
     * If two employees have same first name (compare value = 0), then we compare their last name. Finally, the compare
     * value is returned as per the contract of the Comparable interface.
     * */
    @Override
    public int compareTo(Employee o) {
        int compareValue = this.firstName.compareTo(o.firstName);
        if (compareValue == 0) {
            return this.lastName.compareTo(o.lastName);
        }
        return compareValue;
    }
}
