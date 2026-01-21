package com.techouts.assessment3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _9Average {
    static void main() {
        List<Integer>  li = Arrays.asList(10,20,30,40,50,60);
       Double avg = li.stream().collect(Collectors.averagingDouble(i->i));
        System.out.println(avg);
    }
}
