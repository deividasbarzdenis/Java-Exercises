package com.genericsUdemy.generics.multipleTypeParametrs;

public class Store<U, V> {
    U val1;
    V val2;

    public Store(U val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public U getVal1() {
        return val1;
    }

    public V getVal2() {
        return val2;
    }
}
