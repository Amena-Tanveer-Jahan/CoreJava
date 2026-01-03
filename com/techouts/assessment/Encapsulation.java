package com.techouts.assessment;

public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
        }
    public static void main(String[] args){
        Encapsulation obj = new Encapsulation();
        obj.setName("Tanveer");
        obj.setAge(21);
        System.out.println("Name : "+obj.getName());
        System.out.println("Age : "+obj.getAge());
    }
}