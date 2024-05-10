package main.java.learning.lessons.patterns.abstract_factory.units;

public class RussianUnitsFactory implements CreateUnitFactory {

    public RussianUnitsFactory () {
        System.out.println("Russian army creating");
    }
    @Override
    public Assault createAssault() {
        System.out.println("US Assault with ak74 creating");
        return new RussianAssault();
    }

    @Override
    public Medic createMedic() {
        System.out.println("US Assault with AEK creating");
        return new RussianMedic();
    }

    @Override
    public Sniper createSniper() {
        System.out.println("US Assault with SVD creating");
        return new RussianSniper();
    }
}
