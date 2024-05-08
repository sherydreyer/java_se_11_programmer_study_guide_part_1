package chapter8.inheritingmembers;

class Camel {
    public int getNumberOfHumps() {
        return 1;
    }
}
class BactrianCamel extends Camel{
//    private int getNumberOfHumps() { // DOES NOT COMPILE access modifier must not be more restrictive
//                                     //for overriding
//        return 2;
//    }
}
public class Rider {
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps());
    }
}
