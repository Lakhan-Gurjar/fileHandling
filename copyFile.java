package fileHandling;
import java.io.*;

public class copyFile {
    public static void main(String args[]){
        /* Copy one file data to another */
        try {
            File f = new File("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
            // check whether file exist or not
            if(f.exists()){ 
            FileInputStream r = new FileInputStream("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
            FileOutputStream w = new FileOutputStream("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\rename.txt");
                int i;
                while ((i = r.read()) != -1) {
                    w.write((char) i);
                }
                System.out.println("Data copied Successfully :)");
                r.close();
                w.close();
            } else {
                System.out.println("File doesn't exists...!");
            }
        } catch (IOException e){
            System.out.println("An error occurred : "+e.getMessage());
        }
    }
    
}
