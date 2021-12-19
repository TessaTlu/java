package com.workingwithcollections.models;

public class Dog extends Pet {

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
