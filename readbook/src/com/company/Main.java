package com.company;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Farewell to arm", "Hemingway", 1337);
        System.out.println(b1.toString());
        System.out.println(b1.isBoring());
    }
}

