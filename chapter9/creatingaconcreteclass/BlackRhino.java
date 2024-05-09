package chapter9.creatingaconcreteclass;
//child abstract classes do have to implement abstrac methods of parents but the first concrete(non-abstract)
//class must
abstract class Mammal {
    abstract void showHorn();
    abstract void eatLeaf();
}
abstract class Rhino extends Mammal {
    void showHorn() {}
}
public class BlackRhino extends Rhino {
    void eatLeaf() {}
}

