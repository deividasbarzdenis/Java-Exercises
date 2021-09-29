package com.genericsUdemy.generics.genericConstructor;

public class Store {

    public <T extends Number> Store(T value) {
        System.out.println("Starting " + value);
    }
    public  void greet(){
        System.out.println("Hello...");
    }
}
