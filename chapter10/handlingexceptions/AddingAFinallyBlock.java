package chapter10.handlingexceptions;

import org.w3c.dom.ls.LSOutput;

public class AddingAFinallyBlock {
    //     finally block is typically used to close resources
//    such as files or databases. In this exercises we it is only being explained
    public static void main(String[] args) {
        explore();
        explore2();
//WHAT DOES THIS OUTPUT?
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("t");
        } catch (Exception e) {
            sb.append("c");
        } finally {
            sb.append("f");
        }
        sb.append("a");
        System.out.print(sb.toString());
//        The answer is tfa. The try block is executed. Since no exception is
//        thrown

        System.out.println();
        //WHAT WOULD THIS PRINT?
        goHome2();

//        What would happen if info was null on
//        line 32?
//                31: } finally {
//        32: info.printDetails();
//        33: System.out.print("Exiting");
//        34: return "zoo";
//        35: }
//    If info is null, then the finally block would be executed, but it would
//    stop on line 32 and throw a NullPointerException. Lines 33–34 would
//    not be executed. In this example, you see that while a finally block
//    will always be executed, it may not finish.


//        NB: System.exit()
//        There is one exception to “the finally block always be executed”
        try {
            System.exit(0);
        } finally {
            System.out.print("Never going to get here"); // Not printed
        }
//        System.exit() tells Java, “Stop. End the program right now

}

    static void explore() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();


    }

    static void explore2() {
//        Do you see why the following do or do not compile?
//         try { // DOES NOT COMPILE
//             fall();
//             } finally {
//             System.out.println("all better");
//             } catch (Exception e) {
//             System.out.println("get up");
//             }
//
//         try { // DOES NOT COMPILE
//             fall();
//             }
//
//         try {
//             fall();
//             } finally {
//             System.out.println("all better");
//             }
//        The first example (lines 25–31) does not compile because the catch
//        and finally blocks are in the wrong order. The second example (lines
//                33–35) does not compile because there must be a catch or finally
//        block. The third example (lines 37–41) is just fine. The catch block is
//        not required if finally is present.

    }

    static void seeAnimals() {
        System.out.println("see animals");
    }

    ;

    static void fall() throws Exception {
        System.out.println("falling");
        throw new Exception();

    }

    ;

    static void getHugFromDaddy() {
        System.out.println("get Hug From Daddy");
    }

    ;

    static void seeMoreAnimals() {
        System.out.println("see More Animals");
    }

    ;

    static void goHome() {
        System.out.println("go home");
    }

    static int goHome2() {
        //return will always be 3 because finally will always run
        try {
            //throw new Exception();
            System.out.print("1");
            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }

    }


}
