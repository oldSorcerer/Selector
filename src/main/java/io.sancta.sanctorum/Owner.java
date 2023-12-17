package io.sancta.sanctorum;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Owner {

    final String name;
    @Getter
    final List<Animal> pets = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }
}
