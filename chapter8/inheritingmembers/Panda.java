package chapter8.inheritingmembers;

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
}
public class Panda {
    public static void eat() {
        System.out.println("Panda is chewing");
    }
    public static void main(String[] args) {
        eat();
        Panda.eat();
        Bear.eat();
    }
}
