package com.techouts.assessment2.strings;

public class Comparing {
    public static void main(String[] args){
        String str= "Tanveer";
         String str2 = "Tanveer";
         str.concat("Jahan"); //does not change, Immutable

        StringBuilder sb =new StringBuilder("Tanveer");
        StringBuilder sb2 = new StringBuilder("Tanveer");
        sb.append("Jahan"); //Changes , Mutable

        StringBuffer sf = new StringBuffer("Tanveer");
        sf.append("Amena");//Changes, Mutable

        System.out.println(str);
        System.out.println(sb);
        System.out.println(sf);
        System.out.println(str +" and "+sb+" are equal ?" +str.contentEquals(sb));

        System.out.println(sb.equals(sb2)); //It will check the object not the content in StringBuilder
        System.out.println(sb.compareTo(sb2) == 0); //It will check the content in StringBuilder


        System.out.println("Using equals() "+str.equals(str2));//Checks the content in String
        System.out.println("Using == for checking " + (str==str2));//Checks the reference in String
             /*
          String is Immutable whereas StringBuilder and StringBuffer are Mutable
          String is thread safe because it is Immutable,
          StringBuffer is  synchronized so it is thread safe,
          StringBuilder is not synchronized so it is not thread safe.
          StringBuffer is slower than StringBuilder
          */


    }
}
