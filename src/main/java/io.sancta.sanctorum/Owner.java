package io.sancta.sanctorum;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private final String name;
    @Getter
    private final List<Animal> pets = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }
}
