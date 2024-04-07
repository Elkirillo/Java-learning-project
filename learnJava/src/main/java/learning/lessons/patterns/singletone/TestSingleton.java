package main.java.learning.lessons.patterns.singletone;

public class TestSingleton {
    public static void main (String[] args) {
        SingletonImpl singleton = SingletonImpl.getSingletone();
        SingletonImpl singleton1 = SingletonImpl.getSingletone();
        System.out.println(singleton + " hashcode = " + singleton.hashCode());
        System.out.println(singleton1 + " hashcode = " + singleton1.hashCode());
    }
}
