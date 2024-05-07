package chapter7;

//import static java.util.Arrays; // DOES NOT COMPILE static is for importing members
import java.util.Arrays;
import static java.util.Arrays.asList;
// static import java.util.Arrays.*; // DOES NOT COMPILE, import static not vice versa

//The compiler will
//complain if you try to explicitly do a static import of two methods with
//the same name or two static variables with the same name.
//import static statics.A.TYPE;
//import static statics.B.TYPE; // DOES NOT COMPILE


public class BadStaticImports {
    public static void main(String[] args) {
//        Arrays.asList("one"); // DOES NOT COMPILE, just use asList since there is a static import for it
        asList("one");
    }
}
