package com.genericsUdemy.generics.rawTypes;

public class Store<T> {

    private T value;

    public Store(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
