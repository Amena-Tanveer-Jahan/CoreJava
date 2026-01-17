package com.techouts.assessment2.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadBufferedREader {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\com\\techouts\\assessment2\\files\\File")))
        {
            int a;
            while((a=br.read()) != -1){
                System.out.print((char)a);
            }

        }catch(IOException e){
            System.out.println("An error occurred" + e);
        }

    }
}
