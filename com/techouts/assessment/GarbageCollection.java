package com.techouts.assessment;

public class GarbageCollection {

    private String name;

    public GarbageCollection(String name) {
        this.name = name;
        System.out.println("Created: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized: " + name);
    }

    public static void main(String[] args) {

        GarbageCollection obj = new  GarbageCollection("DemoObject");
        obj = null;

        System.out.println("Object is now eligible for GC.");

        System.gc();
        System.out.println("Program finished.");
    }
}
