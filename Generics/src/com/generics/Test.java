package com.generics;

import com.generics.utils.*;

import java.util.Arrays;
import java.util.List;

public class Test {

    String[] testStrings = {"ich", "ni", "san", "kai", "oshiriedesu"};
    Integer[] testNumbers = {43, 23, 655, 7};
    Long[] testLongs = {65L, 93244L, 981122L};


    public void testIch() {
        ListConverter converter = new ListConverter();
        List<Integer> numberList = converter.convert(testNumbers);
        List<String> stringsList = converter.convert(testStrings);
        System.out.println(numberList);
        System.out.println(stringsList);
        System.out.println("_________________________");
    }


    public void testNi() {
        ArrayContainer<Long> longsArrContainer = new ArrayContainer<>(testLongs);
        ArrayContainer<Integer> numbersArrContainer = new ArrayContainer<>(testNumbers);

        System.out.println("Ints: ");
        for (Integer num : numbersArrContainer.getArray()) {
            System.out.println(num);
        }
        System.out.println("Longs: ");
        for (Long lng : longsArrContainer.getArray()) {
            System.out.println(lng);
        }
        System.out.println("_________________________");
    }

    public void testSan() {
        System.out.println("Getting element by index:");
        ArrayIndexGetter indexGetter = new ArrayIndexGetter();
        System.out.println("At index ni in strings: " + indexGetter.get(2, testStrings));
        System.out.println("At index san in numbers: " + indexGetter.get(3, testNumbers));
        System.out.println("At index ich in longs: " + indexGetter.get(1, testLongs));
        System.out.println("_________________________");
    }

    public void testKai() {
        System.out.println("Out catalog: ");
        FileList fileList = new FileList();
        fileList.printFiles("./out");
        System.out.println("_________________________");
    }

    public void testOshiriedesu() {
        Onigiri onigiri = new Onigiri();
        System.out.println(onigiri.newArrayList(testStrings));
        System.out.println(onigiri.newHashSet(testStrings));
        List<String> keys = Arrays.asList("ich", "ni", "san");
        List<Integer> values = Arrays.asList(1, 2, 3);
        System.out.println(onigiri.newHashMap(keys, values));
        System.out.println("_________________________");
    }
}
