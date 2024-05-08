package chapter8.inheritingmembers;

public class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }
    protected String getColor() {
        return "grey, black, or white";
    }
}
class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }
//    public CharSequence getColor() { // DOES NOT COMPILE a String is a CharSequence is not all charsequences are strings
//        return "grey";
//    }
}