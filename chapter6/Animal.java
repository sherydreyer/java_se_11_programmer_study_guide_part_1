package chapter6;

public class Animal implements CheckTrait

{
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean
            swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public String getSpecies() {
        return species;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }

    @Override
    public boolean test(Animal a) {
        return canHop;
    }

    //The first thing we want to check is whether the Animal can hop. We
    //provide a class that can check this:
    static class CheckIfHopper implements CheckTrait {
        public boolean test(Animal a) {
            return a.canHop();
        }
    }
    static class CheckIfSwimmer implements CheckTrait {
        public boolean test(Animal a) {
            return a.canSwim();
        }
    }
}
