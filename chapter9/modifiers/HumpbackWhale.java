package chapter9.modifiers;
//methods cannot ba abstract and private, how will they be implemented
abstract class Whale {
 //   private abstract void sing(); // DOES NOT COMPILE
  //    protected abstract void sing(); //
}
public class HumpbackWhale extends Whale {
    private void sing() {   //to override the protected method above, this one should be protected or public
        System.out.println("Humpback whale is singing");
    }
}

