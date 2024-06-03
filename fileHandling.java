package fileHandling;
import java.io.*;
import java.util.*;

public class fileHandling {
    public static void main(String args[]) {

        /* Create a File */

        File f = new File("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File Successfully created.");
            } else {
                System.out.println("File already Exists...!");
            }
        } catch (IOException e) {
            System.out.println("An error occured : " + e.getMessage());
        }

        /* Write on File --> using FileWriter */
        // try
        // {
        // FileWriter f = new
        // FileWriter("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        // try
        // {
        // f.write("Java is the best programming language.");
        // }
        // finally
        // {
        // f.close();
        // }
        // System.out.println("Successfully data wrote in file.");
        // }
        // catch(IOException i)
        // {
        // System.out.println(i);
        // }

        /* Write on File --> using BufferedWriter */
        // try(FileWriter f= new FileWriter("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt", true);
        // BufferedWriter bw = new BufferedWriter(f)){
        // bw.write("I love java");
        // System.out.println("Written successfully.");
        // }
        // catch(IOException e){
        // System.out.println(e.getMessage());
        // }

        /* Write on File --> using FileOutputStream */
        // try (FileOutputStream stream = new
        // FileOutputStream("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt"))
        // {
        // String data = String.valueOf(12);
        // stream.write(data.getBytes());
        // System.out.println("Written successfully");
        // } catch(IOException e){
        // System.out.println("An error occurred : "+e.getMessage());
        // }

        /* Read Data from a file */
        // try 
        // {
        //     FileReader f = new FileReader("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        //     try
        //     {
        //         int i;
        //         while((i = f.read()) != -1)
        //         {
        //             System.out.print((char)i);
        //         }
        //         System.out.println();
        //     }
        //     finally 
        //     {
        //         f.close();
        //         System.out.println("File closed");
        //     }
        // }
        // catch(IOException e)
        // {
        //     System.out.println("An error occurred :" + e.getMessage());
        // }

        /* Read Data from a file --> using BufferedReader*/
        // try (FileReader f = new FileReader("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        // BufferedReader br = new BufferedReader(f))
        // {
        //     String line = br.readLine();
        //     if (line != null){
        //         System.out.println("Data in file : "+line);
        //     }
        //     else {
        //         System.out.println("End of file reached.");
        //     }
        // }
        // catch (IOException e) 
        // {
        //     System.out.println("An error occurred : "+e.getMessage());
        // }

        /* Read Data from a file --> using FileInputStream*/
        // try {
        //     FileInputStream f = new FileInputStream("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        //     try
        //     {
        //         int i;
        //         while((i = f.read()) != -1)
        //         {
        //             System.out.print((char)i);
        //         }
        //         System.out.println();
        //     }
        //     finally 
        //     {
        //         f.close();
        //         System.out.println("File closed");
        //     }
        // }
        // catch (IOException e) {
        //     System.out.println("An error occurred : "+e.getMessage());
        // }

        /* Read Data from a file --> using scanner class */
        // File file = new File("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        // try {
        // Scanner sc = new Scanner(file);
        // String line = sc.nextLine(); 
        // System.out.println(line);
        // }
        // catch (IOException e){
        //     System.out.println("An error occurred : "+e.getMessage());
        // }

        /* File Information */
        // if(f.exists()){
        // System.out.println("File Name : "+f.getName());
        // System.out.println("File Location : "+f.getAbsolutePath());
        // System.out.println("File Writable : "+f.canWrite());
        // System.out.println("File Readable : "+f.canRead());
        // System.out.println("File Size : "+f.length());
        // // System.out.println("File Removes : "+f.delete());
        // } else{
        // System.out.println("File doesn't Exists");
        // }

        /* Rename a file */
        // File f = new File("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        // File r = new File("D:\\Future\\JavaTutorialbyApnaCollege\\rename.txt");
        
        // if (r.exists()) {
        //     System.out.println(r.renameTo(f));
        // } else {
        //     System.out.println("File doesn't exists..!");
        // }

        /* Copy one file data to another */
        // try {
        // FileInputStream r = new FileInputStream("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        // FileOutputStream w = new FileOutputStream("D:\\Future\\JavaTutorialbyApnaCollege\\Copy.txt");
        
        // int i;
        // while((i = r.read()) != -1){
        //     w.write((char) i);
        // }

        // System.out.println("Data copied successfully...!");
        // } catch (IOException e) {
        //     System.out.println("An error occurred : " + e.getMessage());
        // }

        /* Copy one file data to another */
        // try {
        //     File f = new File("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        //     // check whether file exist or not
        //     if(f.exists()){ 
        //     FileInputStream r = new FileInputStream("D:\\Future\\JavaTutorialbyApnaCollege\\newFile.txt");
        //     FileOutputStream w = new FileOutputStream("D:\\Future\\JavaTutorialbyApnaCollege\\rename.txt");
        //         int i;
        //         while ((i = r.read()) != -1) {
        //             w.write((char) i);
        //         }
        //         System.out.println("Data copied Successfully :)");
        //     } else {
        //         System.out.println("File doesn't exists...!");
        //     }
        // } catch (IOException e){
        //     System.out.println("An error occurred : "+e.getMessage());
        // }
    }
}

