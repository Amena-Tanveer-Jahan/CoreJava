package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
 public String toString(){
        return "Name: "+name+" ID: "+id;
 }
}
public class _1SortCustom {
    static void main() {
        List<Student>  li = new ArrayList<>();
        li.add(new Student(103,"Tanveer"));
        li.add(new Student(102,"Amena"));
        li.add(new Student(104,"Jahan"));
        li.add(new Student(105,"Saritha"));
        li.sort(Comparator.comparing(s->s.id));
        li.forEach(System.out::println);
    }
}
