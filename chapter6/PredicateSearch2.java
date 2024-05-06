package chapter6;

import java.util.*;
import java.util.function.*;

public class PredicateSearch2 {
//    interface look like this:
//    public interface Predicate<T> {
//        boolean test(T t);
//    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));

        print(animals, a -> a.canHop());
    }

    private static void print(List<Animal> animals,
                              Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
