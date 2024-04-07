package main.java.learning.lessons.patterns.factory;

public class FactoryCars {
    public Cars createCur (CarType type) {
        return switch (type) {
            case REAL -> new TrueCars();
            case ELECTRIC -> new ElectricCars();
        };
    }
}
