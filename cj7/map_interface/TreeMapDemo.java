package cj7.map_interface;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"Tanveer");
        map.put(20,null);
        map.put(30,null);
        map.put(40,null);//0 null keys and any  number of nll values
        System.out.println(map);
        map.put(80,"Amena");
        map.put(50,"Jahan");
        map.put(100,"Tannu");
        System.out.println(map);

        System.out.println(map.ceilingKey(17));//Returns the next key which is greater than the given key

    }
}
