package files;
import java.io.*;

public class BufferedWriterWrite {
    public static void main(String[] args) throws IOException {
        try (FileWriter f1 = new FileWriter("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\BufferWrite.java");
             BufferedWriter bw = new BufferedWriter(f1);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
             System.out.println("Enter your text to write in File: ");
             String str = br.readLine();
             bw.write(str);
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
    }
}


