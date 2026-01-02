package cj5;
class Person {

    private String name;

    public void setName(String name)  {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class PrivateModifier{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.setName("Alice");

        // System.out.println(p.name);
        // has private access
        System.out.println(p.getName());
    }
}