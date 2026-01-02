package basics;

public class Armstrong {
    public static void main(String[] args){
        int n=1634;
        int len=0;
        int rem;
        int sum=0;
        int temp=n;
        while(n>0){
            len++;
            n=n/10;
        }
        n=temp;
        while(n>0){
            rem=n%10;
            sum = sum+(int)Math.pow(n,len);
            n/=10;
        }
        if(sum==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
