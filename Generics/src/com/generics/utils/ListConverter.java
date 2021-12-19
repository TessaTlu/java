package com.generics.utils;

import java.util.ArrayList;
import java.util.List;

public class ListConverter {

    public <E> List<E> convert(E... items) {
        List<E> list = new ArrayList<>();
        for (E item : items) {
            list.add(item);
        }
        return list;
    }
}
