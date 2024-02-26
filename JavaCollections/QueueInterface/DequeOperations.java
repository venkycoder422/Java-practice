package JavaCollections.QueueInterface;

import java.util.ArrayDeque;

public class DequeOperations {
    public static void main(String[] args) {

        // Insertion from Head offerFirst(e) addFirst(e)
        // Removal from Head pollFirst() removeFirst()
        // Retrieval from Head peekFirst() getFirst()
        // Insertion from Tail offerLast(e) addLast(e)
        // Removal from Tail pollLast() removeLast()
        // Retrieval from Tail peekLast() getLast()
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("Dog");
        deque.offer("Cat");
        deque.push("Donkey");
        System.out.println(deque);

        // Adding elements to the deque
        deque.addFirst("First");
        deque.addLast("Last");

        // Adding elements as a stack (LIFO)
        deque.push("Pushed");

        // Accessing elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Removing elements
        System.out.println("Popped element: " + deque.pop());
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

    }
}
