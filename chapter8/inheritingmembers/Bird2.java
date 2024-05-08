package chapter8.inheritingmembers;

public class Bird2 {
    public final boolean hasFeathers() {
        return true;
    }
    public final static void flyAway() {}
}
class Penguin extends Bird2 {
//    public final boolean hasFeathers() { // DOES NOT COMPILE
//        return false;
//    }
//    public final static void flyAway() {} // DOES NOT COMPILE
}
