package cj7;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
    public static void main(String[] args){

        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Guava");
        fruits.add("Grapes");
        System.out.println(fruits);
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.isEmpty());
        fruits.remove("Banana");
        System.out.println(fruits);
        fruits.removeIf( name -> name.startsWith("G"));
        System.out.println(fruits);
        System.out.println(fruits.size());
        Collection<String> fav = new ArrayList<>();
        fav.add("Mango");
        fav.add("Apple");
        System.out.println(fruits.retainAll(fav));
        System.out.println(fruits);

    }
}
