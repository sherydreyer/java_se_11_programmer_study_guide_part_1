package chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class VariablesInLambdas {
    public static void main(String[] args) {
//        Parameter List
        Predicate<String> p = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;
//        What do you think the type
//        of x is here?
        whatAmI();  //integer , it is inferred from the parameter in the consume method

        //sort using var
        // What do you think the type
        // of x is here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        counts(numbers);
//        The answer is again Integer. Since we are sorting a list, we can use the
//        type of the list to determine the type of the lambda parameter.

//        Local Variables inside the Lambda Body

//       It creates a local variable named c that is scoped to the lambda block.
//        (a, b) -> { int c = 0; return 5;}
//        Now let’s try another one. Do you see what’s wrong here?
//        (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE because you cannot create
//                                          //a variable with the same name as one of the parameterd

        variables(10);

        //        Variables Referenced from the Lambda Body
        Crow crow = new Crow(); //see class below







    }


    static public void whatAmI() {
        consume((var x) -> System.out.println(x), 123);
    }

    static public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

    static public void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
        System.out.println(list);

    }

    //
//     public void variables(int a) {
//         int b = 1;
//         Predicate<Integer> p1 = a -> {  // already a variable a above
//             int b = 0;  // already a variable b
//             int c = 0;
//             return b == c;}  // semicolon missing to end off p1;
//         }
    static public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a2 -> {
            int b2 = 0;
            int c = 0;
            return b2 == c;
        };
        System.out.println(testPred(p1, b));
    }

    static public boolean testPred(Predicate<Integer> pred, Integer i) {
        boolean d = pred.test(i);
        return d;
    }


}

//        Variables Referenced from the Lambda Body
//This shows that lambda can access an instance variable, method
//parameter, or local variable under certain conditions. Instance
//variables (and class variables) are always allowed.
//Method parameters and local variables are allowed to be referenced if
//they are effectively final. the following is effectively final because values haven't changed
//class Crow {
//    private String color;
//
//    public void caw(String name) {
//        String volume = "loudly";
//        Consumer<String> consumer = s ->
//                System.out.println(name + " says "
//                        + volume + " that she is " + color);
//    }
//}

//the same as final
class Crow {
    private String color;

    public void caw(final String name) {
        final String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
    }
}

//the following are not effectively final beacuse the values are changing
class Crow2 {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        name = "Caty";
        color = "black";

        //     Consumer<String> consumer = s ->
        //        System.out.println(name + " says "  //will not compile name is not final
        //               + volume + " that she is " + color); //will not compile volume is not final
        //               volume = "softly";
    }
}


