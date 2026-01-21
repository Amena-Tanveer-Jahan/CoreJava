package cj8.lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(40,12,56,24,78,76,45);
        list.sort((a, b) -> a.compareTo(b));
        System.out.println(list);

        /*list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Integer::compareTo);
        System.out.println(list);

        List<String> li = Arrays.asList("Tanveer","Amena","Jahan","Saritha");
        li.sort(Comparator.naturalOrder());
        System.out.println(li);*/

    }
}
