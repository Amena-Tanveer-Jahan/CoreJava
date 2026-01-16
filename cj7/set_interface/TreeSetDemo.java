package cj7.set_interface;

import java.util.Collections;
import java.util.Enumeration;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>(); //It will store in sorted order
        tset.add("Tanveer");
        tset.add("Amena");
        tset.add("Jahan");
        tset.add("Saritha");
        System.out.println(tset);

        System.out.println(tset.lower("Tanveer"));//It will return the greatest element in the set but less than the given element
        System.out.println(tset.higher("Amena")); //It will return the least element which is greater tha the given element

        tset.add("Bushra");
        System.out.println(tset);

        //It will return the same element if exists and if not it will return the next greatest element
        System.out.println(tset.ceiling("Sushma"));
        //It will return the same element if exists and if not it will return the next Lowest element
        System.out.println(tset.floor("Sushma"));

        //It will return the first element
        System.out.println(tset.getFirst());
        System.out.println(tset.first());

        //It will return the last element
        System.out.println(tset.getLast());
        System.out.println(tset.last());

        //we can also add another collection in this by using addAll()

        //If want to iterate using enumeration
        Enumeration<String> enums=Collections.enumeration(tset);
        while(enums.hasMoreElements()){
            System.out.println(enums.nextElement());
        }



    }
}
