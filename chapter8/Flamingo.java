package chapter8;
//Accessing the this Reference

public class Flamingo {
    private String color;

    public void setColor(String color) {
//        color = color; //assigning the param to itself
        this.color = color;  //correct , assigning the param to the color in line 4 of the object

    }

    public static void main(String... unused) {
        Flamingo f = new Flamingo();
        f.setColor("PINK");
        System.out.println(f.color);
    }
}