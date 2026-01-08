package strings;

public class Methods {
    public static void main(String[] args) {
        String str1 = " Hello Tanveer ";
        String str2= str1.toUpperCase(); //Converts the string to uppercase
        String str3 = str2.toLowerCase(); //Converts the string to lower case
         System.out.println(str2);
         System.out.println(str3);
         System.out.println(str1.indexOf("Tanveer")); //It will return the index of the string
         System.out.println(str2.charAt(4)); //It will print the character of specific index
         System.out.println(str1.trim()); //It will remove whitespace from beginning and ending
        String str4 = str1.replace('e','a');//It wil replace the first character with the second one, replaceAll() will also there
        System.out.println(str4);
        System.out.println(str1.lastIndexOf('e')); //It will return the last occurred index of the character
        System.out.println(str2.equalsIgnoreCase(str3)); //It will ignore case and checks


    }
}
