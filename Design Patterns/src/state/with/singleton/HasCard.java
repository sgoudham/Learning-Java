package state.with.singleton;

public class HasCard implements ATMState {

    ATMMachine atmMachine;
    private static HasCard instance;

    private HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public static HasCard getInstance(ATMMachine atmMachine) {
        return instance == null ? instance = new HasCard(atmMachine) : instance;
    }

    @Override
    public void insertCard() {
        System.out.println("You can only insert one card at a time");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.changeATMMachineState(NoCard.getInstance(atmMachine));
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not entered your PIN");
    }

    @Override
    public void insertPin(int pinEntered) {

        if (pinEntered == 1234) {
            System.out.println("Correct PIN entered");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.changeATMMachineState(HasPin.getInstance(atmMachine));
        } else {
            System.out.println("You entered the wrong PIN");
            atmMachine.setCorrectPinEntered(false);
        }
    }
}
