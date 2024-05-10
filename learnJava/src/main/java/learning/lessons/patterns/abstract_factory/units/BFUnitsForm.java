package main.java.learning.lessons.patterns.abstract_factory.units;

public class BFUnitsForm {
    private Assault assault;
    private Medic medic;
    private Sniper sniper;

    public BFUnitsForm (CreateUnitFactory unitFactory) {
        System.out.println("Creation army unit");
        sniper = unitFactory.createSniper();
        medic = unitFactory.createMedic();
        assault = unitFactory.createAssault();
    }
}
