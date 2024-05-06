package chapter6;

import java.util.*;

public class APIUsingLambdas {
    public static void main(String[] args) {
        //       Calling APIs with Lambdas
        //        Some APIs that use lambdas

        //        removeIf()
        //uses a Predicate
        //        List and Set declare a removeIf() method that takes a Predicate.
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies); // [hoppy]

//        sort()
        //uses the compareTo() method
//        While you can call Collections.sort(list), you can now sort directly
//        on the list object.
         List<String> bunnies2 = new ArrayList<>();
         bunnies2.add("long ear");
         bunnies2.add("floppy");
         bunnies2.add("hoppy");
         System.out.println(bunnies2); // [long ear, floppy, hoppy]
         bunnies2.sort((b1, b2) -> b1.compareTo(b2));
         System.out.println(bunnies2); // [floppy, hoppy, long ear]
        //descending
        bunnies2.sort((b1, b2) -> b2.compareTo(b1));
        System.out.println(bunnies2); // [floppy, hoppy, long ear]

        //forEach()
        //uses a Consumer
         List<String> bunnies3 = new ArrayList<>();
         bunnies3.add("long ear");
         bunnies3.add("floppy");
         bunnies3.add("hoppy");

         bunnies3.forEach(b -> System.out.println(b));
         System.out.println(bunnies3);

//        We can use forEach() with a Set or Map. For a Set, it works the same
//        way as a List.

        //using ForEach with a Set
        Set<String> bunnies4 = Set.of("long ear", "floppy", "hoppy");
        bunnies4.forEach(b -> System.out.println(b));

        //using ForEach with a map
        Map<String, Integer> bunnies5 = new HashMap<>();
        bunnies5.put("long ear", 3);
        bunnies5.put("floppy", 8);
        bunnies5.put("hoppy", 1);
        bunnies5.keySet().forEach(b -> System.out.println(b));
        bunnies5.values().forEach(b -> System.out.println(b));

        //using a Biconsumer
        Map<String, Integer> bunnies6 = new HashMap<>();
        bunnies6.put("long ear", 3);
        bunnies6.put("floppy", 8);
        bunnies6.put("hoppy", 1);
        bunnies6.forEach((k, v) -> System.out.println(k + " " + v));







    }
}
