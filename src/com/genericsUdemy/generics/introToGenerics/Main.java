package com.genericsUdemy.generics.introToGenerics;

public class Main {
    public static void main(String[] args) {
        Store<Integer> store = new Store<>(4);
        var store1 = new Store<>("four");
        int x = store.getT();
        String y = store1.getT();
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }
}
