package chapter5;

import java.util.Arrays;

public class ArrayType {
    public static void main(String args[]) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(
                bugs.toString()); //[Ljava.lang.String;@160bc7c0
        System.out.println(Arrays.toString(bugs));

//        As a quick review, what do you think this array points to?
        class Names {
            String names[];
        }
        //            Let’s try that again—what do you
//            think this array points to?
        class Names2 {
            String names[] = new String[2];
        }

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //     againStrings[0] = new StringBuilder(); // array is of type string not stringbuilder
        //      objects[0] = new StringBuilder(); // careful! will get an error at run time  ArrayStoreException ,objects is actually of type string

//using an array
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]);

//        To make sure you understand how length works, what do you think
//        this prints?
        String[] birds = new String[6];
        System.out.println(birds.length);  // 6 There are six  elements of null

        int[] numbers = new int[10];  //instantiates an array with 10 elements of null
        for (int i = 0; i < numbers.length; i++)  //loops through  it and inserts values
            numbers[i] = i + 5;
        System.out.println(Arrays.toString(numbers));

        //ArrayIndexOutOfBoundsException, all trying to access an idex 10, index for numbers is from 0 to 9
//        numbers[10] = 3;
//        numbers[numbers.length] = 5;
//        for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;

//        sorting
        int[] numbers2 = {6, 9, 1};
        Arrays.sort(numbers2);
        System.out.println("printing using loop ");
        for (int i = 0; i < numbers2.length; i++)
            System.out.print(numbers2[i] + " ");
        System.out.println();
        //alternatively to print, use..
        System.out.println("print using method " + Arrays.toString(numbers2));

        //string sorts in alphabetical order,  and 1sorts before 9
        String[] strings3 = {"10", "9", "100"};
        Arrays.sort(strings3);
        for (String string : strings3)
            System.out.print(string + " ");

//        Searching
//        Java also provides a convenient way to search—but only if the array is
//        already sorted.
        int[] numbers3 = {2, 4, 6, 8}; //array is sorted
        System.out.println(Arrays.binarySearch(numbers3, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers3, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers3, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers3, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers3, 9)); // -5

        //array ius not sorted so results are unpredictable
        int[] numbers4 = new int[]{3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers4, 2));
        System.out.println(Arrays.binarySearch(numbers4, 3));

//        Comparing
        System.out.println(Arrays.compare(new int[]{1}, new int[]{2}));

        //other examples
        System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1}));
        System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1, 2}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"A"}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{null}));

//        When comparing two arrays, they must be the same array type.
//        System.out.println(Arrays.compare(
//                new int[] {1}, new String[] {"a"})); // DOES NOT COMPILE

//        mismatch()
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));
        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));

//        Varargs

//        Here are three examples with a main() method:
//        public static void main(String[] args)
//        public static void main(String args[])
//        public static void main(String... args) // varargs

//        Multidimensional Arrays

        int[][] vars1; // 2D array
        int vars2[][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4[], space[][]; // a 2D AND a 3D array

//        You can specify the size of your multidimensional array in the
//        declaration if you like:
        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";

        //an array of three different size arrays
        // An asymmetric multidimensional array
        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};
        int[][] args2 = new int[4][];
        args2[0] = new int[5];
        args2[1] = new int[3];

//        Using a Multidimensional Array
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
            //easier with the enhanced for loop
            for (int[] inner : twoD) {
                for (int num : inner)
                    System.out.print(num + " ");
                System.out.println();
            }


        }
    }
}
