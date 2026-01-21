package cj8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo {
    static void main() {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);

       /* Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };*/
   /*     Consumer<Integer> c =integer ->
                System.out.println(integer);
                 l.forEach(c);*/

//        Consumer<Integer> c = System.out::println;
//        l.forEach(c);

        l.forEach(n -> System.out.println(n));

        l.forEach(System.out::println);
    }
}
