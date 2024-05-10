package chapter10.handlingexceptions;

public class Bunny6 {
//    This rule applies only to checked exceptions. The following code is
//    legal because it has an unchecked exception in the subclass’s version:

//    The reason that it’s okay to declare new unchecked exceptions in a
//    subclass method is that the declaration is redundant. Methods are free
//    to throw any unchecked exceptions they want without mentioning
//    them in the method declaration.
    class Hopper {
        public void hop() { }
    }
    class Bunny extends Hopper {
        public void hop() throws IllegalStateException { }
    }

}
