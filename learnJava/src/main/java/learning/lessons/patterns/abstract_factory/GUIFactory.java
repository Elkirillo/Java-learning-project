package main.java.learning.lessons.patterns.abstract_factory;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
    Select createSelectField();
}
