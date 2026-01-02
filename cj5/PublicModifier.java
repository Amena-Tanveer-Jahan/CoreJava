package cj5;
class ExampleP{
    public void show(){
        System.out.println("Show in example");
    }
}
public class PublicModifier {
    public static void main(String[] args){
        ExampleP ex=new ExampleP();
        ex.show();
    }
}
