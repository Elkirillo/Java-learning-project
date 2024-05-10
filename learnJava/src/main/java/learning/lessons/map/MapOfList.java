package main.java.learning.lessons.map;

import main.java.learning.lessons.map.helppack.Cat;
import main.java.learning.lessons.map.helppack.Dog;
import main.java.learning.lessons.map.helppack.Person;
import main.java.learning.lessons.map.helppack.Pet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {
    public static Map <Person, List<? extends Pet>> peoplePet = new HashMap<>();
    static {
        peoplePet.put(new Person("Mike"),
                Arrays.asList(new Cat("Vasya"),
                        new Dog("Chernysh")));
        peoplePet.put(new Person("Zina"),
                Arrays.asList(new Cat("Gosha"),
                        new Cat("Georginya"),
                        new Cat("Motya")));
    }

    public static void main(String[] args) {
        System.out.println("People" + peoplePet.keySet());
        System.out.println("Pets" + peoplePet.values());
        for (Person person : peoplePet.keySet()) {
            System.out.print(person + " has ");
            for (Pet pet : peoplePet.get(person)) {
                System.out.print(" " + pet);
            }
            System.out.println();
        }
    }
}
