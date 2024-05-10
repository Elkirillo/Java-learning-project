package main.java.learning.lessons.map.helppack;

public class Dog implements Pet {
    private String name;
    @Override
    public void voice() {
        System.out.println("wooof");
    }

    public Dog (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }

}
