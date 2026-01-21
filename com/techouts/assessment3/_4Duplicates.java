package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;

public class _4Duplicates {
    static void main() {
        List<Integer> li =new ArrayList<>();
        li.add(10);
        li.add(30);
        li.add(10);
        li.add(40);
        li.add(20);
        li.add(20);

        li.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
