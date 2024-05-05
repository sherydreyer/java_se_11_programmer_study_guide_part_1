package chapter5;

public class UnderstandingArrays {
    public static void main(String[] args) {
        //creating an array with a size of three
        int[] numbers1 = new int[3]; // all three elements will have a default valur pf zero
        System.out.println(numbers1);

//        creating an array with three values
        int[] numbers2 = new int[] {42, 55, 99};
        System.out.println(numbers2);

//an anonymous array
        int[] numbers3 = {42, 55, 99};
        System.out.println(numbers3);

//        This means that all five of these statements do the
//        exact same thing:
        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];;

//        What types of reference variables do you think the following code
//        creates?
        int[] ids, types;

//        The correct answer is two variables of type int[]. This seems
//        logical enough. After all, int a, b; created two int variables.

        int ids2[], types2;  // This time we get one variable of type int[] and one variable of type int.

    }
}
