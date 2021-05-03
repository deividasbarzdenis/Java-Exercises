package com.genericsUdemy.generics.boundedWildCards;

public class Main {
    public static void main(String[] args) {

        var countries = new String[]{"Nigeria", "India", "USA"};
        var names = new String[]{"John", "James", "Daniel"};
        var scores = new Integer[]{22, 46, 66, 92};

        var store1 = new Store<>(countries);
        var store2 = new Store<>(scores);
        var store3 = new Store<>(names);

        System.out.println(store2.list.length);
        System.out.println(store1);
        System.out.println(store2);

        //System.out.println(store1.greaterThan(store3));
        System.out.println(store1.greaterThan(store2));


    }
}
