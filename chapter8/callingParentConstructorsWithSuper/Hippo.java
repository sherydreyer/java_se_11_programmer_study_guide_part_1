package chapter8.callingParentConstructorsWithSuper;

class Animal3 {
    static { System.out.print("A"); }
}
public class Hippo extends Animal3 {
    static { System.out.print("B"); }
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
}

