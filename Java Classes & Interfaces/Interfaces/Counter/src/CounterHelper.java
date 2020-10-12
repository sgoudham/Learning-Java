package src;

public class CounterHelper {
    
    private Counter[] counters;
    private Counter userCounter = null;

    public CounterHelper(Counter... counters) {
        this.counters = counters;
    }

    public void doInteractive(int userInput) {

        // Find the correct counter to count by. 
        // When no counter is found, display error message to user and quit the program
        for (Counter counter: counters) {
            if (userInput == counter.countBy())
                this.userCounter = counter;
        }
        if (userCounter == null) {
            System.out.println("Counter Not Found");
            System.exit(0);
        }
    }

    public void displayCounter(int iterations) {

        // Show the counter for the number of iterations that the user inputted
        System.out.println();
        for (int i = 0; i < iterations; i++) {
            System.out.println(userCounter.getNextNum());
        }
    }
}
