package main.java.learning.lessons.collections.list;

import java.util.Arrays;
import java.util.List;

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        List<String> str1 = Arrays.asList("To be or not to be".split(" "));
        ReversibleArrayList<String> str = new ReversibleArrayList<>(str1);
        ReversibleArrayList str2 = new ReversibleArrayList(str1);
        for (String s : str)
            System.out.print(s + " ");
        System.out.println();
        System.out.println("NOW REVERSE");
        for(String s : str.reversed())
            System.out.print(s);
    }
}
