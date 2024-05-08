package chapter8.inheritingmembers;

import java.util.ArrayList;
import java.util.List;

class Mammal {
    public List<CharSequence> play() {  return new ArrayList<CharSequence>(); }
    public CharSequence sleep() { return "a"; }
}
 class Monkey extends Mammal {
    public ArrayList<CharSequence> play() { return new ArrayList<CharSequence>();}
}
 class Goat extends Mammal {
//    public List<String> play() {  } // DOES NOT COMPILE
    public String sleep() { return "a" ;}
}
