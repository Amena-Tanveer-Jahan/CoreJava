package com.techouts.assessment2.multi_threading;

class ThreadEx implements Runnable{
    public  void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Iteration " + i + " of " + Thread.currentThread().getName());
            }
        }
    }
}
public class Synchronization {
    public static void main(String[] args){
        Thread t1 = new Thread(new ThreadEx());
        t1.start();
        Thread t2 = new Thread(new ThreadEx());
        t2.start();
    }


}
