package chapter5;

public class MathAPI {
    public static void main(String[] args) {
        //min()
//        The method signatures for min() are as follows:
//        double min(double a, double b)
//        float min(float a, float b)
//        int min(int a, int b)
//        long min(long a, long b)
        int first = Math.max(3, 7); // 7
        int second = Math.min(7, -9); // -9

        //round()
//        The method signatures for round() are as follows:
//        long round(double num)
//        int round(float num)
        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); // 123

//        pow()
//        The method signature is as follows:
//        double pow(double number, double exponent)
        double squared = Math.pow(5, 2); // 25.0
        System.out.println(squared);

//        random()
//        The method signature is as follows:
//        double random()
        double num = Math.random();
        System.out.println(num);




    }
}
