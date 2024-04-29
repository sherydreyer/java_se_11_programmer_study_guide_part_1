public class Chick2 {
    private String name = "Fluffy";
    {
        System.out.println("setting field");
    }

    public Chick2() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick2 chick = new Chick2();
        System.out.println(chick.name);
    }
}