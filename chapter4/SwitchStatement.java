package chapter4;

public class SwitchStatement {
    public static void main(String[] args) {
//        The switch Statement

        //with if
        int dayOfWeek = 5;
        if (dayOfWeek == 0) System.out.print("Sunday");
        else if (dayOfWeek == 1) {
            System.out.print("Monday");
        } else if (dayOfWeek == 2) {
            System.out.print("Tuesday");
        } else if (dayOfWeek == 3)
            System.out.print("Wednesday");

        //with switch
        int month = 5;
        switch (month) { // DOES NOT COMPILE
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
        }

        //INVALID SWITCH SYNTAX
//        int month = 5;
//        switch month { // DOES NOT COMPILE, missing parentheses around the switch variable
//            case 1: System.out.print("January");
//        }
//        switch (month) // DOES NOT COMPILE,  e the cas, missing braces around the switch body
//        case 1: System.out.print("January");
//        switch (month) {
//            case 1: 2: System.out.print("January"); // DOES NOT COMPILE,the case keyword is missing before the 2: label
//        }
//        switch (month) {
//            case 1 || 2: System.out.print("January"); // DOES NOT COMPILE, CANNOT USE SHORT CIRCUIT WITH NUMERIC, ONLT BOOLEAN

        // A SWITCH WITHOUT CASES IS VALID FOR THE EXAM
        switch (month) {
        }

        //SWITCH DATA TYPES
//        The following is a list of all data types supported by switch statements:
//        int and Integer
//        byte and Byte
//        short and Short
//        char and Character
//        String
//        enum values
//        var (if the type resolves to one of the preceding types)

//        boolean eatVeg = false;
//        switch (eatVeg) {         // booean/long/float/double  not supported by switch
//        }

        dayOfWeek = 5;
        switch (dayOfWeek) {
            default:   // default is like an else. It can be placed anywhere but preferably last
                System.out.println("Weekday");
                break;  // break must be at the end of each case to terminate it
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        dayOfWeek = 5;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday"); // no break, so line 80 will be printed too
            case 6:
                System.out.println("Saturday");
                break;
        }

        // Numeric Promotion and Casting
        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        switch (size) {
            case small:  // as long at it is a constant
            case 1 + 2:   // as long at it is a constant
                //   case big: // DOES NOT COMPILE, too big to fit into a small
        }


    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:  // correct because it is a constant at compile time
//            case apples: // DOES NOT COMPILES
//            case getCookies(): // DOES NOT COMPILE not a constant at compile time, only at run time
//            case cookies : // DOES NOT COMPILE not a constant at compile time, only at run time
            case 3 * 5:  //literals are allowed
//          case "bananas" :  //does not compile , must be the same data type as numberOfAnimals
        }

    }

    final int getCookies() {
        return 4;
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            //       case middleName: // DOES NOT COMPILE, not a constant
            //       id = 5;
            //       break;
            case suffix:
                id = 0;
                break;
            //       case lastName: // DOES NOT COMPILE, not initialised at compile time, only runtime
            //         id = 8;
            //         break;
            //       case 5: // DOES NOT COMPILE, not a String
            //          id = 7;
            //          break;
            //       case 'J': // DOES NOT COMPILE, not a String
            //          id = 10;
            //         break;
            //  case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE, not a String
            //     id=15;
            //     break;
        }
        return id;
    }
}




