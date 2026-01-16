package cj7.list_interface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits =new LinkedList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.addLast("Banana");
        fruits.addFirst("Guava");
        System.out.println(fruits);
        System.out.println( fruits.contains("Apple"));
        System.out.println(  fruits.reversed());

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        fruits.replaceAll(String::toUpperCase);
        System.out.println(fruits);
        fruits.sort(String::compareTo);
        System.out.println(fruits);


        //This methods comes from the Deque interface
        System.out.println(fruits.peek());//it will return the top most or head element
        System.out.println(fruits.peekFirst()); //It will also return the first
        System.out.println(fruits.peekLast()); //It will return the last element
        System.out.println(fruits);
        System.out.println(fruits.pop()); //It will delete the top most value and will also return
        System.out.println(fruits);
        System.out.println(fruits.poll());//It will retrieve and delete the first element
        System.out.println(fruits);
        System.out.println(fruits.pollFirst());//It will also delete and retrieve the first element
        System.out.println(fruits);
        System.out.println(fruits.pollLast());//It will delete and retrieve the last element
        System.out.println(fruits);
        fruits.push("Banana");
        System.out.println(fruits);

        fruits.offer("PineApple");
        System.out.println(fruits);
    }
}
