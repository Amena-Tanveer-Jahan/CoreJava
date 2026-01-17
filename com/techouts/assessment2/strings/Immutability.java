package com.techouts.assessment2.strings;

public class Immutability {
    public static void main(String[] args){
        String str="Tanveer";
        String str2= "Tanveer";
        str.concat("Jahan"); //It does not change the string
        System.out.println(str+" "+str.hashCode());
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        str=str+" Jahan";
        System.out.println(str+ " "+str.hashCode());
        System.out.println(str2+" "+str2.hashCode());

    }
}
