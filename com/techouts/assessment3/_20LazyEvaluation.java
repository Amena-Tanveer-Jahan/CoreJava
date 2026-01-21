package com.techouts.assessment3;

import java.util.Arrays;
import java.util.List;

public class _20LazyEvaluation {
    static void main() {
        List<Integer> li = Arrays.asList(10,30,23,43,54,65);
        int num=li.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .findFirst().orElse(-1);
        System.out.println(num);
    }
}
