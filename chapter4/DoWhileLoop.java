package chapter4;

public class DoWhileLoop {
    public static void main(String[] args) {
        int lizard = 0;
        do {
            lizard++;
        } while (false);
        System.out.println(lizard); // 1


        int llama = 20;
        while (llama > 10) {
            System.out.println("Llama!" + llama);
            llama--;
        }
        //   and this do/while loop:
        System.out.println("next do while");
        llama = 20;
        if (llama > 10) {
            do {
                System.out.println("Llama!" + llama);
                llama--;
            } while (llama > 10);
        }
        System.out.println("next do while");
        llama = 0;
        if(llama > 10) {
            do {
                System.out.println("Llama!" + llama);
                llama--;
            } while(llama > 10);
        } else {
            llama++;
        }




    }
}
