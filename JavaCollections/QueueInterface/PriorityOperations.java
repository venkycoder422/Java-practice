package JavaCollections.QueueInterface;

import java.util.PriorityQueue;

public class PriorityOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(9);
        priorityQueue.offer(4);
        priorityQueue.offer(12);
        priorityQueue.offer(2);
        System.out.println(priorityQueue);

        PriorityQueue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("blueberry");
        stringQueue.add("apple");
        stringQueue.add("cherry");

        System.out.println(stringQueue);
    }
}
