package chapter7;

import java.util.ArrayList;

public class StaticKeyWord {
    public static void main(String[] args) {
//        When the static keyword is applied to a variable, method, or class, it
//        applies to the class rather than a specific instance of the class

//        Designing static Methods and Fields
//        static methods don’t require an instance of the class. They are shared
//        among all users of the class.
//        see Koala class below
        //see KoalaTester

//        Accessing a static Variable or Method from an instance
        Koala k = new Koala();
        System.out.println("k is " + k.count); // k is a Koala
        k = null;
        System.out.println("k is still " + k.count); //  Java doesn’t care that k happens to be null. Since
        // we are looking for a static, it doesn’t matter.
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);

//        Static vs. Instance
//see Static class below
        //static members cannot reference instance members with an instance reference
        //instance members can reference static members

        //STATIC VARIABLES
        //SEE class Initializers
    }

}

class Koala {
    public static int count = 1; // static variable

    public static void main(String[] args) { // static method
        System.out.println(count);

    }
}

class Static {
    private String name = "Static class";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

    public static void main(String args[]) {
        first();
        second();
        //     third(); // DOES NOT COMPILE  , third is an instance method, need an instance of Static
        //to fix change both third and name to static, because third is referencing name which is an instance
    }
}

class Giraffe {
    public void eat(Giraffe g) {
    }

    public void drink() {
    }

    ;

    public static void allGiraffeGoHome(Giraffe g) {
    }

    public static void allGiraffeComeOut() {
    }
}

class Gorilla {
    public static int count;

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
        //    babyGorilla(); // DOES NOT COMPILE
    }

    public int total;
    //  public static double average = total / count; // DOES NOT COMPILE, total is an instance variable

}

class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3
    }
}

class Initializers {
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        //   NUM_BUCKETS = 5; // DOES NOT COMPILE, already given a value in line 124

//        We are allowed to call methods on reference variables. All the compiler can do
//        is check that we don’t try to reassign the final values to point to a different object.
        values.add("changed");

//        Static Initialization

    }


}






