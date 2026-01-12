package MultiThreading;


class Table extends Thread {
    public void run() {
        // synchronized (this){t1,t2
        for (int i = 1; i < 5; i++) {
            System.out.println("Iteration: " + i + " ThreadName" + Thread.currentThread().getName());
        }

        // }
        synchronized (this){
            for(int i=1;i<10;i+=2) {
                System.out.println("Iteration: "+i+" ThreadName"+Thread.currentThread().getName());
            }
        }
    }
}

public class Synchronization{
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Table();
        t1.setName("Thread 1");
        t1.start();

        Thread t2 = new Table();
        t2.setName("Thread 2");
        t2.start();
        /*Thread t1 = new TableThread();
        t1.setName("Thread 1");
        Thread t2 = new TableThread();
        t2.setName("Thread 2");*/


        for (int i = 1; i < 6; i++) {
            System.out.println("Iteration: " + i + " ThreadName " + Thread.currentThread().getName());
        }

    }
}
