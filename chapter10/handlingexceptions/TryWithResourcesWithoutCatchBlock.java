package chapter10.handlingexceptions;


import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesWithoutCatchBlock {
    public static void main(String[] args)   {
        try {
            readFile("");
        } catch(IOException ioe) {
            System.out.println(" io error " + ioe.getMessage());
        }
    }

    static public void readFile(String file) throws IOException {
//    try with resources has a finally block implicitly so  you are not forced to code the catch block but then the
//            exception must be thrown   A finally block can to coded too but for  the
////        exam, you need to know that the implicit finally block runs before
////        any programmer-coded ones.
//
        try (FileInputStream is = new FileInputStream("myfile.txt");) {  //tru with resources
            // Read file data
        }
//        catch (IOException e) {
//            System.out.println("io error " + e.getMessage());
//        }
    }
}

