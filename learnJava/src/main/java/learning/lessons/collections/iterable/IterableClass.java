package main.java.learning.lessons.collections.iterable;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] words = ("Shokoladki bruh earth wooohooo like banana").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass())
            System.out.println(s + " ");
    }


}
