package com.planets;

import java.util.Arrays;
import java.util.ConcurrentModificationException;

public class FunctionsTest {

    public void runTests(PlanetArrayList<String> planetList) throws ConcurrentModificationException {
        System.out.println("Original list: " + planetList);
        planetList.add("Test planet");
        System.out.println("After adding: " + planetList);
        planetList.remove(3);
        System.out.println("After removing: " + planetList);
        String oldItem = planetList.get(0);
        planetList.set(0, "Changed " + oldItem);
        System.out.println("After changing: " + planetList);
        System.out.println("Before shuffle: ");
        System.out.println(planetList);
        planetList.shuffle();
        System.out.println("After shuffle: ");
        System.out.println(planetList);
        System.out.println("Random planet: " + planetList.getRandomPlanet());
        System.out.println("Index of Венера: " + planetList.indexOf("Венера"));
        System.out.println("planetList contains Венера:" + planetList.contains("Венера"));
        System.out.println("planetList contains абоба:" + planetList.contains("абоба"));
    }
}
