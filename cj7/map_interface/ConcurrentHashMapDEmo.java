package cj7.map_interface;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDEmo {
    public static void main(String[] args){
        ConcurrentHashMap<String,Integer> cmap = new ConcurrentHashMap<>();
        cmap.put("Tanveer",10);
        cmap.put("Amena",20);
        cmap.put("Jahan",30);
        cmap.put("Tannu",40); //no null keys and no null values
        System.out.println(cmap.contains(30));
        System.out.println(cmap);

        //Iterating the key value pairs
        Iterator<String> key = cmap.keySet().iterator();
        Iterator<Integer> value = cmap.values().iterator();
        while(key.hasNext() && value.hasNext()){
            System.out.println(key.next()+" = "+value.next());
        }
       // cmap.put(null,null); null values or keys are not allowed
        System.out.println(cmap.replace("Tanveer",10,21)); // replaces the old value with new one
        System.out.println(cmap.replace("Amena",22));//replaces the value

        //It will return the first non-null result
        String search=cmap.search(5, (name,age) ->{
            if(age >25){
                return name + "->"+age;
            }
            return null;
        });
        System.out.println(search);

        //It will give all possible values
        cmap.forEach(1,(name,age) -> {
            if(age > 25){
                System.out.println(name + " -> "+age);
            }
        });
    }
}
