package MultiThreading;

public class ThreadClass extends Thread{
   @Override
    public void run(){
       System.out.println("Thread Running: "+currentThread().getName());
   }
   public static void main(String[] args){
       ThreadClass t1 = new ThreadClass();
       t1.start();//creates a new thread. t1.run() will act as a normal method
   }
}
