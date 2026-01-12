package files;

import java.io.*;
import java.util.Scanner;

public class DynamicWriting {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\PrintSumOfArray.java"));
            Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder();
            String line;
            while(true) {
                if((line=sc.nextLine()).equalsIgnoreCase("END"))
                    break;
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            bw.write(sb.toString());
            System.out.println("File Created and Content Written");
        }catch (IOException e) {
            System.err.println("Something went wrong");
            e.printStackTrace();
        }

    }
}
