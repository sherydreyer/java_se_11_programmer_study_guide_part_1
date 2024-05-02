package chapter4;

public class ForLoop {
    static String[] names = {"Sue", "Dave", "Mark"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.print("Value is: " + i);
        //  System.out.println(i); // DOES NOT COMPILE,  i cam only be referenced inside the body of the for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " ");
        }
        //printing elements in reverse
        for (var counter = 5; counter > 0; counter--) {
            System.out.println(counter + " ");
        }

        for (var counter = 4; counter > 0; counter--) {
            System.out.println(counter + " ");
        }
        for (var counter = 4; counter >= 0; counter--) {
            System.out.println(counter + " ");
        }
//        1. Creating an Infinite Loop
        //semi colons are required
//        for( ; ; )
//            System.out.println("Hello World");

//adding multiple terms
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print("y " + y + " ");
        }
        System.out.print("x " + x + " ");

        //       3. Redeclaring a Variable in the Initialization Block
//
        x = 0;
//        for(int x = 4; x < 5; x++) { // DOES NOT COMPILE, x is already declared before the loop
//            System.out.print(x + " ");
//        }

        x = 0;
        for (x = 0; x < 5; x++) {   // fix it by removing the int
            System.out.println(x + " ");
        }

        //    4. Using Incompatible Data Types in the Initialization Block
//        int x = 0;
//        for(long y = 0, int z = 4; x < 5; x++) { // DOES NOT COMPILE,he variables in the initialization block must all be of the same type
//            System.out.print(y + " ");
//        }

        x = 0;
        for (long y = 0, z = 4; x < 5; x++) { // DOES NOT COMPILE,he variables in the initialization block must all be of the same type
            System.out.print(y + " ");
        }

        // Using Loop Variables Outside the Loop
        for (long y = 0, j = 4; j < 5 && y < 10; j++, y++) {
            System.out.print(y + " ");
        }
  //      System.out.print(j); // DOES NOT COMPILE

        //modifying loop variables
//        for(int i=0; i<10; i++)  //infinite
//            i = 0;
//        for(int j=1; j<10; j++)  //inifinte
//            j--;
        for (int k = 0; k < 10; )  //will work
            k++;
        //looping through an array
        printNames(names);
    }


    static public void printNames(String[] names) {
        for (int counter = 0; counter < names.length; counter++)
            System.out.println(names[counter]);
    }
}
