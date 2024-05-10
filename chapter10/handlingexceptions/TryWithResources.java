package chapter10.handlingexceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {

    //only classes that implement AutoCloseable can be opened in try with resources

//    Resources are closed after the try clause ends and before any
//catch/finally clauses.
//    Resources are closed in the reverse order from which they were
//    created.
    public static void main(String[] args) {
        readFile("");

        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
        } catch (Exception e) {    //s is in scope only in the try block
//            s.nextInt(); // DOES NOT COMPILE
        } finally {
//            s.nextInt(); // DOES NOT COMPILE   //s is in scope only in the try block
        }

        //AutoCloseable

    }


    static public void readFile(String file) {

        try (FileInputStream is = new FileInputStream("myfile.txt");) {
            // Read file data
        } catch (IOException e) {
            System.out.println("io error " + e.getMessage());
        }
    }
}



