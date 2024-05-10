package chapter10.handlingexceptions;

public class Bunny2 {
    public static void main(String[] args) {

    }
    public void bad() {
      //  try {
            eatCarrot();
      // } //catch (NoMoreCarrotsException e ) { // DOES NOT COMPILE unreachable code - eatCarrot() does not throw an exception
//            System.out.print("sad rabbit");
//        }
    }
    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }
    private void eatCarrot() { }

}
