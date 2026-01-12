package files;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File1.txt"));
            FileWriter fr = new FileWriter("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File.txt");
            int a;
            while((a=br.read()) != -1){
                fr.write(a);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occured!");
        }


    }
}
