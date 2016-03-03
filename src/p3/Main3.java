package p3;

/*
 * Created by mmendez9 on 3/3/2016.
 * Append text to a file
 * File will be created if it doesn't exist
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class Main3 {
    public static void main(String[] args)throws FileNotFoundException{
        // Note the file is being opened in append made using "true"
        try (PrintWriter output = new PrintWriter(new FileOutputStream("output.txt", true))){

            for (int i = 1; i < 101; i += 2) {
                output.println(i);
            }
        }
    }
}
