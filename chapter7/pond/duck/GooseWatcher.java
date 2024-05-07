package chapter7.pond.duck;

import chapter7.pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
    //    goose.floatInWater(); // DOES NOT COMPILE GooseWatcher does not extend Bird
    }
}

