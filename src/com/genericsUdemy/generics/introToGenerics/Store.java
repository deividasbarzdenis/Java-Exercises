package com.genericsUdemy.generics.introToGenerics;

public class Store<T> {
    T t;

    public Store(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    public void valueClass() {
        System.out.println(t.getClass());
    }
}
