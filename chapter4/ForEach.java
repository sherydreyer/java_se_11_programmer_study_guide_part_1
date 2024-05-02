package chapter4;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    static String[] names = {"Sue", "Mark", "Dave"};

    public static void main(String[] args) {
        printNames(names);
        printNames2(names);
    }

    static public void printNames(String[] names) {
        //standard for loop
        for (int counter = 0; counter < names.length; counter++)
            System.out.println(names[counter]);
    }

    static public void printNames2(String[] names) {
        //For Each Loop / ENHANCED FOR LOOP
        for (String name : names)  // can also use var instead of String
            System.out.println(name);

        final String[] names2 = new String[3];
        names2[0] = "Lisa";
        names2[1] = "Kevin";
        names2[2] = "Roger";
        for (String name : names2) {
            System.out.print(name + ", ");
        }

        System.out.println();

        //looping through an ArrayList
        List<String> values = new ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (var value : values) {
            System.out.print(value + ", ");
        }


//        String names3 = "Lisa";
//        for(String name : names3) { // DOES NOT COMPILE, Its not an array or list
//            System.out.print(name + " ");
//        }

//        String[] names4 = new String[3];
//        for (int name : names4) { // DOES NOT COMPILE because int is not compatible with String, 3 means it is filled with three empty spaces of null
//            System.out.print(name + " ");
//        }

        System.out.println();
//        If we
//        wanted to print only the comma between names, we could convert the
//        example into a standard for loop, as in the following example:
        List<String> names6 = new ArrayList<String>();
        names6.add("Lisa");
        names6.add("Kevin");
        names6.add("Roger");
        for(int i=0; i<names6.size(); i++) {
            String name = names6.get(i);
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
        System.out.println();

//        It is also common to use a standard for loop over a for-each loop if
//        comparing multiple elements in a loop within a single iteration, as in
//        the following example:
        int[] values2 = new int[3];
        values2[0] = 1;
        values2[1] = Integer.valueOf(3);
        values2[2] = 6;
        for(int i=1; i<values2.length; i++) {
            System.out.print((values2[i]-values2[i-1]) + ", ");
        }


    }
}

