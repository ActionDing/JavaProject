package com.ding.polymorphic;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
}
