package fileHandling;
import java.io.*;

public class renameFile {
    public static void main(String args[]){
        /* Rename a file */
        File f = new File("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
        File r = new File("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\rename.txt");
        
        if (r.exists()) {
            System.out.println(r.renameTo(f));
        } else {
            System.out.println("File doesn't exists..!");
        }
    }
    
}
