package chapter7.encapsulation;

public class EncapsulatingData {

    //    It’s time for some practice. See whether you can figure out which lines
//    follow these naming conventions:
//            12: private boolean playing;
    private String name;  //good

    public boolean playing() {
        return true;
    }   //good

    public String name() {
        return name;
    }  //should be getName()

    public void updateName(String n) {
        name = n;
    }    // should be setName()

    public void setName(String n) {
        name = n;
    }  //good


    public static void main(String[] args) {
//        For encapsulation, remember that data (an instance variable) is
//        private and getters/setters are public in the Swan class
        Swan mother = new Swan();
//        mother.numberEggs = -1;
        mother.setNumberEggs(10);
    }
}

//For data to be encapsulated, you don’t have to provide getters and
//setters. As long as the instance variables are private, you are good. For
//example, this is a well-encapsulated class:
//public class Swan {
//    private int numEggs;
//    public void layEgg() {
//        numEggs++;
//    }
//    public void printEggCount() {
//        System.out.println(numEggs);
//    }
//}

