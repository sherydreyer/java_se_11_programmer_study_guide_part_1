package chapter5;

public class StringBuilderClass {
    public static void main(String[] args) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current; //  because Strings are immutable, a total of 27 objects are instantiated, most of which are
        // immediately eligible for garbage collection.
        System.out.println(alpha);

//        This is very inefficient. Luckily, Java has a solution. The StringBuilder
//        class creates a String without storing all those interim String values.
//        Unlike the String class, StringBuilder is not immutable.
        StringBuilder alpha2 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha2.append(current);
        System.out.println(alpha);

//        Mutability and Chaining
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb ="start+middle"
        StringBuilder same = sb.append("+end"); //"start+middle+end"
        System.out.println(sb);
        System.out.println(same);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

//        Creating a StringBuilder
//        There are three ways to construct a StringBuilder:
        StringBuilder sb1 = new StringBuilder(); //an empty one
        StringBuilder sb2 = new StringBuilder("animal"); // create a StringBuilder containing a specific value
        StringBuilder sb3 = new StringBuilder(10); // empty but with a capacity of 10 which can increase

//        Important StringBuilder Methods

//        charAt(), indexOf(), length(), and substring()
        StringBuilder sb4 = new StringBuilder("animals");
        String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
        int len = sb4.length();
        char ch = sb4.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

//        append()
//        One of the method signatures
//        is as follows:
//        StringBuilder append(String str)
        StringBuilder sb5 = new StringBuilder().append(1).append('c');
        sb5.append("-").append(true);
        System.out.println(sb5); // 1c-true

//        insert()
//        there are lots of method signatures for different
//        types. Here’s one:
//       StringBuilder insert(int offset, String str)

        StringBuilder sb6 = new StringBuilder("animals");
        sb6.insert(7, "-"); // sb6 = animals-
        sb6.insert(0, "-"); // sb6 = -animals-
        sb6.insert(4, "-"); // sb6 = -ani-mals-
        System.out.println(sb6);
//        The method signatures
//        are as follows:
//        StringBuilder delete(int startIndex, int endIndex)
//        StringBuilder deleteCharAt(int index)
        StringBuilder sb7 = new StringBuilder("abcdef");
        sb7.delete(1, 3); // sb7 = adef
        //   sb7.deleteCharAt(5); // throws an exception , only 4 values remaining


//        delete() and deleteCharAt()
//        The method signatures
//        are as follows:
//        StringBuilder delete(int startIndex, int endIndex)
//        StringBuilder deleteCharAt(int index)
        StringBuilder sb8 = new StringBuilder("abcdef");
        sb8.delete(1, 3); // sb = adef
      //  sb8.deleteCharAt(5); // throws an exception

//        replace()
//        The method signature is as follows:
//        StringBuilder replace(int startIndex, int endIndex, String
//        newString)
//        StringBuilder builder = new StringBuilder("pigeon dirty");
//        builder.replace(3, 6, "sty");
//        System.out.println(builder); // pigsty dirty
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder);

//        reverse()
//        The
//        method signature is as follows:
//        StringBuilder reverse()
//        The following code shows how to use this method:
        StringBuilder sb9 = new StringBuilder("ABC");
        sb9.reverse();
        System.out.println(sb9);

//        toString()
//        The method
//        signature is as follows:
//        String toString()
        StringBuilder sb10 = new StringBuilder("ABC");
        String s = sb10.toString();
        System.out.println(s);

//        Understanding Equality

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

//        to check the values inside the String
//        rather than the string reference itself
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z)); // true

        String string = "a";
        StringBuilder builder2 = new StringBuilder("a");
     //   System.out.println(string == builder); //DOES NOT COMPILE cannot compare two different types












    }
}
