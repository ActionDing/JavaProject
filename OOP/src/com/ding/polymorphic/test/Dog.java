package com.ding.polymorphic.test;

public class Dog extends Animal {

    public int field = 1;

    public int getField (){
        return field;
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat() " + this.name);
    }
}
