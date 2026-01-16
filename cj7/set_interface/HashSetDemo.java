package cj7.set_interface;

import java.util.HashSet;



public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Amena");
        name.add("Tanveer");
        name.add("Jahan");
        name.add(null);
        name.add("Saritha");
        name.add("Bushra");
        System.out.println(name);

        HashSet<String> cloned = (HashSet<String>) name.clone(); //Its saves the copy of the HashSet

        name.remove(null);
        System.out.println(name);

        System.out.println(cloned); //The changes in the name does not reflect to  the cloned
        cloned.add("Tanveer"); //Does not take duplicate
        cloned.add("Ankitha");
        System.out.println(cloned);

        System.out.println(name);
        System.out.println(name.size());//It will return the size






    }
}
