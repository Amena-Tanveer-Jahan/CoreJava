package com.techouts.assessment2.multi_threading;

import java.util.Scanner;

class Shared{
    boolean available = false;
    synchronized void produce(int value){
        while(available ){
            try {
                wait();
            } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
        }
        }

        available = true;
        System.out.println("Producer produced "+ value);
        notify();
    }
    synchronized void consume(){
        System.out.println("Consumer is waiting for data ");
        while (!(available)) {
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Thread got interrupted");
            }
        }
        available=false;
        System.out.println("Consumer consumed data");
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        Shared obj =  new Shared();
        Thread producer =new Thread( ()->{
            for(int i=0;i<5;i++){
         obj.produce(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                obj.consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        consumer.start();
        producer.start();


    }
}
