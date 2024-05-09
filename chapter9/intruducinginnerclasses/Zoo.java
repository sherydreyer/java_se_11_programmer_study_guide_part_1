package chapter9.intruducinginnerclasses;
//Developers often define a member inner class inside another class if
//the relationship between the two classes is very close

//public class Zoo {
//    public class Ticket {}
//}
//We can expand this to include an interface.
public class Zoo {
    private interface Paper {
        public String getId();
    }
    public class Ticket implements Paper {
        private String serialNumber;
        public String getId() { return serialNumber; }
    }
    public Ticket sellTicket(String serialNumber) {
        var t = new Ticket();
        t.serialNumber = serialNumber;
        return t;
    }
    public static void main(String... unused) {
        var z = new Zoo();
        var t = z.sellTicket("12345");
        System.out.println(t.getId()+" Ticket sold!");
    }

}


