package main.java.learning.lessons.patterns.abstract_factory.units;

import java.util.Scanner;

public class TestGame {
    public void createUnit() {
        System.out.println("Choose you national");
        Scanner in = new Scanner(System.in);
        String national = in.nextLine().toLowerCase();
        in.close();
        CreateUnitFactory factory;
        if (national.startsWith("us")) {
            factory = new USUnitsFactory();
        } else {
            factory = new RussianUnitsFactory();
        }
        new BFUnitsForm(factory);
    }

    static public void main (String [] args) {
        TestGame testGame = new TestGame();
        testGame.createUnit();
    }
}
