package chapter10.handlingexceptions;

class CanNotHopException extends Exception { }
class Hopper {
    public void hop() { }
}
public class Bunny3 extends Hopper {
  //  public void hop() throws CanNotHopException { } // DOES NOT COMPILE  hop() isn’t allowed to throw any checked exceptions
                                                    // because the hop() method in the superclass Hopper
                                                    // doesn’t declare any

}
