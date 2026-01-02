package basics;

public class Constructors {
    int num;
    String name;
    Constructors(String name,int num){
        this.name=name;
        this.num=num;
    }
    Constructors(Constructors c){
        this.name=c.name;
        this.num=c.num;
    }
    void display(){
        System.out.println("Name : "+name +", Number : "+num);
    }
    public static void main(String[] args){
        Constructors obj1=new Constructors("Tanveer",20);
        Constructors obj2=new Constructors(obj1);
       obj1.display();
       obj2.display();
    }
}
