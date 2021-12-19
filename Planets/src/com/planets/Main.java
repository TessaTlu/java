package com.planets;

import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";

        PlanetArrayList<String> solarSystem1 = new PlanetArrayList<>(Arrays.asList(mercury, venus, earth));
        PlanetArrayList<String> solarSystem2 = new PlanetArrayList<>(Arrays.asList(mars, jupiter, earth));
        //its own implementation is used,
        //because for Collections.unmodifiableList() you need to do a lot in PlanetArrayList
        solarSystem2.setModifiable(false);
        FunctionsTest functionsTest = new FunctionsTest();
        try {
            functionsTest.runTests(solarSystem1);
            functionsTest.runTests(solarSystem2);
        } catch (ConcurrentModificationException e) {
            System.out.println("This list isn't mutable");
        }
        swap(solarSystem1, 0, 1);
        System.out.println("solarSystem1 after swap: " + solarSystem1);
    }

    //methods from doc

    /**
     * Swaps the elements at the specified positions in the specified list.
     * (If the specified positions are equal, invoking this method leaves
     * the list unchanged.)
     *
     * @param list The list in which to swap elements.
     * @param i the index of one element to be swapped.
     * @param j the index of the other element to be swapped.
     * @throws IndexOutOfBoundsException if either {@code i} or {@code j}
     *         is out of range (i &lt; 0 || i &gt;= list.size()
     *         || j &lt; 0 || j &gt;= list.size()).
     */
    public static void swap(List<?> list, int i, int j) {
        final List l = list;
        l.set(i, l.set(j, l.get(i)));
    }
}
