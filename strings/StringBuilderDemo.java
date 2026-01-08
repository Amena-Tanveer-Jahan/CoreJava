package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Amena");
        StringBuilder sb2 = new StringBuilder("Tanveer");

        System.out.println(sb.compareTo(sb2));
        sb.append("Jahan"); // add a string at the end
        System.out.println(sb);
        sb.insert(8, " Jahan"); // adds at specific index
        System.out.println(sb.compareTo(sb2));
        System.out.println(sb.length()); // It will return the str
        System.out.println(sb.substring(5));
        System.out.println(sb.deleteCharAt(4));//It will delete the character at specific index
        System.out.println(sb2.reverse()); //It will reverse the string
        System.out.println(sb.replace(0,3,"Tanveer")); //It will replace

    }
}