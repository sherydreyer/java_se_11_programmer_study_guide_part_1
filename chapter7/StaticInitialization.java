package chapter7;

import java.sql.SQLOutput;

public class StaticInitialization {
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR
                = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }

    private static int one;
    private static final int two;
    private static final int three = 3;
 //   private static final int four; // DOES NOT COMPILE

    static {
        one = 1;
        two = 2;
   //     three = 3; // DOES NOT COMPILE
   //     two = 4; // DOES NOT COMPILE
    }
//    When you do need to use a static initializer, put
//    all the static initialization in the same block. That way, the order
//    is obvious.


    public static void main(String[] args) {
        System.out.println(NUM_SECONDS_PER_MINUTE);
        System.out.println(NUM_MINUTES_PER_HOUR);
        System.out.println(NUM_SECONDS_PER_HOUR);
    }
}
