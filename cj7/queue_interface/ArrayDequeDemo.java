package cj7.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        System.out.println(" Deque: " + deque);

        // Adding at the front
        deque.addFirst("First");
        // Adding at the end
        deque.addLast("Last");

        System.out.println("After adding " + deque);

        // Removing from front
        String front = deque.removeFirst();
        System.out.println("Removed First: " + front);

        // Removing from end
        String last = deque.removeLast();
        System.out.println("Removed Last: " + last);

        System.out.println("Final Deque: " + deque);
    }
}
