package com.workingwithcollections.models;

public class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
