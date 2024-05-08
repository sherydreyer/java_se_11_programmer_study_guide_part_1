package chapter8;
//calling overloaded constructors with thid

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight) { // First constructor
        //System.out.println(); // no statements allowed before call to other constructor
        this(weight, "black"); //calling the other constructor, must be the first statement, comments are allowed
    }

    public Hamster(int weight, String color) { // Second constructor
        this.weight = weight;
        this.color = color;
    }
}

