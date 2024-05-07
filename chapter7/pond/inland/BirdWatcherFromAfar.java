package chapter7.pond.inland;

import chapter7.pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
     //   bird.floatInWater(); // DOES NOT COMPILE, this class is not a subclass of Bird so it cannot
                               //   access its protected methods from another oackage
     //   System.out.println(bird.text); // DOES NOT COMPILE, , this class is not a subclass of Bird
    }
}

