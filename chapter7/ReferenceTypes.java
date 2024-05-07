package chapter7;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string");
    }
    public void fly(Object o) {
        System.out.print("object");
    }

    //another example
    public static void print(Iterable i) {
        System.out.print("I");
    }
    public static void print(CharSequence c) {
        System.out.print("C");
    }
    public static void print(Object o) {
        System.out.print("O");
    }


    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        System.out.print("-");
        r.fly(56);

        //another example
        System.out.println();
        print("abc");
        print(new ArrayList<>());
        print(LocalDate.of(2019, Month.JULY, 4));


    }
}

