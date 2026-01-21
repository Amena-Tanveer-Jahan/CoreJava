package com.techouts.assessment3;

import java.util.Arrays;
import java.util.List;

public class _6Squares {
    static void main() {
        List<Integer> li = Arrays.asList(10,2,5,7,3,7,6,8,9);
        li.stream()
                .distinct()
                .map(n->n*n)
                .forEach(System.out::println);
    }
}
