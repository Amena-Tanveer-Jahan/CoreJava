package com.techouts.assessment;
class Show{
    void show(){
        System.out.println("Its time to show");
    }
    void show(String value){
        System.out.println(value);
    }
}
class Show2 extends Show{
    @Override
    void show(String value){
        System.out.println(value +" "+ " from show2");
    }
}

public class MethodOver {
    public static void main(String[] args){
        Show obj = new Show();
        obj.show();
        obj.show("Hello");
        Show2 obj2 = new Show2();
        obj2.show("Hello");
    }
}
