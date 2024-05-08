package chapter8.callingParentConstructorsWithSuper;

public class Mammal {
    public Mammal(int age) {}
}
//public class Elephant extends Mammal { // DOES NOT COMPILE
//}

//Because Elephant is given n-argument default constructors as follows
//public class Elephant extends Mammal {
//    public Elephant() {
//        super(); // DOES NOT COMPILE
//    }
//}
//it's call to super() does not compile because Mammal does not have - no-argument default constructor
//this will work

class Elephant extends Mammal {
    public Elephant() {
        super(10);
    }
}

//or this giving Mammal a no-argument constructor

class Mammal2 {
    public Mammal2() {}
    public Mammal2(int age) {}
}

class Elephant2 extends Mammal2 {}







