package chapter10.handlingexceptions;

//An overridden method in a subclass is allowed to declare fewer
//exceptions than the superclass or interface. This is legal because
//callers are already handling them.
class Hopper4 {
    public void hop() throws CanNotHopException { }
}
class Bunny4 extends Hopper {
    public void hop() { }
}

