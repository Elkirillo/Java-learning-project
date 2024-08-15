package main.java.learning.lessons.rtti.example3;

import main.java.learning.lessons.rtti.example3.LiteralPetCreator;
import main.java.learning.lessons.rtti.example3.Pet;
import main.java.learning.lessons.rtti.example3.PetCreator;

import java.util.ArrayList;

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
