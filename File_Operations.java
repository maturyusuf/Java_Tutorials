/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
      
        File f1 = new File("f1.log");

        try {
            if(f1.createNewFile()){
                System.out.println("File Created");
                Thread.sleep(1000);
                System.out.println("File is being deleted !");
                f1.delete();
                System.out.println("File is deleted !");

            }

            else {
                System.out.println("File is not Created");
            }
        } catch (IOException e) {
            e.printStackTrace();
    }

        File d1 = new File("/");
        if(d1.isDirectory()) {
            File[] files = d1.listFiles();
            for(File x: files) System.out.println(x.getName());
        }

        File f2 = new File("f2.txt");

        try {
            PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                    new FileWriter(f2)
                )
            );

            pw.println("This is sample text babe");
            pw.println("And this is another line");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
    }

    try {
        BufferedReader bR = new BufferedReader(
            new FileReader(f2)
        );
        String text = bR.readLine();

        while(text != null) {
            System.out.println(text);
            text = bR.readLine();
        }

    } catch (IOException e) {
            e.printStackTrace();
    }
        
}
}
