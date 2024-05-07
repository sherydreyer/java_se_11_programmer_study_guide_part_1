package chapter7;

public class DesigningMethods2 {
    public static void main(String[] args) {

    }

    //params can be empty
    void nap() {
    }

    public void walk1() {
    }

    // public void walk2 {} // DOES NOT COMPILE, missing the parenthesis for the paramaters list
    public void walk3(int a) {
    }

    //   public void walk4(int a; int b) {} // DOES NOT COMPILE, separate params with a comma
    public void walk5(int a, int b) {
    }

    //    Optional Exception List
//    You can list as many types of exceptions as you want.In this clause separated by commas. Here’s an example:
    public void zeroExceptions() {
    }

    public void oneException() throws IllegalArgumentException {
    }

    public void twoExceptions() throws
            IllegalArgumentException, InterruptedException {
    }

    //METHOD BODY
//    A method body is simply a code block. It has
//    braces that contain zero or more Java statements
    public void walk4() {}
 //   public void walk5() // DOES NOT COMPILE, NO BRACES FOR THE BODY OF THE METHOD
    public void walk6(int a) { int name = 5; }




}
