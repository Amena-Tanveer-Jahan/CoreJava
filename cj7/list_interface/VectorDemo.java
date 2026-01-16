package cj7.list_interface;


import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
         Vector<String> var = new Vector<>();
         var.add("Amena");
         var.add("Tanveer");
         var.add("Jahan");
        System.out.println(var.firstElement());
        System.out.println(var.lastElement());
        var.ensureCapacity(30);
        System.out.println(var.capacity());
        var.addElement("Tannu");
        System.out.println(var);

        Enumeration<String> str=var.elements();
        for (; str.hasMoreElements();){
            System.out.println(str.nextElement());
        }
        var.clear();
        System.out.println(var);


    }
}
