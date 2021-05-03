package com.genericsUdemy.generics.lowerBoundWildCards;

public class Main {
    public static void main(String[] args) {

        var countries = new String[]{"Nigeria", "India", "USA"};
        var scores = new Integer[]{22, 46, 66, 92};

        var store1 = new Store<>(countries);
        var store2 = new Store<>(scores);

        System.out.println(store2.list.length);
        System.out.println(store1);
        System.out.println(store2);

        System.out.println(store1.greaterThan(store2));


    }
}
