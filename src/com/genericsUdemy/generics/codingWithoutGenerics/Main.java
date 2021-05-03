package com.genericsUdemy.generics.codingWithoutGenerics;

public class Main {
    public static void main(String[] args) {
        Object x = 4;
        Object y = "4";
        Object z = '4';
        System.out.println(x.getClass());
        System.out.println(y.getClass());
        System.out.println(z.getClass());
        //----------------------------------------------

        var s = new Store(4);
        int v = (Integer) s.getValue();
    }
}
