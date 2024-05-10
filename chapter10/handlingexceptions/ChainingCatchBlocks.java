package chapter10.handlingexceptions;
//Remember only one catch block will run, and it will be the first catch block that can handle it.

public class ChainingCatchBlocks {
    public static void main(String[] args) {
        visitPorcupine();
        visitMonkeys();
    }
   static  public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) { // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) { // second catch block
            System.out.print("not today");
        }
    }
    static public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) { // subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) { // superclass exception
            System.out.print("not today");
        }
    }
    //the reverse does not work,Superclass catch block must not be before the subclass ,
    // the subclass will nevber be reached
//    public void visitMonkeys2() {
//        try {
//            seeAnimal();
//        } catch (ExhibitClosed e) {
//            System.out.print("not today");
//        } catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE, it was already caught by the parent above
//            System.out.print("try back later");
//        }
//    }

//    Let’s try this one more time. Do you see why this code doesn’t
//    compile?
//    public void visitSnakes() {
//        try {
//        } catch (IllegalArgumentException e) {
//        } catch (NumberFormatException e) { // DOES NOT COMPILE
//        }
//    }
//    Remember we said earlier you needed to know that
//    NumberFormatException is a subclass of IllegalArgumentException?

//    Also, remember that an exception defined by the catch statement is
//    only in scope for that catch block. For example, the following causes a
//    compiler error since it tries to use the exception class outside the block
//for which it was defined:
//    public void visitManatees() {
//        try {
//        } catch (NumberFormatException e1) {
//            System.out.println(e1);
//        } catch (IllegalArgumentException e2) {
//            System.out.println(e1); // DOES NOT COMPILE
//        }
//    }


    static void seeAnimal() {
        System.out.println("looking at animals");
//       throw new AnimalsOutForAWalk();
        throw new ExhibitClosedForLunch();
    };
}
class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }

