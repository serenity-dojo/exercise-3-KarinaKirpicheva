package com.serenitydojo;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name) {
        this.name = name;
}

    public String getName() {
        return name;
    }

    public Pet(String name, int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract String play();
}
