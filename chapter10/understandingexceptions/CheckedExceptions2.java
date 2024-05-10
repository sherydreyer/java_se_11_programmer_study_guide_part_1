package chapter10.understandingexceptions;
//using try catch block

import java.io.IOException;

public class CheckedExceptions2 {
    static String a;
    void fall(int distance) {
        try {
            if(distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {  //Exception is the parent of IOException, so it can also be used here
            e.printStackTrace();  //handling it with a try catch block instead of letting the method use throws
        }
    }

    public static void main(String[] args) {
        fall(a); // will get a NullPointerException
    }
    static void fall(String input) {
        System.out.println(input.toLowerCase());
    }

}
