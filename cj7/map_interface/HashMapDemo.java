package cj7.map_interface;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Updating a value
        map.put("Apple", 60); // Overwrites old value

        // getting value by key
        System.out.println("Apple: " + map.get("Apple"));

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is available."+map.get("Banana"));
        }

        // Iterating over keys and values
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


        Iterator<String> key = map.keySet().iterator();
        Iterator<Integer> value = map.values().iterator();
        while(key.hasNext() && value.hasNext()) {
            System.out.println(key.next()+" --> "+ value.next());
        }


        System.out.println(map.keySet());
        System.out.println(map.values());

        map.put("PineAplle",null);
        map.put("grapes",null);
        map.put(null,50);
        map.put(null,70);//update null vale with 70

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("Size of Map: "+map.size());

    }
}
