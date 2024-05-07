package chapter7.pond.swan;

import chapter7.pond.shore.Bird;

public class Swan extends Bird { // but subclass of Bird

    public void swim() {
        floatInWater(); // subclass access to superclass
        System.out.println(text); // subclass access to superclass
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // subclass access to superclass
        System.out.println(other.text); // subclass access
        // to superclass
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        //  other.floatInWater(); // DOES NOT COMPILE
        //  System.out.println(other.text); // DOES NOT COMPILE
    }
}
