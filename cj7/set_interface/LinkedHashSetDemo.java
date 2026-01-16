package cj7.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        set.addFirst(0);
        set.addLast(60);

        System.out.println(set);
        System.out.println(set.removeFirst());//It removes the first element
        System.out.println(set);
        set.addFirst(5);
        set.addFirst(0);
        System.out.println(set);

        System.out.println(set.reversed());
        System.out.println(set.getFirst());
        System.out.println(set.getLast());

    }
}
