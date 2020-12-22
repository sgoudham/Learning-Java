package state.with.singleton;

public class NoCash implements ATMState {

    ATMMachine atmMachine;
    private static NoCash instance;

    private NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public static NoCash getInstance(ATMMachine atmMachine) {
        return instance == null ? instance = new NoCash(atmMachine) : instance;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have any money");
        System.out.println("Your card is ejected");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have any money");
        System.out.println("There is no card to eject");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have any money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have any money");
    }
}
