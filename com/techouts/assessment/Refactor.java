package com.techouts.assessment;
//import java.util.Scanner;
//public class Refactor {
//    int Num=9;
//    private String Name="Tanveer";
//    void Display(){
//        System.out.println("Display");
//    }
//    public static void main(String args[]){
//        Refactor obj = new Refactor();
//        System.out.println(obj.Name);
//        System.out.println(obj.Num);
//        obj.Display();
//    }
//}
//After Refactoring

public class Refactor{
    int num=9;
   private String name="Tanveer";
   public String getName(){
       return name;
   }
   void display(){
       System.out.println("Display");
   }
   public static void main(String[] args){
       Refactor obj = new Refactor();
       System.out.println(obj.getName());
       System.out.println(obj.name);
       obj.display();
   }
}
