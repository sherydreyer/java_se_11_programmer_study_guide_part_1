package chapter7;

public class PassingDataAmongMethods {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num); // 4

//        Pass-by-Value vs. Pass-by-Reference
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2


    }

    public static void newNumber(int num) {
        num = 8;

        String name = "Webby";
        speak(name);
        System.out.println(name);

        StringBuilder name2 = new StringBuilder();
        speak(name2);
        System.out.println(name2); // Webby


    }

    public static void speak(String name) {
        name = "Sparky";
    }
    public static void speak(StringBuilder s) {
        s.append("Webby");
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}