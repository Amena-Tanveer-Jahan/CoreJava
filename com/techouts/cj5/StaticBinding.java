package com.techouts.cj5;
class StaticBinding{
    void display() {
        System.out.println("Instance method");
    }

    static void show() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        StaticBinding obj = new StaticBinding();
        obj.display();
        StaticBinding.show();
    }
}

