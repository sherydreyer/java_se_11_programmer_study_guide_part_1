package chapter4;

public class ControlFlowBranch {
    public static void main(String[] args) {

        //Nested Loops
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("Hungry Hippo");
        int hungryHippopotamus = 8;
        while(hungryHippopotamus>0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus>5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus+", ");
        }

        //adding optional labels
        int[][] myComplexArray2 = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray2) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }

    }
}
