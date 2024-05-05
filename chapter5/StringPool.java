package chapter5;

public class StringPool {
    public static void main(String[] args) {
        String x = "Hello World";
        String y = "Hello World";
        System.out.println("pool test " + (x == y)); // true only one string is created in the pool

        String x2 = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x2 == z); // false // not the same at compile time, so two strings were created in the pool

        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = " hello";
        concat += "world";
        System.out.println("concat 1 " + (singleString == oneLine));
        System.out.println("concat 2 " + (singleString == concat));

        String x3 = "Hello World";
        String y3 = new String("Hello World");
        System.out.println(x3 == y3); // false

        //intern()
//        The
//        intern() method will use an object in the string pool if one is present.
//                If the literal is not yet in the string pool, Java will add it at this time.
        String name = "Hello World";
        String name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true

         String first = "rat" + 1;
         String second = "r" + "a" + "t" + "1";
         String third = "r" + "a" + "t" + new String("1");
        System.out.println("testing interns again ");
         System.out.println(first == second);
         System.out.println(first == second.intern());
         System.out.println(first == third);
         System.out.println(first == third.intern());



    }
}
