package cj5;
class Example{
    protected int a=9;
}
class Example2 extends Example{
    protected void show(){
        System.out.println("Example2 show");
        System.out.println(a);
    }
}
class Example3 extends Example2{
    void show1(){
        this.show();
        System.out.println("Example3 show");
    }

}

public class ProtectedModifier {
    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.show1();
    }
}

