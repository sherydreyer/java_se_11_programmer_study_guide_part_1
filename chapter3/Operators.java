import java.io.File;

public class Operators {
public static void main(String[] args) {
    //types of operators
    int cookies = 4;
double reward = 3 + 2 * --cookies;
//.out.print("Zoo animal receives: "+reward+" reward points");

//Operator precedence

int height = 6;
int length = 5;
var perimeter = 2 * height + 2 * length;
    System.out.println(perimeter);
    // Applying unary operators

    //negating
    System.out.println(-height);

    //adding one
    System.out.println(++height);

   // Logical Complement and Negation Operators
    boolean isAnimalAsleep = false;
    System.out.println(isAnimalAsleep); // false
    isAnimalAsleep = !isAnimalAsleep;
    System.out.println(isAnimalAsleep); // true
    double zooTemperature = 1.21;
    System.out.println(zooTemperature); // 1.21
    zooTemperature = -zooTemperature;
    System.out.println(zooTemperature); // -1.21
    zooTemperature = -zooTemperature;
    System.out.println(zooTemperature); // 1.21

    //does not compile beacuse you can only use invert{!} on boolean
    //only use negate(-) on numeric
//    int pelican = !5; // DOES NOT COMPILE
//    boolean penguin = -true; // DOES NOT COMPILE
//    boolean peacock = !0; // DOES NOT COMPILE

    int parkAttendance = 0;
    System.out.println(parkAttendance); // 0
    System.out.println(++parkAttendance); // 1
    System.out.println(parkAttendance); // 1
    System.out.println(parkAttendance--); // 1
    System.out.println(parkAttendance); // 0

    //increment and decrement operators
    int lion = 3;
    int tiger = ++lion * 5 / lion--;

    //Working with Binary Arithmetic Operators
    System.out.println("lion is " + lion);
    System.out.println("tiger is " + tiger);

//    Working with Binary Arithmetic Operators
    int price = 2 * 5 + 3 * 4 - 8;
    System.out.println("price is " + price);
    int price2 = 2 * ((5 + 3) * 4 - 8);
    System.out.println("price2 is " + price2);

//    long pigeon = 1 + ((3 * 5) / 3; // DOES NOT COMPILE , unbalanced parenthesis
//    int blueJay = (9 + 2) + 3) / (2 * 4; // DOES NOT COMPILE, unbalanced parenthesis
//    short robin = 3 + [(4 * 2) + 4]; // DOES NOT COMPILE java does not allow square brackets

    System.out.println(9 / 3); // 3
    System.out.println(9 % 3); // 0
    System.out.println(10 / 3); // 3
    System.out.println(10 % 3); // 1
    System.out.println(11 / 3); // 3
    System.out.println(-11 % 3); // 2
    System.out.println(12 / -3); // 4
    System.out.println(12 % 3); // 0

//    Numeric Promotion


//    What is the data type of x * y?
    int x = 1;
    long y = 33;
    var z = x * y;


//    What is the data type of x + y?
    double x2 = 39.21;
//    float x4 = 2.1;
    var x3 = x2+ 24;

//    What is the data type of x * y?
    short xx = 10;
    short yy = 3;
    var zz = xx * yy;

//    Assigning Values

//   Casting
    int fur = (int)5;
    int hair = (short) 2;
    String type = (String) "Bird";
    short tail = (short)(4 + 10);
//    long feathers = 10(long); // DOES NOT COMPILE data type on wrong side

//    float egg = 2.0 / 9; // DOES NOT Compile   cannot put a double which is bigger then a float into a float
//    int tadpole = (int)5 * 2L; // DOES NOT COMPILE, only casting 5 to an int then answer is a long
//    short frog = 3 - 2.0; // DOES NOT COMPILE cannot put a double into a short

//    int fish = 1.0; // DOES NOT COMPILE
//    short bird = 1921222; // DOES NOT COMPILE
//    int mammal = 9f; // DOES NOT COMPILE
//    long reptile = 192301398193810323; // DOES NOT COMPILE

//   applying casting

    int trainer = (int)1.0;
    short ticketTaker = (short)1921222; // Stored as 20678
    int usher = (int)9f;
    long manager = 192301398193810323L;

//    Overflow and Underflow
    System.out.print(2147483647+1); // -2147483648 Since 2147483647 is the maximum int value, adding any strictly
                                    // positive value to it will cause it to wrap to the smallest negative
                                    //number
    short mouse = 10;
    short hamster = 3;
//    short capybara = mouse * hamster; // DOES NOT COMPILE  short values are
                                        //automatically promoted to int when applying any arithmetic operator,
                                        //with the resulting value being of type int.
    short capybara = (short)(mouse * hamster); //By casting a larger value into a smaller data type, you are instructing
                                                //the compiler to ignore its default behavior


//    short capybara = (short)mouse * hamster; // DOES NOT COMPILE, only mouse is cat to a short
//    short gerbil = 1 + (short)(mouse * hamster); // DOES NOT COMPILE, adding a 1 which is an int makes the final resullt an int

//    Compound Assignment Operators
    int camel = 2, giraffe = 3;
    camel = camel * giraffe; // Simple assignment operator
    camel *= giraffe; // Compound assignment operator
    System.out.println("camel is " + camel);

//    Compound operators are useful for more than just shorthand—they
//    can also save us from having to explicitly cast a value.

    long goat = 10;
    int sheep = 5;
//    sheep = sheep * goat; // DOES NOT COMPILE

//    in this example we see that the compiler will automatically cast the
//    resulting value to the data type of the value on the left side of the
//   compound operator.
    sheep *= goat;

//    One final thing to know about assignment operators is that the result
//    of an assignment is an expression in and of itself, equal to the value of
//    the assignment.
    long wolf = 5;
    long coyote = (wolf=3);
    System.out.println(wolf); // 3
    System.out.println(coyote); // 3

 //   While this may look like a test if healthy is true, it’s actually assigning
//    healthy a value of true.
    boolean healthy = false;
    if(healthy = true)
        System.out.print("Good!");

//    Comparing Values

//    boolean monkey = true == 3; // DOES NOT COMPILE
//    boolean ape = false != "Grape"; // DOES NOT COMPILE
//    boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

    boolean bear = false;
    boolean polar = (bear = true);
    System.out.println(polar); // true

    File monday = new File("schedule.txt");
    File tuesday = new File("schedule.txt");
    File wednesday = tuesday;
    System.out.println(monday == tuesday); // false
    System.out.println(tuesday == wednesday); // true

    System.out.print(null == null); // true

    //Relational operators
    int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
    System.out.println(gibbonNumFeet < wolfNumFeet); // true
    System.out.println(gibbonNumFeet <= wolfNumFeet); // true
    System.out.println(gibbonNumFeet >= ostrichNumFeet); // true
    System.out.println(gibbonNumFeet > ostrichNumFeet); // false


//    In this example, there is only one object created in memory but three
//    different references to it because Integer inherits both Number and
//    Object
    Integer zooTime = Integer.valueOf(9);
    Number num = zooTime;
    Object obj = zooTime;

//    Where polymorphism often comes into play is when you create a
//    method that takes a data type with many possible subclasses. For
//    example, imagine we have a function that opens the zoo and prints the
//    time. As input, it takes a Number as an input parameter.
 openZoo(10);

//    null and the instanceof operator
    System.out.println(null instanceof Object);
    Object noObjectHere = null;
    System.out.println(noObjectHere instanceof String);

//    This example does not compile, since null is used
//    on the right side of the instanceof operator:
//    System.out.print(null instanceof null); // DOES NOT COMPILE

//    Logical Operators
    boolean eyesClosed = true;
    boolean breathingSlowly = true;
    boolean resting = eyesClosed | breathingSlowly;
    boolean asleep = eyesClosed & breathingSlowly;
    boolean awake = eyesClosed ^ breathingSlowly;
    System.out.println(resting); // true
    System.out.println(asleep); // true
    System.out.println(awake); // false

//    Short-Circuit Operators

//    The short-circuit operators are nearly identical to the logical
//    operators, & and |, except that the right side of the expression may
//    never be evaluated if the final result can be determined by the left side
//    of the expression. For example, consider the following statement:
    int hour = 24;
    boolean zooOpen = true || (hour < 4);
    System.out.println(zooOpen); // true

//    Avoiding a NullPointerException

//    A more common example of where short-circuit operators are used is
//    checking for null objects before performing an operation. In the
//    following example, if duck is null, then the program will throw a
//    NullPointerException at runtime:
    Duck duck = new Duck();
    if(duck!=null & duck.getAge()<5) { // Could throw NullPointerException
// Do something
    }

//    In this example, if duck was null, then the short-circuit prevents a
//    NullPointerException from ever being thrown, since the evaluation of
//    duck.getAge() < 5 is never reached.
    if(duck!=null && duck.getAge()<5) {
// Do something
    }

//    Checking for Unperformed Side Effects

//    System.out.println(rabbit);
//    Because rabbit >= 6 is true, the increment operator on the right side
//    of the expression is never evaluated, so the output is 6.
    int rabbit = 6;
    boolean bunny = (rabbit >= 6) || (++rabbit <= 7);

//    Making Decisions with the Ternary Operator

    //if statement
    int owl = 5;
    int food;
    if(owl < 2) {
        food = 3;
    } else {
        food = 4;
    }
    System.out.println(food); // 4

    //ternary operator
    food = owl < 2 ? 3 : 4;
    System.out.println(food); // 4


//    For the exam, you should know that there is no requirement that
//    second and third expressions in ternary operations have the same data
//    types, although it does come into play when combined with the
//    assignment operator.
    int stripes = 2;
    System.out.println((stripes > 5) ? 21 : "Zebra");
//    int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE
    var animal = (stripes < 9) ? 3 : "Horse";  //unless you use var

//    Ternary Expression and Unperformed Side Effects

//    Notice that since the left-hand boolean expression was true, only
//    sheep was incremented
    sheep = 1;
    int zzz = 1;
    int sleep = zzz<10 ? sheep++ : zzz++;
    System.out.println(sheep+","+zzz); // 2,1

//    Now that the left-hand boolean expression evaluates to false, only
//    zzz was incremented.
    sleep = sheep>=10 ? sheep++ : zzz++;
    System.out.println(sheep+","+zzz); // 1,2




}
    public static void openZoo(Number time) {
//        We now have a method that can intelligently handle both Integer and
//        other values.
        if(time instanceof Integer)
//            It is considered a good
//        coding practice to use the instanceof operator prior to casting from
//        one object to a narrower type.
            System.out.println((Integer)time + " O'clock");
        else
            System.out.println(time);
    }
    //    One area the exam might try to trip you up on is using instanceof with
//            incompatible types. For example, Number cannot possibly hold a String
//    value, so the following would cause a compilation error:
    public static void openZoo2(Number time) {
//        if (time instanceof String) // DOES NOT COMPILE
//        {}
    }

}
class Duck {
    int age;
    int getAge() {
        return age;
    }
}
