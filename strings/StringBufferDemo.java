package strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Tanveer");
        StringBuffer sb2 = new StringBuffer("Tanveer");
        System.out.println(sb.compareTo(sb2));
        sb.append("Jahan"); // add a string at the end
        System.out.println(sb);
        sb.insert(8," Jahan"); // adds at specific index
        System.out.println(sb.compareTo(sb2));
        System.out.println(sb.length());
       System.out.println(sb.substring(5));


    }
}
