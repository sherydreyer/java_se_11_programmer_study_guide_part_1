package chapter10.handlingexceptions;

//Similarly, a class is allowed to declare a subclass of an exception type.
//The idea is the same. The superclass or interface has already taken
//        care of a broader type. Here’s an example:
class Hopper5 {
    public void hop() throws Exception { }
}
class Bunny5 extends Hopper5 {
    public void hop() throws CanNotHopException { }
}
