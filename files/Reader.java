package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File1.txt"));
            int a;
            while((a=br.read()) != -1){
                System.out.print((char)a);
            }

        }catch(IOException e){
            System.out.println("An error occurred");
        }
    }
}
