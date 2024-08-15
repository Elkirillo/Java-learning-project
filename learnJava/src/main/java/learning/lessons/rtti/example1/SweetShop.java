package main.java.learning.lessons.rtti.example1;


class Candy {
    static {System.out.println("Загрузка класса Candy");}
}
class Gum {
    static {System.out.println("Загрузка класса Gum");}
}
class Cookie {
    static {System.out.println("Загрузка класса Cookie");}
}
public class SweetShop {
    public static void main(String[] args) {

        System.out.println("в main");
        new Candy();
        System.out.println("создали объект Candy");
        try {
            Class.forName("main.java.learning.lessons.rtti.example1.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("объект Gum не найден");
        }
        System.out.println("После вызова метода Class.forName(\"Gum\");");
        new Cookie();
        System.out.println("создали объект Cookie");

        System.out.println(123% 6);
    }
}
