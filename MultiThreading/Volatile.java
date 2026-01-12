package MultiThreading;

class Example extends Thread {
    @Override
    public void run() {
        System.out.println("This is "+this.getName());
        System.out.println("Before changing: "+Volatile.r);
        Volatile.r +=1;
        System.out.println("After changing: "+Volatile.r);
    }
}
class Volatile {
    static volatile int r = 9;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Example();
        t1.setName("Thread1");

        Thread t2 = new Example();
        t2.setName("Thread2");

        t1.start();
        t1.join();
        t2.start();
        Thread.sleep(1000);

    }
}