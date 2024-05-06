package chapter6;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        //method signature
        //T get()

        Supplier<Integer> number = () -> 42;
        System.out.println(returnNumber(number));
    }

    private static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }


}
