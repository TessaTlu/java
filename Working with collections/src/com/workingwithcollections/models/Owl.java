package com.workingwithcollections.models;

public class Owl extends Pet {

    public Owl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
