package main.java.learning.lessons.patterns.singletone;

public class SingletonImpl {

    private static SingletonImpl instance;

    private SingletonImpl() {}

    public static SingletonImpl getSingletone() {
        if (instance == null)
            instance = new SingletonImpl();
        return instance;
    }

    public String toString() {
        return "Singleton class has been initialized";
    }
}
