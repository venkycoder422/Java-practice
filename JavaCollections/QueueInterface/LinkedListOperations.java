package JavaCollections.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListOperations {
    public static void main(String[] args) {
        // Queue offer below operation
        // offer() – Inserts a new element onto the Queue
        // poll() – Removes an element from the front of the Queue
        // peek() – Inspects the element at the front of the Queue, without removing it

        Queue<Integer> queueData = new LinkedList<Integer>();
        queueData.add(1);
        queueData.add(2);
        System.out.println(queueData.element());
        queueData.offer(3);
        System.out.println(queueData.peek());
        System.out.println(queueData.poll());
        System.out.println("After removed the data:" + queueData);
        queueData.remove();
        System.out.println(queueData);

    }
}
