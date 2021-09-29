package com.codeJava.equals;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;

        return studentInfo;
    }

    // equals() method with all attribute compare:
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, age);
    }*/


    /*
    * he reference comparison (== operator) returns false because s1and s2 are two different objects which are stored
    *  in different locations in memory. Whereas the semantic comparison returns true because s1 and s2 has same value
    * (“This is a string”) which can be considered equal semantically.
    * */
    // equals method checking just id:
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student another = (Student) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
        }
        return false;
    }

    /*
    * As explained above, as hashtable-based collection locates an element by invoking its hashCode() and equals()
    * methods, so we must obey this contract with regard to the way we override these methods:
When the equals() method is overridden, the hashCode() method must be overridden as well.
If two objects are equal, their hash codes must be equal as well.
If two objects are not equal, there’s no constraint on their hash codes (their hash codes can be equal or not).
If two objects have identical hash codes, there’s no constraint on their equality (they can be equal or not).
If two objects have different hash codes, they must not be equal.
By following these rules, we keep the collections consistent in maintaining its elements. If we violate these rules,
* the collections will behave unexpectedly such as the objects cannot be found, or wrong objects are returned instead
* of the correct ones.
    * */

    /*
    * This hash number is used by hashtable-based collections like Hashtable, HashSet and HashMap to store objects in
    * small containers called “buckets”. Each bucket is associated with a hash code, and each bucket contains only
    * objects having identical hash code.
In other words, a hashtable groups its elements by their hash code values. This arrangement helps the hashtable
* locates an element quickly and efficiently by searching on small parts of the collection instead the whole collection.
Here are the steps to locate an element in a hashtable:
Get hash code value of the specified element. This results in the hashCode() method to be invoked.
Find the right bucket associated with that hash code.
Inside the bucket, find the correct element by comparing the specified element with all the elements in the bucket.
* This results in the equals() method of the specified element to be invoked.
Having said that, when we add objects of a class to a hashtable-based collection (HashSet, HashMap), the class’s
* hashCode() method is invoked to produce an integer number (which can be an arbitrary value). This number is used
* by the collection to store and locate the objects quickly and efficiently, as a hashtable-based collection does
* not maintain order of its elements.
    * */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
