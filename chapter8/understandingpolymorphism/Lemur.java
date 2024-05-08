package chapter8.understandingpolymorphism;

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public abstract boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

        HasTail hasTail2 = lemur;
        //System.out.println(hasTail.age); // DOES NOTCOMPILE can only access members of HasTail
        Primate primate2 = lemur;
       // System.out.println(primate.isTailStriped()); // DOES NOTCOMPILE can only access members of Primate

        //CASTING
        Primate primate3 = new Lemur(); // Implicit Cast
//        Lemur lemur3 = primate3; // DOES NOT COMPILE
//        System.out.println(lemur3.age);
        Lemur lemur3 = (Lemur)primate3; // Explicit Cast
        System.out.println(lemur3.age);

    }
}


