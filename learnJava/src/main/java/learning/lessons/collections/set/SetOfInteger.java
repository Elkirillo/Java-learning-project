package main.java.learning.lessons.collections.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    public static void main (String[] args) {
        Random rand = new Random(47);
        Set<Integer> insert = new HashSet<>(); //use TreeSet for sorted set if u need it
        for (int i = 0; i < 10000; i++)
            insert.add(rand.nextInt(30));
        System.out.println(insert);
    }
}
