package chapter10.handlingexceptions;

class NoMoreCarrotsException extends Exception {
}

public class Bunny {

    //    You might have noticed that eatCarrot() didn’t actually throw an
//            exception; it just declared that it could. This is enough for the compiler
//    to require the caller to handle or declare the exception
    public static void main(String[] args) {
        //   eatCarrot(); // DOES NOT COMPILE  unhandled exception
    }

    private static void eatCarrot() throws NoMoreCarrotsException {
    }

}

