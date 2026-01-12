package files;

import java.io.*;

public class CopyWithBufferOutput {
    public static void main(String[] args){
        try(FileReader fr = new FileReader("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File.txt");
            BufferedOutputStream br = new BufferedOutputStream(new FileOutputStream("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File2.txt"));) {
            int n;
            while((n=fr.read()) != -1){
                br.write((char) n);
            }
            System.out.println("Copied Successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;


    }
}
