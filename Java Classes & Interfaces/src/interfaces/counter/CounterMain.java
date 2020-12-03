package interfaces.counter;

import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        countUp();
        countUpInteractively();
    }

    private static void countUp() {
        ByTwos twos = new ByTwos();
        ByFives fives = new ByFives();

        // Display the first 5 numbers for each counter defined
        for (int i = 0; i < 5; i++) {
            System.out.println("Counting By " + twos.countBy());
            System.out.println(twos.getNextNum());
            System.out.println("Counting By " + fives.countBy());
            System.out.println(fives.getNextNum());
        }
    }

    private static void countUpInteractively() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter In The Number That You Want To Count:\n");
        int userInput = in.nextInt();

        CounterHelper helper = new CounterHelper(new ByOnes(), new ByTwos(), new ByThrees(), new ByFours(),
                new ByFives());
        helper.doInteractive(userInput);

        System.out.println("Enter In The Number Of Times You Want To Count:\n");
        int userIterations = in.nextInt();

        helper.displayCounter(userIterations);
        in.close();

    }
}
