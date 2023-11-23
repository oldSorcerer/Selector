package io.sancta.sanctorum;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private final String name;
    private final List<Animal> pets = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public List<Animal> getPets() {
        return pets;
    }
}
