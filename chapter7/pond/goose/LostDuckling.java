package chapter7.pond.goose;

import chapter7.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.println("Thanks" + teacher.name); // allowed, accessing public members of Teacher
    }
}

