package com.genericsUdemy.generics.rawTypes;

public class Home {
    public static void main(String[] args) {
        var store = new Store(45); //Raw type, but is type not-safe.
        int x = (Integer) store.getValue(); // import is cast, and do not forget to change.
    }
}
