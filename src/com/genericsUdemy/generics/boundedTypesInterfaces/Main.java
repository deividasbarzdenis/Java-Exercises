package com.genericsUdemy.generics.boundedTypesInterfaces;

public class Main {
    public static void main(String[] args) {
        var store = new Store<>(new Ferrari());
        var store1 = new Store<>(new Lambo());
    }
}
