package com.codeJava.equals;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    /*
    * The equals()method is designed to compare two objects semantically (by comparing the data members of the class),
    * whereas the == operator compares two objects technically (by comparing their references i.e. memory addresses).
    * */
    public static void main(String[] args) {
        Student student1 = new Student("123", "Tom", "tom@gmail.com", 30);
        Student student2 = new Student("123", "Tom", "tom@gmail.com", 30);
        Student student3 = new Student("456", "Peter", "peter@gmail.com", 23);

        System.out.println("student1 == student2: " + (student1 == student2));
        System.out.println("student1.equals(student2): " + (student1.equals(student2)));
        System.out.println("student2.equals(student3): " + (student2.equals(student3)));

        // Example with a list:
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        Student searchStudent1 = new Student("123");
        Student searchStudent4 = new Student("789");

        boolean found1 = listStudents.contains(searchStudent1);
        boolean found4 = listStudents.contains(searchStudent4);

        System.out.println("Found student1: " + found1);
        System.out.println("Found student4: " + found4);
    }

    /**
     * The equals() method compares if two objects are equal semantically, e.g. comparing the data members of the class.
     * The hashCode()method returns an integer value which is used to distribute elements in buckets of a hashtable-based collection.
     * And remember the contract between equals() and hashCode()methods:
     * When the equals() method is overridden, the hashCode() method must be overridden as well.
     * If two objects are equal, their hash codes must be equal as well.
     * If two objects are not equal, there’s no constraint on their hash codes (their hash codes can be equal or not).
     * If two objects have identical hash codes, there’s no constraint on their equality (they can be equal or not).
     * If two objects have different hash codes, they must not be equal.
     * */
}
