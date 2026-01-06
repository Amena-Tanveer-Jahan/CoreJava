package cj6;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("data.txt");
            System.out.println("Filed open successfully");
            fr.close();
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
