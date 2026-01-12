package files;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputStreamWrite {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (FileOutputStream output = new FileOutputStream("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File.bin")) {
            StringBuilder str = new StringBuilder();
            while(br.read() != -1) {
                output.write(br.readLine().getBytes());
                // convert text to bytes and write
            }
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}