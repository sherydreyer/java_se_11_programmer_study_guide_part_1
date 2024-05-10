package chapter10.recognisingexceptions;

public class RuntimeExceptions {
    static String name;  // contains null
    static int numberOfEggs;

    public static void main(String[] args) {
//          ArithmeticException
//          int answer = 11 / 0; //ArithmeticException

//          ArrayIndexOutOfBoundsException
//        int[] countsOfMoose = new int[3];
//        System.out.println(countsOfMoose[-1]); //ArrayIndexOutOfBoundsException

//        int total = 0;
//        int[] countsOfMoose = new int[3];
//        for (int i = 0; i <= countsOfMoose.length; i++) //ArrayIndexOutOfBoundsException
//            total += countsOfMoose[i];                  // for loop should have < instead of <=.
//
//        String type = "moose";
//        Integer number = (Integer) type; // DOES NOT COMPILE

//        ClassCastException
//        String type = "moose";
//        Object obj = type;
//        Integer number = (Integer) obj;  //ClassCastException

//        NullPointerException
//     printLength();

//        IllegalArgumentException
//        setNumberEggs(-1); // IllegalArgumentException

        //    NumberFormatException
        Integer.parseInt("abc");  //NumberFormatException

    }


    static public void printLength() {
        System.out.println(name.length()); //NullPointerException
    }

    static public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException(
                    "# eggs must not be negative");
        numberEggs = numberEggs;
    }

}
