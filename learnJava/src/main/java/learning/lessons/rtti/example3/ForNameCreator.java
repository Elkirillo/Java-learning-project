package main.java.learning.lessons.rtti.example3;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{

    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeNames = {
            "main.java.learning.lessons.rtti.example3.cat.Cymric",
            "main.java.learning.lessons.rtti.example3.cat.EgyptianMau",
            "main.java.learning.lessons.rtti.example3.cat.Manx",
            "main.java.learning.lessons.rtti.example3.dog.Pug",
            "main.java.learning.lessons.rtti.example3.dog.Mutt",
            "main.java.learning.lessons.rtti.example3.rodent.Hamster",
            "main.java.learning.lessons.rtti.example3.rodent.Mouse",
            "main.java.learning.lessons.rtti.example3.rodent.Rat",
    };

    private static void loader() {
        try {
            for(String name : typeNames) {
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
