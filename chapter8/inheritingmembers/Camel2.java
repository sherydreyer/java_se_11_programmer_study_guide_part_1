package chapter8.inheritingmembers;
//different methods, not overridden ,
// would not have compiled if method was
// not private because return types are different for overriding
public class Camel2 {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}
class DromedaryCamel extends Camel2 {
    private int getNumberOfHumps() {
        return 1;
    }
}
