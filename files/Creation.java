package files;

import java.io.File;
import java.io.IOException;

public class Creation {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File1.txt");
        if (f1.createNewFile()) {
            System.out.println("File created Successfully with name: " + f1.getName());
        } else {
            System.out.println("File Existed Already with name: " + f1.getName());
        }
    }
}
