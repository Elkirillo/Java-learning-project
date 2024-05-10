package main.java.learning.lessons.patterns.factory.anonymclass;


public class Factories {
    public static void shopCars(EngineFactory fact) {
        Engine carEngine = fact.getEngine();
        carEngine.startEngine();
        carEngine.wheeling();
    }
    public static void main (String[] args) {
        shopCars(ElectricCars1.factory);
        shopCars(FuelCars.factory);

    }
}
