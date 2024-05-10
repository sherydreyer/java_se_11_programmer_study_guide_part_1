package chapter10.understandingexceptions.uncheckedexceptions;

public class StackOverFlow {
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

    public static void main(String[] args) {
      //  doNotCodeThis(1);
    }

}
