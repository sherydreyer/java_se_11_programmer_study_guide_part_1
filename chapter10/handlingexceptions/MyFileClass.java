package chapter10.handlingexceptions;

public class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    public void close() {
        System.out.println("Closing: " + num);
    }

    public static void main(String[] args) {
        try (MyFileClass a1 = new MyFileClass(1);
             MyFileClass a2 = new MyFileClass(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }
}


