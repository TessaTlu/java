package com.generics.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Onigiri {

    public <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> res = new ArrayList<>();
        for (T elm : elements)
            res.add(elm);
        return res;
    }

    public <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> res = new HashSet<>();
        for (T elm : elements)
            res.add(elm);
        return res;
    }

    public <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size())
            throw new IllegalArgumentException();

        HashMap<K, V> res = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            res.put(keys.get(i), values.get(i));
        }
        return res;
    }
}