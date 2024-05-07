package chapter7;

import jdk.jshell.spi.ExecutionControl;

public class DesigningMethods {
    public static void main(String[] args) throws InterruptedException {

        nap(10);
    }

    static public final void nap(int minutes) throws InterruptedException {

        //taking a nap
        System.out.println("taking a nap for " + minutes + " minutes");

//        Access Modifiers
//        Java offers four choices of access modifier:
//        private The private modifier means the method can be called only
//        from within the same class.
//        Default (Package-Private) Access With default access, the
//        method can be called only from classes in the same package. This one
//        is tricky because there is no keyword for default access. You simply
//        omit the access modifier.
//        protected The protected modifier means the method can be called
//        only from classes in the same package or subclasses.
        //see methods after the main method

        //METHOD NAMES
//        an identifier may only contain letters, numbers, $, or _.
        //see methods after the main method

    }

    public void walk1() {
    }      //compiles

    //default void walk2() {} // DOES NOT COMPILE there is no default modifier
    //  public walk3() {} // DOES NOT COMPILE modifier cannot be after the return type
    void walk4() {
    }  //compiles

//OPTIONAL SPECIFIERS You can have zero or more specifiers in a method declaration
//        static The static modifier is used for class methods and will be
//                covered later in this chapter.
//        abstract The abstract modifier is used when a method body is not
//        provided. It will be covered in Chapter 9.
//        final The final modifier is used when a method is not allowed to be
//        overridden by a subclass. It will also be covered in Chapter 8.
//        synchronized The synchronized modifier is used with multithreaded
//        code. It is on the 1Z0-816 exam, but not the 1Z0-815 exam.
//        native The native modifier is used when interacting with code
//        written in another language such as C++. It is not on either OCP 11
//        exam.
//        strictfp The strictfp modifier is used for making floating-point
//        calculations portable. It is not on either OCP 11 exam.

    public void walk5() {
    }

    public final void walk6() {
    }

    public static final void walk7() {
    }

    public final static void walk8() {
    }

    //        public modifier void walk9() {} // DOES NOT COMPILE modifier is not a specifier
    //        public void final walk10() {} // DOES NOT COMPILE  specifier cannot be after the return type
    final public void walk11() {
    }

//        Return Type
//        Remember that a method must have a return type. If no
//        value is returned, the return type is void

    public void walk12() {
    }

    public void walk13() {
        return;
    }

    public String walk14() {
        return "";
    }

//    public String walk15() {} // DOES NOT COMPILE, must have a return in the body

//    public walk16() {} // DOES NOT COMPILE , no return type
//    public String int walk17() {} // DOES NOT COMPILE, cannot have two return types

    //    String walk18(int a) {
//        if (a == 4) return "";
//    } // DOES NOT COMPILE, there is a return type , but only if the if condition is true
    int integer() {
        return 9;
    }
//    int longMethod() {
//        return 9L; // DOES NOT COMPILE
//    }

    int integerExpanded() {
        int temp = 9;
        return temp;
    }

   // int longExpanded() {
        //     int temp = 9L; // DOES NOT COMPILE, now you can see why you cannot return a long if the return type in the method signature is int
       // return temp;
   // }

    int longExpanded2() {
        int temp = (int) 9L; // DOES NOT COMPILE, now you can see why you cannot return a long if the return type in the method signature is int
        return temp;
    }

    //    Method Name
    public void walk19() {
    }

//    public void 2walk() {
//    } // DOES NOT COMPILE, METHOD NAME CANNOT BEGIN WITH A NUMBER

//    public walk3 void() {
//    } // DOES NOT COMPILE, methd name cannot be before the return type

    public void Walk_$() {
    }

//    public _() {
//    } // DOES NOT COMPILE, method name cannot be an underscore

//    public void() {
//    } // DOES NOT COMPILE, there is no method name


}

