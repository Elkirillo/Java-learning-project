package main.java.learning.lessons.patterns.factory.anonymclass;

public class ElectricCars1 implements Engine {
    

    private ElectricCars1() {};

    @Override
    public void wheeling() {
        System.out.println("wheeling without noise");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine without noise");
    }
    public static EngineFactory factory = ElectricCars1::new;
}
