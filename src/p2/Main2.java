package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * Created by mmendez9 on 3/1/2016.
 */
public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("output.txt");
        if (file.exists()) {
            System.out.println("File exists");
        }

        // Try with resources closes file when is done
        try (PrintWriter output = new PrintWriter(file)) {

            for (int i = 0; i < 102; i += 2)
                output.println(i);
        }
    }
}
