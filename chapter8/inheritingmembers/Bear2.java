package chapter8.inheritingmembers;

public class Bear2 {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}
class Panda2 extends Bear {
    public void sneeze() { // DOES NOT COMPILE trying to override a static methpd which should be hidden
        System.out.println("Panda sneezes quietly");
    }
    public static void hibernate() { // DOES NOT COMPILE, trying to hide an instance method
        System.out.println("Panda is going to sleep");
    }
    protected static void laugh() { // DOES NOT COMPILE more restrictive access modifier
        System.out.println("Panda is laughing");
    }
}
