package cj8.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations{
    static void main() {
        List<String> li = List.of("Amena","Tanveer","Jahan","Tannu","Saritha");
        li.forEach(System.out::println); //To print each element

        List<String> up=li.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());//IT collects the element and converts it to list
        System.out.println(up);

       String str= String.valueOf(li.stream()
                .reduce(String::concat)); //It reduces the element into single one
        System.out.println(str);

        long count = li.stream()
                .count();//It will count the elements
        System.out.println(count);

        Optional<String> first = li.stream().filter(n->n.startsWith("T")).findFirst();//It will return the first element if present
        System.out.println(first);

        String max = li.stream().max(String::compareTo).get();
        System.out.println(max);

        boolean b=li.stream().anyMatch(n->n.equals("Tanveer"));
        System.out.println(b);


    }
}
