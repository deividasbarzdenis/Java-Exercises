package com.genericsUdemy.generics.genericWildCards;

import java.util.Arrays;

public class Store<T> {
    T[] list;

    public Store(T[] list) {
        this.list = list;
    }

    public Boolean greaterThan(Store<?> otherStore){
        if(list.length > otherStore.list.length){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Store{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
