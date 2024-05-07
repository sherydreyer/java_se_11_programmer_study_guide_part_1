package chapter7.pond.swan;

import chapter7.pond.duck.MotherDuck; // import another


public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        //     duck.quack(); // DOES NOT COMPILE cannot accessMotherDuck's quack method because it is not available outside
                             // the package
        //    System.out.println(duck.noise); // DOES NOT COMPILE, cannot accessMotherDuck's quack noise because it is not available outside
                                             // the package
    }
}

