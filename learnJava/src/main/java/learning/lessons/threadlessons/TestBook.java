package main.java.learning.lessons.threadlessons;

public class TestBook {
    int val1;
    static boolean test1(int val) {
        System.out.print("test1(" + val + ")");
        System.out.print("результат" + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.print("test2(" + val + ")");
        System.out.print("результат" + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        System.out.print("test2(" + val + ")");
        System.out.print("результат" + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        System.out.println("выражение: " + b);
        int x = 0, y = 1, z =2;
        String s = "x, y, z";
        System.out.println(s + x + y + z);
    }
}
