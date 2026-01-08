package cj6;

public class Finally {
    public static int method(){
        try{
            return 20;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return 30;
        }

    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}
