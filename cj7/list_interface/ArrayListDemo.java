package cj7.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> num= new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        num.add(40);
        num.add(50);
        num.addFirst(0);
        num.add(6,70);
        num.addLast(60);
        num.addFirst(23);
        System.out.println(num);
        System.out.println(num.indexOf(50));
        System.out.println(num.contains(40));
        System.out.println(num.getLast());
        System.out.println(num.get(4));
        System.out.println(num.reversed());
        System.out.println(num.set(4,40));
        System.out.println(num.subList(4,7));
        num.sort(Integer::compareTo);
        System.out.println(num);
        num.ensureCapacity(23);
        System.out.println();



    }
}
