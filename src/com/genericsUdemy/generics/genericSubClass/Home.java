package com.genericsUdemy.generics.genericSubClass;

public class Home {
    public static void main(String[] args) {
        var store = new Store<>(77);
        store.open();

    }
}
