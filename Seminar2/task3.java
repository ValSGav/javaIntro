package Seminar2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class task3 {
    public static void main(String[] args) {
        int n = 10;
        String text = "TEST";

        try {
            FileWriter fwriter = new FileWriter("file_test.txt");
            for (int i = 0; i < 10; i++) {
                fwriter.write(i + " - " + text);
                fwriter.write("\n");

            }
            fwriter.close();

        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }


        
        File fl = new File("file.txt"); 
        try {
            
            FileReader fr = new FileReader("file.txt");
            char[] arr = new char[(int) fl.length()];
            fr.read(arr);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
