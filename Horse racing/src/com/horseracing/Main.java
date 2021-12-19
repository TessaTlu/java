package com.horseracing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> horses = getHorses();
        for (int i = 0; i < 10; i++) {
            doNextAction(horses);
        }
        for (int i = 0; i < horses.size(); i++) {
            System.out.println(i + 1 + ": " + horses.get(i));
        }
    }

    static void doNextAction(ArrayList<String> horses) {
        Thread t = new Thread() {
            @Override
            public void run() {
                Random random = new Random();
                int i = random.nextInt(horses.size());
                int j = random.nextInt(horses.size());
                swap(horses, i, j);
            }
        };
        t.start();
    }

    static ArrayList<String> getHorses() {
        ArrayList<String> horses = new ArrayList<>();
        horses.add("Пожилая лошадка");
        horses.add("Агент орифлейм");
        horses.add("Юлий");
        horses.add("Энигма");
        horses.add("Орландо");
        horses.add("Декстер");
        horses.add("Руфус");
        horses.add("Ланселот");
        return horses;
    }

    static synchronized void swap(ArrayList<String> list, int i, int j) {
        Collections.swap(list, i, j);
    }
}
