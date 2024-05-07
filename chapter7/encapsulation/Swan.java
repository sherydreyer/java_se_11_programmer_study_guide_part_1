package chapter7.encapsulation;


public class Swan {
//    For encapsulation, remember that data (an instance variable) is
//    private and getters/setters are public
    private int numberEggs; // private

    public int getNumberEggs() { // getter
        return numberEggs;
    }

    public void setNumberEggs(int newNumber) { // setter
        if (newNumber >= 0) {// guard condition
            numberEggs = newNumber;
            System.out.println("There are " + numberEggs + " eggs");
        } else {
            System.out.println("Number of eggs cannot be negative!");
        }
    }
}
