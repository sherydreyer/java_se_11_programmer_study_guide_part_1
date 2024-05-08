package chapter8.understandingpolymorphism;
// If the method is properly overridden, then the
//overridden version will be used in all places that it is called.

class Penguin {
    public int getHeight() { return 3; }
    public void printInfo() {
        System.out.print(this.getHeight());

    }
}
public class EmperorPenguin extends Penguin {
    public int getHeight() { return 8; }
//    public void printInfo() {  //using super reference is the one exception to overriding
//        System.out.print(super.getHeight());
//
//    }
    public static void main(String []fish) {
        new EmperorPenguin().printInfo();
    }
}
