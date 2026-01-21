package cj8.streams;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
        String[] arr={"mam","please","refer","link","on","racecar"};
        Arrays.stream(arr).filter(n->n.equalsIgnoreCase(new StringBuilder(n).reverse().toString()))
                .forEach(System.out::println);
    }
}
