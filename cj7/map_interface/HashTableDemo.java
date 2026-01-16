package cj7.map_interface;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args){
        Hashtable<String,Integer> hash = new Hashtable<>();
        hash.put("Tanveer",10);
        hash.put("Amena",20);
        hash.put("Jahan",30);
        hash.put("Saritha",40);
        hash.put("Bushra",50);
        hash.put("Ankitha",60);
        hash.put("Tannu",70) ;
        System.out.println(hash);


        System.out.println(hash.get("Amena"));//gets the value
        System.out.println(hash.remove("Tannu")); //deletes
        System.out.println(hash.size());

        //If the given key is present then the function is called
        System.out.println(hash.computeIfPresent("Ankitha",(k,v)->(v>40)?v:null));

        //replaces all the values
        hash.replaceAll((k,v) -> v+10);
        System.out.println(hash);
    }
}
