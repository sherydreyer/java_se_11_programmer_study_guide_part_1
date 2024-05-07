package chapter7.pond.goose;

import chapter7.pond.shore.Bird;

public class Gosling extends Bird { // extends means create subclass
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // accessing protectedmember
    }
}

