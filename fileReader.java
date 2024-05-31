package fileHandling;

import java.io.*;
import java.util.*;

public class fileReader {
    public static void main(String args[]) {
        /* Read Data from a file */
        try {
            FileReader f = new FileReader("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println();
            } finally {
                f.close();
                System.out.println("File closed");
            }
        } catch (IOException e) {
            System.out.println("An error occurred :" + e.getMessage());
        }

        /* Read Data from a file --> using FileInputStream */
        try {
            FileInputStream f = new FileInputStream("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println();
            } finally {
                f.close();
                System.out.println("File closed");
            }
        } catch (IOException e) {
            System.out.println("An error occurred : " + e.getMessage());
        }

        /* Read Data from a file --> using BufferedReader */
        try (FileReader f = new FileReader("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
                BufferedReader br = new BufferedReader(f)) {
            String line = br.readLine();
            if (line != null) {
                System.out.println("Data in file : " + line);
            } else {
                System.out.println("End of file reached.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred : " + e.getMessage());
        }

        /* Read Data from a file --> using scanner class */
        File file = new File("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            System.out.println(line);
            sc.close();
        } catch (IOException e) {
            System.out.println("An error occurred : " + e.getMessage());
        }
    }
}