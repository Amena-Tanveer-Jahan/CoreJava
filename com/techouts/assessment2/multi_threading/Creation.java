package com.techouts.assessment2.multi_threading;
class Thread1 extends Thread{
   public void run(){
       System.out.println("Thread created by extending Thread class");
    }
}
class Thread2 implements Runnable{
    public void run(){
        System.out.println("Thread created by implementing Runnable interface");
    }
}
public class Creation {
    public static void main(String[] args) throws InterruptedException {
        Thread1 obj = new Thread1();
        obj.start();
        obj.join();
        Thread obj2 = new Thread(new Thread2());
        obj2.start();

    }
}
