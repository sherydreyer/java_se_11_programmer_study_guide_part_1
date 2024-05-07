package chapter7;

public class TooManyConversions {
    public static void play(Long l) {}
    public static void play(Long... l) {}
   // public static void play(Integer i) {}
    public static void main(String[] args) {
   //     play(4); // DOES NOT COMPILE can only do one conversion, It cannot handle converting to a long and then to a Long.
        play(4L); // calls the Long version
    }
}

