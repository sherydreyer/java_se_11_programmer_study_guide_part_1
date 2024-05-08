package chapter8.understandingpolymorphism;

class Rodent {}
public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
       // Capybara capybara = (Capybara)rodent; //ClassCastException  the Rodent object might not be a Capybara, this is only possible if the rodent
                                              //reference referenced a Capybara pbject which it doesn't
        Rodent rodent2 = new Capybara();
        Capybara capybara2 = (Capybara)rodent2;
        System.out.println(capybara2);

        //INSTANCEOF

        if(rodent instanceof Capybara) {
            Capybara capybara = (Capybara)rodent;
        }else {
            System.out.println("This rodent is not a Capybara");
        }

        //check if it is an instanceof before casting to prevent class cast exception
        if(rodent2 instanceof Capybara) {
            Capybara capybara3 = (Capybara)rodent2;
            System.out.println("rodent2 is a Captbara");
        }else {
            System.out.println("This rodent is not a Capybara");
        }

    }
}
