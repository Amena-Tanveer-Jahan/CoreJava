package com.techouts.assessment3;

import java.util.Arrays;
import java.util.List;

public class _17AllMatch {
    static void main() {
        List<Integer> li = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
       boolean val= li.stream()
               .allMatch(n->n%2==0);
        System.out.println(val);

    }
}
