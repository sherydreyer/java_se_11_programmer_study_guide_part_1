package chapter10.handlingexceptions;

public class ApplyingAMultiCatchBlock {
    public static void main(String args[]) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        //a shorter way using one catch block since tbe error message os the same
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch
        (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

//        Java intends multi-catch to be used for exceptions that aren’t related,
//        and it prevents you from specifying redundant types in a multi-catch.
//        Do you see what is wrong here?
//        try {
//            throw new IOException();
//        } catch (FileNotFoundException | IOException p) {} // DOES NOT COMPILE
//        Specifying it in the multi-catch is redundant, and the compiler gives a
//        message such as this:
//        The exception FileNotFoundException is already caught by the
//        alternative IOException

//        To review multi-catch, see how many errors you can find in this try
//        statement:
//        11: public void doesNotCompile() { // METHOD DOES NOT COMPILE
//            12: try {
//                13: mightThrow();
//                14: } catch (FileNotFoundException | IllegalStateException e)
//            {
//                15: } catch (InputMismatchException e |
//            MissingResourceException e) {
//                16: } catch (FileNotFoundException | IllegalArgumentException
//            e) {
//                17: } catch (Exception e) {
//                18: } catch (IOException e) {
//                19: }
//            20: }
//        21: private void mightThrow() throws DateTimeParseException,
//                IOException { }
//        This code is just swimming with errors. In fact, some errors hide
//        others, so you might not see them all in the compiler. Once you start
//        fixing some errors, you’ll see the others. Here’s what’s wrong:
//        Line 15 has an extra variable name. Remember that there can be
//        only one exception variable per catch block.
//                Line 16 cannot catch FileNotFoundException because that
//        exception was already caught on line 14. You can’t list the same
//        exception type more than once in the same try statement, just like
//        with “regular” catch blocks.
//                Lines 17 and 18 are reversed. The more general superclasses must
//        be caught after their subclasses. While this doesn’t have anything
//        to do with multi-catch, you’ll see “regular” catch block problems
//        mixed in with multi-catch.


    }

}
