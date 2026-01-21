package com.techouts.assessment3;

import java.util.Arrays;
import java.util.List;

class MethodRefer{
    void print(String msg){
        System.out.println(msg);
    }
}
public class _3MethodReference {
    static void main() {
        MethodRefer obj = new MethodRefer();
        List<String> li = Arrays.asList("Amena","Tanveer","Jahan");
        li.forEach(obj::print);
    }
}
