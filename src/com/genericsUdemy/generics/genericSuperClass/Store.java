package com.genericsUdemy.generics.genericSuperClass;

public class Store<T> {
    T value;


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
