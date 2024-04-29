public class TestingDataTypes {
    public static void main(String[] args) {
        // Signed and Unsigned: short and char
        short bird = 'd';
        char mammal = (short) 83;
        System.out.println(bird); // Prints 100
        System.out.println(mammal);
        // short reptile = 65535; // DOES NOT COMPILE
        // char fish = (short)-1; // DOES NOT COMPILE

        short reptile = (short) -1; // DOES NOT COMPILE
        char fish = 65535; // DOES NOT COMPILE

        // Writing Literals
        // long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L; // DOES NOT COMPILE

        int octalExample = 017;

        int binaryExample = 0B10;

        int hexaExample = 0xff;

        // Literals and the Underscore Character
        // double notAtStart = _1000.00; // DOES NOT COMPILE
        // double notAtEnd = 1000.00_; // DOES NOT COMPILE
        // double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
        double reallyUgly = 1__________2; // Also compiles

        // Using Reference Types
        java.util.Date today;
        String greeting;
        today = new java.util.Date();
        greeting = new String("How are you?");

        // Distinguishing between Primitives and Reference Types
        // int value = null; // DOES NOT COMPILE
        String s = null;

    }
}
