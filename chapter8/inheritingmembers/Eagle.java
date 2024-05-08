package chapter8.inheritingmembers;
//if the achild class has the same method name a s the parent
//determine if it is trying to overload it or override it
//rules for overloading will apply if overloading
//if overriding (method signature the same) then the return types must be compatible
// and access modifiers must be the same or less restrictive


class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}

public class Eagle {
    public int fly(int height) {  //overloading method in parent
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

//    public int eat(int food) { // return type is different to method it is suppose to be overriding
//        System.out.println("Bird is eating " + food + " units of food");
//        return food;
//    }
}
