package com.genericsUdemy.generics.genericInterfaces;

public class Store<T> implements Operation<T> {
    T[] values;

    public Store(T[] values) {
        this.values = values;
    }

    @Override
    public T get(int position) {
        return values[position];
    }

    @Override
    public void replace(int position, T value) {
        values[position] = value;
    }
}
