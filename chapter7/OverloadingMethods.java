package chapter7;

import java.util.List;

public class OverloadingMethods {
    //    Everything other than the method name can vary for overloading
//    methods. This means there can be different access modifiers,
//    specifiers (like static), return types, and exception lists.
//    These are all valid overloaded methods:
    public void fly(int numMiles) {
    }

    public void fly(short numFeet) {
    }

    public boolean fly() {
        return false;
    }

    void fly(int numMiles, short numFeet) {
    }

    public void fly(short numFeet, int numMiles) throws Exception {
    }

//    Now let’s look at an example that is not valid overloading:
    //  public void fly(int numMiles) {}
    //   public int fly(int numMiles) {} // DOES NOT COMPILE because it only differs from original by return type not parameter


//    What about these two? Why does the second not compile?
//    public void fly(int numMiles) {}
//    public static void fly(int numMiles) {} // DOES NOT COMPILE params are the same still

    static public void fly2(int numMiles) {
        System.out.println("int");
    }

    static public void fly2(short numFeet) {
        System.out.println("short");
    }

    //Varargs
    // static public void fly3(int[] lengths) {
    //   }

    static public void fly3(int... lengths) {
    }// DOES NOT COMPILE  if you uncomment above method Remember that Java treats varargs as if they were an
    //array. This means that the method signature is the same for both methods

    //    Autoboxing
    static public void fly4(Integer numMiles) {
    }

    //However, what happens if you have both a primitive and an integer
    //version?
    // static public void fly4(int numMiles) {}

    //    Generics
    public void walk(List<String> strings) {
    }
//    public void walk(List<Integer> integers) {
//    }   // DOES NOT COMPILE
          //    type erasure - cannot see the type of the List
          //    because type is only seen at run time, they are the same looking like this at compile time
          //    public void walk(List strings) {}
          //    public void walk(List integers) {}

    //    Arrays
//    Arrays have been around since the beginning of Java. They specify
//    their actual types and don’t participate in type erasure.
    public static void walk(int[] ints) {
    }

    public static void walk(Integer[] integers) {
    }

    //putting it all together for glide(1,2)
    //Exact match by type
//    static String glide(int i, int j) {
//        return "in int";
//    }
    //Larger primitive type
//    static String glide(long i, long j) {
//        return "in long";
//    }
    //Autoboxed type
//    static String glide(Integer i, Integer j) {
//        return "in Integer";
//    }
    //Varargs
    static String glide(int... nums) {
        return"In varargs";
    }


    public static void main(String[] args) {
        //it looks for matching types and will call the correct overloaded method.
        fly2((short) 1);

//sending an array to a varargs param
        fly3(new int[]{1, 2, 3});

//        However, you can only call the varargs version with stand-alone parameters:
        fly3(1, 2, 3);

//    Autoboxing
        fly4(3);

//  putting it all together
        System.out.println(glide(1,2));

    }
}
