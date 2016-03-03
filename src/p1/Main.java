package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("data1.txt"));

        while (input.hasNext()) {
            try {
                double grades = input.nextDouble();
                System.out.println("Grade = " + grades);
            } catch (Exception e) {
               // System.out.println(e);
                input.next();
            }
        }
    }
}
