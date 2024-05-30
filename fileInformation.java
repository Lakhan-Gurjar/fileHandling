package fileHandling;

import java.io.*;

public class fileInformation {
    public static void main(String args[]) {
        /* File Information */

        File f = new File("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
        if (f.exists()) {
            System.out.println("File Name : " + f.getName());
            System.out.println("File Location : " + f.getAbsolutePath());
            System.out.println("File Writable : " + f.canWrite());
            System.out.println("File Readable : " + f.canRead());
            System.out.println("File Size : " + f.length());
            System.out.println("File Removes : " + f.delete());
        } else {
            System.out.println("File doesn't Exists");
        }
    }
}
