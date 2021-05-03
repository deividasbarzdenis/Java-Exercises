package com.genericsUdemy.generics.boundedTypes;

public class Store<T extends Number> {

    private T value;

    public Store(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
