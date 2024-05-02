package chapter4;

public class InfiniteLoops {
    public static void main(String[] args) {

        //pen will always be less than 10 because it is not being changed so the loop wil run infinitely
        int pen = 2;
        int pigs = 5;
        while(pen < 10)
            pigs++;

    }
}
