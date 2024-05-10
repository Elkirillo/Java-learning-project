package main.java.learning.lessons.patterns.abstract_factory;

public class LinuxGUIFactory implements GUIFactory{

    public LinuxGUIFactory() {
        System.out.println("Creating gui factory for LINUX OS");
    }
    @Override
    public Button createButton() {
        System.out.println("Creating button for LINUX OS");
        return new LinuxButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating text field for LINUX OS");
        return new LinuxTextField();
    }

    @Override
    public Select createSelectField() {
        System.out.println("Creating select for LINUX OS");
        return new LinuxSelect();
    }
}
