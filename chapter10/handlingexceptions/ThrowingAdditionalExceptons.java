package chapter10.handlingexceptions;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class ThrowingAdditionalExceptons {
    public static void main(String[] a) throws Exception {
//        FileReader reader = null;
//        try {
//            reader = read();
//        } catch (IOException e) {
//            try {
//                if (reader != null) reader.close();
//                //   throw new IOException();
//            } catch (IOException inner) {
//                System.out.println("io exception " + e.getMessage());
//            }
//        }
//
//        try {
//            throw new RuntimeException();
//        } catch (RuntimeException e) {
//            throw new RuntimeException();
//        } finally {
//            throw new Exception();
//        }

       String s =  exceptions();
        System.out.println(s);

    }

    private static FileReader read() throws IOException {
        throw new IOException();
        //  return  null;
    }

    static public String exceptions() {
        StringBuilder result = new StringBuilder();
        String v = null;
        try {
            try {
                result.append("before_");
                v.length();
                result.append("after_");
            } catch (NullPointerException e) {
                result.append("catch_");
                throw new RuntimeException();
            } finally {
                result.append("finally_");
                throw new Exception();
            }
        } catch (Exception e) {
            result.append("done");
        }
        return result.toString();
    }

}

