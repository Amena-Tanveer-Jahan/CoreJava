package cj8;

import java.util.Arrays;
import java.util.List;

class Math {
    static void square(int n) {
        System.out.println(n * n);
    }

    void cube(int n) {
        System.out.println(n * n * n);
    }
}

public class MethodReference {
    static void main() {
        Math obj = new Math();
        List<Integer> al = Arrays.asList(10, 3, 5, 7, 9);
        al.forEach(Math::square); //Static method reference : ClassName :: MethodName
        al.forEach(obj::cube); //Method Reference to instance methods : ObjectName :: MethodName;
    }
}
