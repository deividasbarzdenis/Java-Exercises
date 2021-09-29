package com.genericsUdemy.generics.genericMethod;

public class Store {

    public void open(){
        System.out.println("Opening store...");
    }

    public <T extends Integer> void print(T num){
        System.out.println(num);
    }
}
