package chapter10.handlingexceptions;

public class TryCatchBlock {
    static void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();

//        try // DOES NOT COMPILE
//        fall();
//catch(Exception e)
//        System.out.println("get up");
//        The problem is that the braces {
//        }
//        are missing.It needs to look like
//        this:
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up");
        }

//        What about this one?
//        try { // DOES NOT COMPILE
//            fall();
//        }
//        This code doesn’t compile because the try block doesn’t have anything
//        after it, catch clause is missing

    }

    static void fall() {
        throw new RuntimeException();
    }


    static void seeAnimals() {
        System.out.println("seeing animals");
    }

    static void getUp() {
        System.out.println("getting up");
    }

    public static void main(String[] args) {
        explore();
    }

}
