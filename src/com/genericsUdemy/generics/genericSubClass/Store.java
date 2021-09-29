package com.genericsUdemy.generics.genericSubClass;

public class Store<T> extends Box{

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
