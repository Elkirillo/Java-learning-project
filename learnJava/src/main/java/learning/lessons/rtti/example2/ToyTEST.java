package main.java.learning.lessons.rtti.example2;
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {super(1);}
}
public class ToyTEST {
    static void printInfo (Class cc) {
        System.out.println("имя класса: " + cc.getName() + " это интерфейс: [" + cc.isInterface() + "]");
        System.out.println("простое имя - " + cc.getSimpleName());
        System.out.println("каноническое имя - " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("main.java.learning.lessons.rtti.example2.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("не найден класс Funcy");
        }
        printInfo(c);
        for(Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("не удалось создать объект");
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            System.out.println("Нет доступа");
            throw new RuntimeException(e);
        }
        printInfo(obj.getClass());
    }
}
