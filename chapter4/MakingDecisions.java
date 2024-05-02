package chapter4;

public class MakingDecisions {
    public static void main(String[] args) {
//        Statements and Blocks
        int patrons = 0;
        // Single statement
        patrons++;
// Statement inside a block
        {
            patrons++;
        }

        // if statement to these two examples:
        int ticketsTaken = 10;
// Single statement
        if (ticketsTaken > 1)
            patrons++;
// Statement inside a block
        if (ticketsTaken > 1) {
            patrons++;
        }

//no block because only one statement
        int hourOfDay = 5;
        if (hourOfDay < 11)
            System.out.println("Good Morning");
        //with  block because more than  one statement
        int morningGreetingCount = 0;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }

        //Be careful with  no block , only   one statement belongs to the if.
        if (hourOfDay < 11)
            System.out.println("Good Morning");
        morningGreetingCount++; // this is not part of the if, There are no blck braces

        //The else Statement

        //WITH NO ELSE, TWO STATEMENTS
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if (hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

        //WITH  ELSE, ONE STATEMENT
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            //THIS IS EXECUTED IF ALL OF ABOVE IS FALSE
            System.out.println("Good Afternoon");
        }

        //ELSE IF , ONE STATEMENT
//        In this example, the Java process will continue execution until it
//        encounters an if statement that evaluates to true
//        If neither of the first
//        two expressions is true, it will execute the final code of the else block.
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            //ONLY EXECUTED IF THIS IS TRUE AND ALL OF ABOVE IS FALSE
            System.out.println("Good Afternoon");
        } else {
            //THIS IS EXECUTED IF ALL OF ABOVE IS FALSE
            System.out.println("Good Evening");
        }

        //ORDER IS IMPORTANT
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11) {
            //UNREACHABLE CODE
            System.out.println("Good Morning"); // COMPILES BUT IS UNREACHABLE
        } else {
            System.out.println("Good Evening");
        }

        //       Verifying That the if Statement Evaluates to a Boolean
//                Expression
//        Another common place the exam may try to lead you astray is by
//        providing code where the boolean expression inside the if
//        statement is not actually a boolean expression
        hourOfDay = 1;  // NOT A BOOLEAN
//        if(hourOfDay) { // DOES NOT COMPILE BECAUSE hourOfDay is not a boolean
//
//        }

//        be wary of assignment
//        operators being used as if they were equals (==) operators in if
//        statements:
        hourOfDay = 1;
//        if(hourOfDay = 5) { // DOES NOT COMPILE , using assignment = instead of ==
//
//        }


    }


}

