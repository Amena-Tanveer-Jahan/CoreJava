package cj8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args){
        String str="Amena Tanveer Jahan Amena Tanveer";
        Map<String,Long> count = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(w -> w,Collectors.counting()));
        System.out.println(count);
    }
}
