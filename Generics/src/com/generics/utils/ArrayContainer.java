package com.generics.utils;

public class ArrayContainer<T> {

    private T[] array;

    public ArrayContainer() {

    }

    public ArrayContainer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
