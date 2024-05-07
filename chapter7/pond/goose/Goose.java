package chapter7.pond.goose;

import chapter7.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
     //   other.floatInWater(); // DOES NOT COMPILE, from outside the oackage, only subclasses can access Bird's protected members
     //   System.out.println(other.text); // DOES NOT COMPILE
    }
}
