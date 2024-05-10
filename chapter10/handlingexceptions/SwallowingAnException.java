package chapter10.handlingexceptions;

import java.io.IOException;

public class SwallowingAnException {
    public static void main(String... p) {
        String textInFile = null;
        try {
            textInFile = readInFile();
        } catch (IOException e) {
// ignore exception
        }
// imagine many lines of code here
        System.out.println(textInFile.replace(" ", ""));
    }
    private static String readInFile() throws IOException {
        throw new IOException();
    }

}
