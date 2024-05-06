package chapter6;

import java.util.*;

public class TraditionalSearch {
    public static void main(String[] args) {

        // list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        System.out.println("Animals that can hop!");
        print(animals, a -> a.canHop());

        System.out.println("Animals that can swim!");
        print(animals, a-> a.canSwim());

        System.out.println("Species starting with k");
       // print(animals, (a)->{ return a.getSpecies().startsWith("k");});
        print(animals, a-> a.getSpecies().startsWith("k"));
    }

    private static void print(List<Animal> animals,
                              CheckTrait checker) {
        //without lambda

        for (Animal animal : animals) {

            // the general check
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
