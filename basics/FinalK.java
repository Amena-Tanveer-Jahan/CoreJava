package basics;
class Test{
    static final int a=10;
}
class Test1 extends Test{
    int a=30;
}
public class FinalK {
   public static void main(String[] args){
       Test obj1=new Test();
       Test1 obj2=new Test1();
       System.out.println(obj2.a);
       System.out.println(Test.a);
   }

}
