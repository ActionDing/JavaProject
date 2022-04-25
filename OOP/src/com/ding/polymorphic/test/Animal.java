package com.ding.polymorphic.test;

public class Animal {
    public String name;
    public int age = 100;

    public int field = 0;

    public int getField (){
        return field;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Animal eat()");
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
