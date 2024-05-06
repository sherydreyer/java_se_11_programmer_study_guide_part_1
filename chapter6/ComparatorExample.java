package chapter6;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
//        The method signature is as follows:
//        int compare(T o1, T o2)
        Comparator<Integer> ints = (i1, i2) -> i1 - i2;


//        Let’s try another one. Do you think these two statements would sort in
//        ascending or descending order?
        Comparator<String> strings = (s1, s2) -> s2.compareTo(s1);
        Comparator<String> moreStrings = (s1, s2) -> - s1.compareTo(s2);

        System.out.println(strings.compare("a","b"));
        System.out.println(moreStrings.compare("z","a" +
                ""));





    }
}
