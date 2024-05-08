package chapter8;
public class BigCat {
    public double size;

    public static void main(String[] args) {
        Jaguar j = new Jaguar();
        j.printDetails();
    }
}
class Jaguar extends BigCat {
    public Jaguar() {
        //initializing parent's property
        size = 10.2;
    }
    public void printDetails() {
        //printing parent's property
        System.out.println(size);
    }
}
