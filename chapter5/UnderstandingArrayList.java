package chapter5;

import java.util.*;

public class UnderstandingArrayList {
    public static void main(String[] args) {
        //Creating an ArrayList
//        here are three ways to create an ArrayList:
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

//Generics
        ArrayList<String> list4 = new ArrayList<String>();
//        diamond operator
        ArrayList<String> list5 = new ArrayList<>();


        //using var
        var strings = new ArrayList<String>();
        strings.add("a");
        for (
                String s : strings) {
        }

        var list = new ArrayList<>(); //type will be Object
        list.add("a");
        //      for (String s: list) { } // DOES NOT COMPILE, incorrect type
        //correct type to object
        for (Object o : list) {
            System.out.println(o);
        }

        List<String> list6 = new ArrayList<>();
        //   ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE , cannot instantiate an interface

//printing an ArrayList
//        You should also know that ArrayList implements toString(), so you
//        can easily see the contents just by printing it.

        //METHODS OF AN ARRAYLIST

//        add()
//        The method signatures are as follows:
//        boolean add(E element)
//        void add(int index, E element)

        //WITHOUT GENERICS
        ArrayList list7 = new ArrayList();
        list7.add("hawk"); // [hawk]
        list7.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list7); // [hawk, true]

        //WITH GENERICS
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //   safer.add(Boolean.TRUE); // DOES NOT COMPILE,TYPE IS STRING

        //ADDING TO CERTAIN POSITIONS
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk,robin]
        System.out.println(birds); // [blue jay, cardinal, hawk,robin]

//        remove()
//        The method signatures are as follows:
//        boolean remove(Object object)
//        E remove(int index)

        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk"); // [hawk]
        birds2.add("hawk"); // [hawk, hawk]
        System.out.println(birds2); // []
        System.out.println(birds2.remove("cardinal")); // prints false
        System.out.println(birds2.remove("hawk")); // prints true
        System.out.println(birds2.remove(0)); // prints hawk
        System.out.println(birds2); // []

//        set()
//        The method signature is as follows:
//        E set(int index, E newElement)
        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk"); // [hawk]
        System.out.println(birds3.size()); // 1
        birds3.set(0, "robin"); // [robin]
        System.out.println(birds3.size()); // 1
        //   birds3.set(1, "robin"); //IndexOutOfBoundsException

//        isEmpty() and size()
//        The method signatures are as follows:
//        boolean isEmpty()
//        int size()

        List<String> birds4 = new ArrayList<>();
        System.out.println(birds4.isEmpty()); // true
        System.out.println(birds4.size()); // 0
        birds4.add("hawk"); // [hawk]
        birds4.add("hawk"); // [hawk, hawk]
        System.out.println(birds4.isEmpty()); // false
        System.out.println(birds4.size()); // 2

//        clear()
//        The method signature is as follows:
//        void clear()
        List<String> birds5 = new ArrayList<>();
        birds5.add("hawk"); // [hawk]
        birds5.add("hawk"); // [hawk, hawk]
        System.out.println(birds5.isEmpty()); // false
        System.out.println(birds5.size()); // 2
        birds5.clear(); // []
        System.out.println(birds5.isEmpty()); // true
        System.out.println(birds5.size()); // 0

//        contains()
//        The method signature is as follows:
//        boolean contains(Object object)
        List<String> birds6 = new ArrayList<>();
        birds6.add("hawk"); // [hawk]
        System.out.println(birds6.contains("hawk")); // true
        System.out.println(birds6.contains("robin")); // false

//        equals()
        //Method signature is as follows:
        //boolean equals(Object object);
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a"); // [a]
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); // [a,b]
        two.add(0, "b"); // [b,a]
        System.out.println(one.equals(two)); // false

//        Wrapper Classes

        //PRIMITIVES ARE NOT ALLOWED INTO ARRAYLIST
//        CONVERT TO WRAPPER TYPE
//
//         Boolean.valueOf(true)
//         Byte.valueOf((byte) 1)
//         Short.valueOf((short) 1)
//         Integer.valueOf(1)
//         Long.valueOf(1)
//         Float.valueOf((float) 1.0)
//         Double.valueOf(1.0)
//         Character.valueOf('c')

        //OR USE PARSE METHODS FOR CONVERTING TO PRIMITIVE
        //THERE IS ONE FOR EVERY PRIMITIVE TOO
//        Boolean Boolean.parseBoolean("true") (
//        Byte Byte.parseByte("1")
//        Short Short.parseShort("1")
//        Integer Integer.parseInt("1")
//        Long Long.parseLong("1")
//        Float Float.parseFloat("1")
//        Double Double.parseDouble("1")


        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");


        List<Integer> ints = new ArrayList<>();
        ints.add(wrapper);
        System.out.println(wrapper);


        //CAN ONLY CONVERT IN integer to an Integer etc etc

        //    int bad1 = Integer.parseInt("a"); // throws NumberFormatException
        //    Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

//        Autoboxing and Unboxing
        List<Integer> weights = new ArrayList<>();
        Integer w = 50; //automatic autoboxing
        weights.add(w); // [50]
        weights.add(Integer.valueOf(60)); // [50, 60]
        weights.remove(Integer.valueOf(50)); // [60]
        //or
        weights.remove(new Integer(50)); // [60]
        double first = weights.get(0); // 60.0 //automatic unboxing
        System.out.println(weights);

        // What do you think happens if you try to unbox a null?
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        //  int h = heights.get(0); // NullPointerException cannot unbox null to an int

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1); //removes element ta index 1
        numbers.remove(new Integer(1)); //removes element with value 1
        System.out.println(numbers);

//        Converting Between array and List
        List<String> listA = new ArrayList<>();
        listA.add("hawk");
        listA.add("robin");
        Object[] objectArray = listA.toArray(); //coverts to an Object[]
        String[] stringArray = listA.toArray(new String[0]);
        listA.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2

        //Creating a List that is linked to the original array
        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> listB = Arrays.asList(array); // returns fixed size list
        System.out.println(listB.size()); // 2
        listB.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        System.out.print(Arrays.toString(array));// [new, test]
        //  listB.remove(1); //cannot change the size

        //creating an immutable list of the array
        String[] array2 = {"hawk", "robin"}; // [hawk, robin]
        List<String> listC = List.of(array2); // returns immutable list
        System.out.println(listC.size()); // 2
        array2[0] = "new";
        System.out.println(Arrays.toString(array2)); // [new, robin]
        System.out.println(listC); // [hawk, robin]
        //    listC.set(1, "test"); // throws UnsupportedOperationException

//        Using Varargs to Create a List
        List<String> listAA = Arrays.asList("one", "two"); //CAN SEND ANY AMT OF PARAMS
        List<String> listBB = List.of("one", "two");//CAN SEND ANY AMT OF PARAMS
        listAA.set(1, "test");
        //   listBB.set(1, "test"); //NOT ALLOWED, IMMUTABLE LIST

//TO CHANGE THE NUMBER OF ELEMENTS, IT MUST BE CHANGED TO AN ARRAYLIST
        List<String> fixedSizeList = Arrays.asList("a", "b", "c");
        List<String> expandableList = new ArrayList<>(fixedSizeList);
        expandableList.remove(0);

//        Sorting
//        Sorting an ArrayList is similar to sorting an array. You just use a
//        different helper class:

        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(99);
        numbers3.add(5);
        numbers3.add(81);
        Collections.sort(numbers3);
        System.out.println(numbers3); // [5, 81, 99]



    }
}
