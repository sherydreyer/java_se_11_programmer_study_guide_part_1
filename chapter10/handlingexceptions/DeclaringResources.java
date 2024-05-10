package chapter10.handlingexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DeclaringResources {
    public static void main(String[] args) throws FileNotFoundException {
//        The first example does not compile because it is missing
//        the data type and it uses a comma (,) instead of a semicolon (;). The
//        second example does not compile because it also uses a comma (,)
//        instead of a semicolon (;). Each resource must include the data type
//        and be separated by a semicolon (;).
//        try (MyFileClass is = new MyFileClass(1), // DOES NOT COMPILE
//                os = new MyFileClass(2)) {
//        }
//        try (MyFileClass ab = new MyFileClass(1), // DOES NOT COMPILE
//                MyFileClass cd = new MyFileClass(2)) {
//        }


        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt") ) {
            System.out.println();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
