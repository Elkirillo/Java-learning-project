package main.java.learning.lessons.patterns.abstract_factory;

public class OrderCarForm {
    private TextField textField;
    private Select select;
    private  Button button;
    public OrderCarForm(GUIFactory factory) {
        System.out.println("Creating order car form");
        textField = factory.createTextField();
        select = factory.createSelectField();
        button = factory.createButton();
    }
}
