package chapter8.callingParentConstructorsWithSuper;

public class MouseHouse2 {
    private final int volume;
    private final String type;
    {
        this.volume = 10;
    }
    public MouseHouse2(String type) {
        this.type = type;
    }
//    public MouseHouse2() { // DOES NOT COMPILE
//        this.volume = 2; // DOES NOT COMPILE  volume already assigned a value
//                           Also the compiler detects that a value is never set for type and reports an error
//                           on the line where the constructor is declared
//    }
public MouseHouse2() {
    this(null);
}
}
