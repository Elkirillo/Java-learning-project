package main.java.learning.lessons.map.helppack;

public class Cat implements Pet{
    private String name;
    @Override
    public void voice() {
        System.out.println("meow");
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
