package com.usingexceptions.model;

public class User {

    private String name;
    private String INN;

    public User(String name, String INN) {
        this.name = name;
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public String getINN() {
        return INN;
    }
}
