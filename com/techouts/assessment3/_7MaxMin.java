package com.techouts.assessment3;


import java.util.Arrays;
import java.util.List;

public class _7MaxMin {
    static void main() {
        List<Integer> li = Arrays.asList(10,34,67,45,77,43,76,32,89,90);
        int max=li.stream()
                .sorted()
                .max(Integer::compareTo)
                .orElse(-1);
        System.out.println("MAx element is: "+max);

        int min = li.stream()
                .sorted().min(Integer::compareTo)
                .orElse(-1);
        System.out.println("Min element is : "+min);
    }
}
