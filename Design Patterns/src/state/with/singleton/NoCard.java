package state.with.singleton;

public class NoCard implements ATMState {

    ATMMachine atmMachine;
    private static NoCard instance;

    private NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public static NoCard getInstance(ATMMachine atmMachine) {
        return instance == null ? instance = new NoCard(atmMachine) : instance;
    }

    @Override
    public void insertCard() {
        System.out.println("Card has been inserted");
        atmMachine.changeATMMachineState(HasCard.getInstance(atmMachine));
    }

    @Override
    public void ejectCard() {
        System.out.println("You didn't insert a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You have not entered your card");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not inserted your card");
    }
}
