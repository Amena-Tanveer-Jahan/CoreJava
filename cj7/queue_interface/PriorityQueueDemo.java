package cj7.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amena");
        queue.add("Tanveer");
        queue.add("Jahan");
        queue.add("Saritha");
        queue.add("Bushra");
        queue.add("Ankitha");
        System.out.println(queue);

        System.out.println("Size of the Queue: "+queue.size());

        System.out.println("Peek Element in Queue: "+queue.peek());
        System.out.println("Poll the Element: "+queue.poll());// return the first value and remove
        System.out.println(queue);

        if(queue.contains("Jahan")) {
            queue.remove("Jahan");
        }
        System.out.println(queue);

//        q.add(null);
//        System.out.println(q); throws NullPointerException


    }
}
