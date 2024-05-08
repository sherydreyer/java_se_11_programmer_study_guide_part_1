package chapter8;

public class Rabbit {

    public static void main(String[] args) {
        //using default constructor
        Rabbit rabbit = new Rabbit();

    }
}

// Since these three classes
//have a constructor defined, the default no-argument constructor is not
//inserted for you.
class Rabbit2 {
    public Rabbit2() {}
}
class Rabbit3 {
    public Rabbit3(boolean b) {}
}
class Rabbit4 {
    private Rabbit4() {}  // other classes cannot make an instance of this class
}

//Only Rabbit1 gets a default no-argument constructor.

