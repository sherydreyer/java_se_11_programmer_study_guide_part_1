package chapter4;

public class WhileLoop {
    static int roomInBelly = 5;

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
        eatCheese(10);
        int full = 5;
        while(full < 5) {
            System.out.println("Not full!");  //will not print because full is 5, condition id false
            full++;
        }

    }

    static public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }
}
