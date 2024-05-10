package main.java.learning.lessons.patterns.abstract_factory.units;

public class USUnitsFactory implements CreateUnitFactory{

    public USUnitsFactory() {
        System.out.println("US army creating");
    }
    @Override
    public Assault createAssault() {
        System.out.println("US Assault with m4 creating");
        return new USAAssault();
    }

    @Override
    public Medic createMedic() {
        System.out.println("US Assault with m16 creating");
        return new USAMedic();
    }

    @Override
    public Sniper createSniper() {
        System.out.println("US Assault with gol magnum creating");
        return new USASniper();
    }
}
