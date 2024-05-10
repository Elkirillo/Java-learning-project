package main.java.learning.lessons.patterns.factory.anonymclass;

public class FuelCars implements Engine {
    private FuelCars() {}
    @Override
    public void wheeling() {
        System.out.println("wheeling with noise wrooom");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine with noise wrooom");
    }

    public static EngineFactory factory = new EngineFactory() {
        @Override
        public Engine getEngine() {
            return new FuelCars();
        }
    };
}
