package chapter8;
//overloaded constructors
//methos signatures must be different(params)

public class Turtle {


    private String name;

    public Turtle() {
        name = "John Doe";
    }

    public Turtle(int age) {
    }

    public Turtle(long age) {
    }

    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
//        Constructors are used when creating a new object. This process is
//        called instantiation because it creates a new instance of the class. A
//        constructor is called when we write new followed by the name of the
//        class we want to instantiate. Here’s an example:

        Turtle t = new Turtle();
        System.out.println(t.getName());

    }
}

