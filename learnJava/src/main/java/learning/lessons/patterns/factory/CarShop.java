package main.java.learning.lessons.patterns.factory;

public class CarShop {
    private final FactoryCars factoryCars;

    public CarShop(FactoryCars factoryCars) {
        this.factoryCars = factoryCars;
    }

    public Cars orderCar(CarType carType) {
        Cars car = factoryCars.createCur(carType);
        car.startEngine();
        car.offEngine();
        car.engine();
        return car;
    }

    public static void main (String[] args) {
        FactoryCars cars = new FactoryCars();
        CarShop carShop = new CarShop(cars);
        Cars car = carShop.orderCar(CarType.ELECTRIC);
        boolean cr = car instanceof ElectricCars;
        System.out.println(cr);
    }
}
