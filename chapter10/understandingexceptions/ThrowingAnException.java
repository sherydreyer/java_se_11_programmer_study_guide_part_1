package chapter10.understandingexceptions;

public class ThrowingAnException {
    public static void main(String[] args) throws Exception {
        String[] animals = new String[0];
        //      System.out.println(animals[0]); //ArrayIndexOutOfBoundsException will be thrown, there are no elements in the array
//        Java lets you write statements like these:
//        throw new Exception();
//        throw new Exception("Ow! I fell.");
//        throw new RuntimeException();
//        throw new RuntimeException("Ow! I fell.");

//        Exception e = new RuntimeException();
//        throw e;

        //    throw RuntimeException(); // DOES NOT COMPILE new key word missing

        try {
            throw new RuntimeException();
       //     throw new ArrayIndexOutOfBoundsException(); // DOES NOT COMPILE, unreachable code
        } catch (Exception e) {
        }


    }

}
