package state;

public class Main {
    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.cashInMachine = 200;

        sleep(1000);

        atmMachine.insertCard();
        atmMachine.ejectCard();

        sleep(1000);

        atmMachine.insertCard();
        atmMachine.insertPin(1111);

        sleep(1000);

        atmMachine.insertPin(1234);
        atmMachine.requestCash(100);
    }

    static void sleep(int timeToSleep) {
        try {Thread.sleep(timeToSleep);}
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
