package main.java.learning.lessons.patterns.abstract_factory;

public class WindowsGUIFactory implements GUIFactory{

    public WindowsGUIFactory() {
        System.out.println("Creating gui factory for Windows OS");
    }
    @Override
    public Button createButton() {
        System.out.println("Creating button for Windows OS");
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating text field for Windows OS");
        return new WindowsTextField();
    }

    @Override
    public Select createSelectField() {
        System.out.println("Creating select field for Windows OS");
        return new WindowsSelect();
    }
}
