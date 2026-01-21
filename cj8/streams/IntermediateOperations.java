package cj8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class IntermediateOperations {
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(10,43,76,98,56,76,34,54,65,22,45,87);
        li.stream()
                .filter(n->n>50)//It will give a new stream based on the condition
                .map(n->n/2)  //it will apply the condition to each element
                .distinct() // it will give all distinct(unrepeated elements)
                .sorted()  //It will sort the elements in natural order
                .forEach(System.out::println);


        List<List<String>> list = List.of(List.of("a","b"), List.of("c","d"));
        list.stream()
                .flatMap(l -> l.stream())//It will flatten a nested structure into single stream
                .forEach(System.out::println); // a,b,c,d

        li.stream()
                .limit(6) // Restricts the stream upto first n elememts
                .forEach(System.out::println);
        System.out.println("The second smallest element ");
      int i = li.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get(); //Second Smallest
        System.out.println(i);
        System.out.println("The second largest element ");
        int in = li.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1); //Second largest
        System.out.println(in);

        li.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);



    }
}
