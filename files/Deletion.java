package files;


import java.io.File;

public class Deletion {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\tech.DESKTOP-BON6MGD\\IdeaProjects\\JavaBasics\\src\\files\\File1.txt");
        if (f1.delete())   //deletes a file if it exists
            System.out.println("File deleted Successfully");
        else
            System.err.println("File Does not existed");
    }
}
