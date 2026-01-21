package cj8;

import java.util.Scanner;
import java.util.function.Supplier;

class Constructor{
    int n=23;
    Constructor(){
        System.out.println("Helloo ! Object is created");
    }

    void show(){
        System.out.println("Helloooo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value ");
        int n=sc.nextInt();
        System.out.println(n);

    }
}
public class ConstructorReference {
    static void main() {

        Supplier<Constructor> sp = Constructor::new;
       Constructor c= sp.get();
       c.show();
        System.out.println(c.n);
        System.out.println(c.hashCode());
    }
}
