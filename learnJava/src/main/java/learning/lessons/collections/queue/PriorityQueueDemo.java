package main.java.learning.lessons.collections.queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            priorityQueue.offer(rand.nextInt(i+10));
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 12, 0, 1, 40);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "GRIBOLDA IS THE BEST RAPPER";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPriorityQueue);


    }
}
