public class TestingVariableScope {
    public static void main(String[] args) {
        // System.out.println(bitesOfCheese); // bitesOfCheese is only in scope in the
        // eat method
    }

    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
          // System.out.println(bitesOfCheese); // DOES NOT COMPILE - only in scope in the
          // if statement
    }

    // These smaller
    // contained blocks can reference variables defined in the larger scoped
    // blocks, but not vice versa. Here’s an example:
    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        // System.out.println(teenyBit); // DOES NOT COMPILE
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

}
