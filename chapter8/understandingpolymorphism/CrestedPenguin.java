package chapter8.understandingpolymorphism;


    class Penguin2 {
        public static int getHeight() { return 3; }
        public void printInfo() {
            System.out.println(this.getHeight());
        }
    }
    public class CrestedPenguin extends Penguin2 {
        public static int getHeight() { return 8; }
        public static void main(String... fish) {
            new CrestedPenguin().printInfo();
        }
    }

