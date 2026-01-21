package com.techouts.assessment3;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class _8Flatten {
    static void main() {
        List<List<String>> li = Arrays.asList(Arrays.asList("Amena","Tanveer"),Arrays.asList("Jahan","Tannu","Tanveer"));
        li.stream()
                .flatMap(Collection::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
