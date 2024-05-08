package chapter8.callingParentConstructorsWithSuper;
//If the parent class has more than one constructor, the child class may
//use any valid parent constructor in its definition

public class Animal2 {
    private int age;
    private String name;
    public Animal2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Animal2(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}
class Gorilla extends Animal2 {
    public Gorilla(int age) {
        super(age,"Gorilla");
    }
    public Gorilla() {
        super(5);
    }
}

