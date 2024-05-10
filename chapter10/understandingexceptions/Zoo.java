package chapter10.understandingexceptions;

public class Zoo {
    //an ArrayIndexOutOfBoundsExceptionis thrown if there are no arguments sent
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

