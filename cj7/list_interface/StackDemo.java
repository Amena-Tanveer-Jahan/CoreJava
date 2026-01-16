package cj7.list_interface;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args){
        Stack<String> str=new Stack<>();
        System.out.println(str.empty());
        str.push("Amena");
        str.add("Tanveer");
        str.push("Jahan");
        System.out.println(str);
        System.out.println( str.search("Tanveer"));//It will search and return the index if present and -1 if does not present
        System.out.println(str.elementAt(2)); //It will return the element if present or else throws exception
        System.out.println(str.push("Tannu"));






    }
}
