package chapter7.pond.duck;

public class BadDuckling {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        //   duck.quack(); // DOES NOT COMPILE, cannot access private properties of another class
        //  System.out.println(duck.noise); // DOES NOT COMPILE, cannot access private properties of another class
    }
}
