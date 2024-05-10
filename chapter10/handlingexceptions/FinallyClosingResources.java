package chapter10.handlingexceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyClosingResources {
    public static void main(String[] args) {
            readFile("");
    }
     static public void readFile(String file)  {
         FileInputStream is = null;
         try {
             is = new FileInputStream("myfile.txt");
             // Read file data
             } catch (IOException e) {
             System.out.println("io error " + e.getMessage());
             } finally {
             if(is != null) {
                 try {
                     is.close();
                     } catch (IOException e2) {
                     System.out.println("io error "+ e2.getMessage());
                     }
                 }
             }
         }
}
