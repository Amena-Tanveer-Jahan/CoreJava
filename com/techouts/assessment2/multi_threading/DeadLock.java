package com.techouts.assessment2.multi_threading;

class Example{
    int signel=0;
    public synchronized void fun() throws InterruptedException {
        while(signel==1){
            wait();
        }
        //signel=1;
        System.out.println("This is fun");
        //notify();
    }
    public synchronized void bun() throws InterruptedException {
        while (signel==0){
            wait();
        }
        signel=0;
        System.out.println("This is bun");
        notify();
    }
}

public class DeadLock {
    static void main() {
        Example ex = new Example();
        Thread t1 = new Thread(()-> {
            try{
                for(int i=0;i<3;i++) {
                    ex.fun();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }});
        Thread t2 = new Thread(()-> {
            try{
                for(int i=0;i<3;i++) {
                    ex.bun();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }});
        t1.start();
        t2.start();
    }
}
