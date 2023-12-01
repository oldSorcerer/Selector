package io.sancta.sanctorum;

import lombok.Getter;

@Getter
public abstract class Animal {

    private final String name;
    private final Color color;
    private final int age;

    public Animal(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
