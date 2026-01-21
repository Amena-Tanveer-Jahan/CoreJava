package com.techouts.assessment3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class _19ListToMap {
    static void main() {
        List<String> li = Arrays.asList("Amena","Tanveer","Jahan","Amena","Tanveer");
        Map<String,Integer> map = li.stream().collect(Collectors.toMap(n->n,String::length,(a,b)->a));
        System.out.println(map);
    }
}
