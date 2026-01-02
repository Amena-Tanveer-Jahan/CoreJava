package cj5;

public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        obj = null; // Eligible for GC
        System.gc(); // Request GC
        System.out.println("End of main");
    }

   // @Override
  //  protected void finalize() throws Throwable {
   //     System.out.println("Garbage collected!");
    }


