package chapter6;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
//        The Consumer functional interface has one method you need to know:
//        void accept(T t)

        Consumer<String> consumer = x -> System.out.println(x);
        print(consumer, "Hello World");
    }
    private static void print(Consumer<String> consumer, String
            value) {
        consumer.accept(value);
    }

}
