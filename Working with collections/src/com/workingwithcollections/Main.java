package com.workingwithcollections;

import com.workingwithcollections.models.Cat;
import com.workingwithcollections.models.Dog;
import com.workingwithcollections.models.Owl;
import com.workingwithcollections.models.Pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Map<String, Pet> hashMap = getHashMap();
        showHashMap(hashMap);
        showCountOfRandomNumbersRepetitions();
    }

    private static Map<String, Pet> getHashMap() {
        Map<String, Pet> hashMap = new HashMap<>();
        hashMap.put("Кот", new Cat("Мурзик"));
        hashMap.put("Собака", new Dog("Бобик"));
        hashMap.put("Сова", new Owl("Антоха"));
        return hashMap;
    }

    private static void showHashMap(Map<String, Pet> hashMap) {
        for (Map.Entry<String, Pet> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; value: " + entry.getValue().getName());
        }
    }

    private static void showCountOfRandomNumbersRepetitions() {
        Random random = new Random(36);
        //key - generated number; value - repetitions count
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 100; i++){
            int number = random.nextInt(10);
            Integer frequency = hashMap.get(number);
            hashMap.put(number, frequency == null ? 1 : ++frequency);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + "; repetitions: " + entry.getValue());
        }
    }
}
