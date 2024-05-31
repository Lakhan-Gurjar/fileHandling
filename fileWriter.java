package fileHandling;
import java.io.*;

public class fileWriter {
    public static void main (String args[]){
        /* Write on File --> using FileWriter */
        try
        {
        FileWriter f = new FileWriter("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt");
        
        try
        {
        f.write("Java is the best programming language.");
        }
        finally
        {
        f.close();
        }
        System.out.println("Successfully data wrote in file.");
        }
        catch(IOException i)
        {
        System.out.println(i);
        }

        /* Write on File --> using BufferedWriter */
        try(FileWriter f= new FileWriter("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt", true);
        BufferedWriter bw = new BufferedWriter(f)){
        bw.write("\nI love java");
        System.out.println("Written successfully.");
        }
        catch(IOException e){
        System.out.println(e.getMessage());
        }

        /* Write on File --> using FileOutputStream */
        try (FileOutputStream stream = new FileOutputStream("D:\\Future\\JavaTutorialbyApnaCollege\\fileHandling\\newfile.txt", true))
        {
        String data = String.valueOf(12);
        stream.write(data.getBytes());
        System.out.println("Written successfully");
        } catch(IOException e){
        System.out.println("An error occurred : "+e.getMessage());
        }
    }
    
}
