package com.genericsUdemy.generics.multipleTypeParametrs;

public class Main {
    public static void main(String[] args) {
        var store = new Store<>("hello", 4);
        int a = store.getVal2();
    }
}
