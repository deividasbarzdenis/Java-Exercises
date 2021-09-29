package com.genericsUdemy.generics.genericSuperClass;

public class Home {
    public static void main(String[] args) {
        var box= new Box<Integer>(); // I have to put type argument is <> because constructor don't created
        // and Java doesn't know type argument passed-in.

        box.value = 7;
        int x = box.getValue();
        System.out.println(x);

        var box1= new Box<String>();
        box1.value = "Hello";
        String y = box1.getValue();
        System.out.println(y);

    }
}
