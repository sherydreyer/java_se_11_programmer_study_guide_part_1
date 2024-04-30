public class TestingVariables {
    public static void main(String[] args) {
        // declaring
        String zooName;
        int numberAnimals;
        // initialising
        zooName = "The Best Zoo";
        numberAnimals = 100;
        // declaring and initialising
        String zooName2 = "The Best Zoo";
        int numberAnimals2 = 100;

        // legal identifiers
        long okidentifier;
        float $OK2Identifier;
        boolean _alsoOK1d3ntifi3r;
        char __SStillOkbutKnotsonice$;

        // illegal identifiers
        // int 3DPointClass; // identifiers cannot begin with a number
        // byte hollywood@vine; // @ is not a letter, digit, $ or _
        // String *$coffee; // * is not a letter, digit, $ or _
        // double public; // public is a reserved word
        // short _; // a single underscore is not allowed

        // declaring multiple variables
        String s1, s2;
        // declaring and initialising multiple variables in one statement
        String s3 = "yes", s4 = "no";
        // declaring multiple variables and initialising only one variable in one
        // statement
        int i1, i2, i3 = 0;
        // cannot declaring multiple variables of different types in one statement
        // int num, String value; // DOES NOT COMPILE

        // Which are legal statements?
        boolean b1, b2;
        String s6 = "1", s5;
        // double d1, double d2; //illegal the data type double must just be mentioned
        // once
        int i7;
        int i8;
        // int i9; i10; //illegal , use comma instead of semicolon if one statement

        // breaking Declaration
        var silly // CAN CONTINUE IN NEXT LINE BUT STILL TREATED A ONE
                = 1;
    }

    // local variables
    public int notValid() {
        int y = 10;
        int x;
        // must initialise x
        x = 0;
        int reply = x + y; // DOES NOT COMPILE if x is not initialised
        return reply;
    }

    // onlyOneBranch might not be initialised and compiler picks this up
    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

    public void checkAnswer() {
        boolean value;
        // value must be initialised
        value = true;
        findAnswer(value); // DOES NOT COMPILE if value is not initialised
    }

    // introducing va - type inference
    // local variable type inference.
    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    public void reassignment() {
        var number = 7;
        number = 4;
        // number = "five"; // DOES NOT COMPILE,ONCE THE TYPE IS INFERRED, IT CANNOT BE
        // CHANGED
        var apples = (short) 10;
        apples = (byte) 5; // BYTE CAN GO INTO A SHORT BECAUSE IT IS SMALLER
        // apples = 1_000_000; // DOES NOT COMPILE TYPE IS SHORT

    }


    public void doesThisCompile(boolean check) {
        // var question; // var variables need to be initialised on the same line
        var question = 1;
        // question = 1;
        // var answer;
        var answer = 0; // var variables need to be initialised on the same line
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }

    public void twoTypes() {
        // int a, var b = 3; // DOES NOT COMPILE . Must be the same type for multiple
        // declaration
        // var n = null; // DOES NOT COMPILE - null does not tell you what type of
        var n = (String) null; // We can cast null to a String which is an Object, then assign it to a var
        var n2 = "myData"; // String is an Object
        n = null; // so we can assign null to an Object type
        var m = 4; // 4 is not an object, it i a primitive type
        // m = null; // so DOES NOT COMPILE because we can only assign null to an Object
        // type

    }
}

// var is not used for constructor and method params , only local params
// public int addition(var a, var b) { // DOES NOT COMPILE
//     return a + b;
//     }
    
