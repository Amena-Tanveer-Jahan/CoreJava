package cj7.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashDemo {
    public static void main(String[] args){
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Tanveer",21);
        map.putFirst("Amena",21);
        map.putLast("Aish",20);
        map.put("Saritha",22);
        map.put("Bushra",20);
        map.put("Ankitha",21);
        map.put("Sushma",22);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("Tanveer"));
        System.out.println(map.putIfAbsent("Rakesh",22));
        System.out.println(map);
        map.put(null,null); //One null key any number of null values
        map.put("Ramesh",null);
        System.out.println(map);

    }
}
