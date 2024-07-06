package fileHandling;
import java.io.*;

public class createFile {
    public static void main (String args []) {
        /* Create a File */

        File f = new File("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt"); // location of file
        try {
            if (f.createNewFile()) {
                System.out.println("File Successfully created.");
            } else {
                System.out.println("File already Exists...!");
            }
        } catch (IOException e) {
            System.out.println("An error occured : " + e.getMessage());
        }
    }
}
