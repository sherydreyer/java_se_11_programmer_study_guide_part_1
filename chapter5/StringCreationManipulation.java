package chapter5;

public class StringCreationManipulation {
    public static void main(String[] args) {
        String name = "Fluffy";
        String name2 = new String("Fluffy"); //for now, just remember that the String class is special and doesn’t need to be instantiated with new.

        System.out.println(1 + 2); // 3  ,  treated as numeric
        System.out.println("a" + "b"); // ab, , treated as string
        System.out.println("a" + "b" + 3); // ab3, treated as string
        System.out.println(1 + 2 + "c"); // 3c,  treated as string
        System.out.println("c" + 1 + 2); // c12,  treated as string

        String s = "1"; // s currently holds "1"
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123

        //THREE RULES
//        1. Use numeric addition if two  numbers are involved,
//        2. use concatenation otherwise,
//        3.and evaluate from  left to right.
//        Have you memorized these three rules yet? Be sure to do so before the exam!

//        Immutability

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3"); // cannot change s2. Can only reassign to a variable to see the change
        System.out.println(s2);

        //The length() method
//        The method signature is as follows:
//        int length()

        String string = "animals";
        System.out.println(string.length()); // 7

//        The  charAt() method
//        The method signature is as follows:
//        char charAt(int index)

        String string2 = "animals";
        System.out.println(string2.charAt(0)); // a
        System.out.println(string2.charAt(6)); // s
        // System.out.println(string2.charAt(7)); // throws exception

        //     indexOf()
//        The method signatures are as follows:
//        int indexOf(int ch)
//        int indexOf(int ch, int fromIndex)
//        int indexOf(String str)
//        int indexOf(String str, int fromIndex)

        String string3 = "animals";
        System.out.println(string3.indexOf('a')); // 0
        System.out.println(string3.indexOf("al")); // 4
        System.out.println(string3.indexOf('a', 4)); // 4
        System.out.println(string3.indexOf("al", 5)); // -1

//        substring()
//        The method signatures are as
//        follows:
//        String substring(int beginIndex)
//        String substring(int beginIndex, int endIndex)

        String string4 = "animals";
        System.out.println(string4.substring(3)); //mals
        System.out.println(string4.substring(string.indexOf('m'))); //mals
        System.out.println(string4.substring(3, 4)); // m
        System.out.println(string4.substring(3, 7)); //mals

        //THROWS EXCEPTIONS
//        System.out.println(string4.substring(3, 3)); // empty string
//        System.out.println(string4.substring(3, 2)); // throws exception, CAN'T GO BACKWARD
//        System.out.println(string4.substring(3, 8)); // throws exception, NO EIGHTH INDEX

//        toLowerCase() and toUpperCase()
//        The method signatures are as follows:
//        String toLowerCase()
//        String toUpperCase()

        String string5 = "animals";
        System.out.println(string5.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

//        These methods leave alone any characters other than
//        letters. Also, remember that strings are immutable, so the original
//        string stays the same.

//        equals() and equalsIgnoreCase()
//        The method signatures are as follows:
//        boolean equals(Object obj)
//        boolean equalsIgnoreCase(String str)
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

//        startsWith() and endsWith()
//        The method signatures are
//        as follows:
//        boolean startsWith(String prefix)
//        boolean endsWith(String suffix)
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

//        replace()
//        The method signatures are as follows:
//        String replace(char oldChar, char newChar)
//        String replace(CharSequence target, CharSequence replacement)
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

//        contains()
//        The method signature is as follows:
//        boolean contains(CharSequence charSeq)
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

//        trim(), strip(), stripLeading(), and stripTrailing()
//        The method signatures are as follows:
//        String strip()
//        String stripLeading()
//        String stripTrailing()
//        String trim()
        System.out.println("abc".strip()); // abc
        System.out.println("\t a b c\n".strip()); // a b c
        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        System.out.println(text.strip().length()); // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4

//        intern()
//        The method signature is as follows:
//        String intern() //WILL EXPLAIN LATER

//        Method Chaining

        String start = "AniMaL ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "AnimAl"
        System.out.println(result);

        //AS A CHAIN
        String result2 = "AniMaL ".trim().toLowerCase().replace('a',
                'A');
        System.out.println(result);

//        Remember that String is immutable. What do you think the result of
//        this code is?
         String a = "abc";
         String b = a.toUpperCase();
         b = b.replace("B", "2").replace('C', '3');
         System.out.println("a=" + a);
         System.out.println("b=" + b);


    }
}
