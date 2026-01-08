package MultiThreading;

public class ThreadMethods implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started with priority " + Thread.currentThread().getPriority());
        for (int i = 0; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " iteration " + i);
            try {
                Thread.sleep(1000); //sleep() throws InterruptedException which should be handled
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " is interrupted" + e);
            }
                System.out.println("Thread Name: " + Thread.currentThread().getName());

            }
        }
        public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadMethods());
        Thread t2 = new Thread(new ThreadMethods());
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }
    }

