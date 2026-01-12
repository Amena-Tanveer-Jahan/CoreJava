package files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEX {
    public static void main(String[] args){

        try {
            FileReader fr = new FileReader("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File1.txt");
            int a;
            while((a=fr.read()) != -1){
                System.out.print((char)a);
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
        }

    }

}
