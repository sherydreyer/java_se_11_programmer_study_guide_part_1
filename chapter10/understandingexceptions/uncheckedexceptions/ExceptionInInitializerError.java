package chapter10.understandingexceptions.uncheckedexceptions;

//ExceptionInInitializerError Java failed to load the class
public class ExceptionInInitializerError {
    //Error exception (unchecked)
    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }  //ExceptionInInitializerError

    public static void main(String... args) {
    }
}