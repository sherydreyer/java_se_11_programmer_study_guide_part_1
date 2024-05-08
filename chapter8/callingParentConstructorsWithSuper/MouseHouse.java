package chapter8.callingParentConstructorsWithSuper;

//constructor can initialize constants(static, final variables) just like instance initializer blocks

public class MouseHouse {
 //   constant instance or constant class variables are not given default values like other class and instance variables
 //  they must be given values in the same line in which they are declared or in initializer blocks , or constructors for constant instance
 //  variables
    private final int volume;
    private final String type;

    public MouseHouse() {
        this.volume = 10;
        type = "happy";
    }
}

