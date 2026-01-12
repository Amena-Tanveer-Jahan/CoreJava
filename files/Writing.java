package files;

import java.io.File;
import java.io.FileWriter; //FileWriter is used for CharacterStream
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File1.txt");
        if(f1.createNewFile()) {
            System.out.println("File Created");
        }else{
            System.out.println("File already existed");
            System.exit(0);
        }
        try (FileWriter fileWriter = new FileWriter(f1)) {
            fileWriter.write("Hello This is File1");
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
    }
}
