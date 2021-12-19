package com.generics.utils;

public class ArrayIndexGetter {

    public <E> E get(int index, E... items) {
        return items[index];
    }
}
