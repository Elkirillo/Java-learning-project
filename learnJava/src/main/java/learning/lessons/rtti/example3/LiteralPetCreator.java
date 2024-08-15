package main.java.learning.lessons.rtti.example3;

import main.java.learning.lessons.rtti.example3.cat.Cat;
import main.java.learning.lessons.rtti.example3.cat.Cymric;
import main.java.learning.lessons.rtti.example3.cat.EgyptianMau;
import main.java.learning.lessons.rtti.example3.cat.Manx;
import main.java.learning.lessons.rtti.example3.dog.Dog;
import main.java.learning.lessons.rtti.example3.dog.Mutt;
import main.java.learning.lessons.rtti.example3.dog.Pug;
import main.java.learning.lessons.rtti.example3.rodent.Hamster;
import main.java.learning.lessons.rtti.example3.rodent.Mouse;
import main.java.learning.lessons.rtti.example3.rodent.Rat;
import main.java.learning.lessons.rtti.example3.rodent.Rodent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class,
                    EgyptianMau.class, Cymric.class, Manx.class,
                    Hamster.class, Mouse.class, Rat.class
            ));
    //Типы для случайного создания
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }
}
