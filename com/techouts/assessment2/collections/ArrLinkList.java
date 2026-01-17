package com.techouts.assessment2.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrLinkList {
    public static void main(String[] args){
        ArrayList<Integer> alist= new ArrayList<>();
        LinkedList<Integer> llist = new LinkedList<>();

        //adding elements to ArrayList
        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.add(40);
        alist.add(50);
        alist.addFirst(0);
        alist.addLast(60);

        //adding elements to LinkedList
        llist.offer(10);
        llist.push(20);
        llist.add(30);
        llist.addFirst(0);
        llist.addLast(40);
        llist.add(10);
        llist.add(40);

        System.out.println("LinkedList: "+llist);
        System.out.println("ArrayList: "+alist);

        //getting elements in ArrayList
        System.out.println(alist.get(3));
        System.out.println(alist.getFirst());
        System.out.println(alist.getLast());

        //getting elements in LinkedList
        System.out.println(llist.get(4));
        System.out.println(llist.getFirst());
        System.out.println(llist.getLast());

        //Deleting elements in ArrayList
        System.out.println(alist.remove(2));
        System.out.println(alist.removeFirst());
        System.out.println(alist.removeLast());
        System.out.println(alist.removeIf(n->n%2==0));

        //Deleting elements in LinkedList
        System.out.println(llist.remove());
        System.out.println(llist.remove(3));
        System.out.println(llist.removeFirstOccurrence(10));
        System.out.println(llist.removeLastOccurrence(40));

        System.out.println(alist);
        System.out.println(llist);
    }
}
