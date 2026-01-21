package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    String department;
    Employee(int id,String name,String department){
        this.id=id;
        this.name = name;
        this.department=department;
    }
    public String toString(){
        return "Id: "+id+" Name : "+name+" DEpartment: "+department;
    }
    public String getDepartment(){
        return department;
    }
}
public class _10Grouping {
    static void main() {
     List<Employee> li = new ArrayList<>();
     li.add(new Employee(101,"Amena","Java"));
     li.add(new Employee(102,"Tanveer","Python"));
     li.add(new Employee(103,"Jahan","Java"));
     li.add(new Employee(104,"Tannu","Python"));
     li.add(new Employee(105,"Saritha","Java"));
     li.add(new Employee(105,"Bushra","Python"));
    Map<String,Long> count=li.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(count);



    }
}
