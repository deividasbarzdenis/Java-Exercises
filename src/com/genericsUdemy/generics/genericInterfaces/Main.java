package com.genericsUdemy.generics.genericInterfaces;

public class Main {
    public static void main(String[] args) {
        var values = new Integer[]{45, 22, 12, 90};
        var values1 = new String[]{"45", "22", "Hello", "lol"};
        var store1 = new Store<>(values1);
        var store = new Store<>(values);
        System.out.println(store.get(1));
        System.out.println(store1.get(2));
    }
}
