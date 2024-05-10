package main.java.learning.lessons.patterns.abstract_factory.units;

public interface CreateUnitFactory {
    Assault createAssault();
    Medic createMedic();
    Sniper createSniper();
}
