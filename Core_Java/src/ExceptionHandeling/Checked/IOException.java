package ExceptionHandeling.Checked;

import java.io.File;
import java.io.PrintWriter;

public class IOException {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\schat\\OneDrive\\Desktop\\b.txt");
        PrintWriter fileWriter = null;
        try {
            if (file.exists()) {
                System.out.println("File already created !!");
            } else {
                file.createNewFile();
            }
            fileWriter = new PrintWriter(file);
            fileWriter.write("<b>Hello world</b>");
        } catch (java.io.IOException e) {
            System.out.println("File not exists");
        } finally {
            fileWriter.close();
            System.out.println("Done");
        }


    }
}
