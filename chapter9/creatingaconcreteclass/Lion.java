package chapter9.creatingaconcreteclass;

abstract class Animal2 {
    abstract String getName();
}
abstract class BigCat extends Animal2 {
    protected abstract void roar();
}
public class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
