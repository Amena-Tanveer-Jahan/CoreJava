package cj8.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
    static void main() {
        List<Integer> li = Arrays.asList(10,54,65,76,11,33);
        int sum=li.stream().filter(n->n%2 ==0).reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
