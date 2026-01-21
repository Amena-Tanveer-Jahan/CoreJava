package com.techouts.assessment3;


import java.util.Arrays;
import java.util.List;

public class _5Count {
    static void main() {
        List<Integer> li = Arrays.asList(10,20,23,54,76,53,44,67,89);
       Long count= li.stream()
               .filter(n->n%2 !=0)
               .count();
        System.out.println(count);
    }
}
