package main.java.learning.lessons.rtti.example3;

import lombok.Getter;
import lombok.Setter;

public class Individuals {
    @Getter
    @Setter
    private String name;

    Individuals() {

    }
    Individuals(String name) {
        this.name = name;
    }
}
