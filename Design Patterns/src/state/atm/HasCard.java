package state.atm;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can only insert one card at a time");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.changeATMMachineState(new NoCard(atmMachine));
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not entered your PIN");
    }

    @Override
    public void insertPin(int pinEntered) {

        if (pinEntered == 1234) {
            System.out.println("Correct PIN entered");
            atmMachine.correctPinEntered = true;
            atmMachine.changeATMMachineState(new HasPin(atmMachine));
        } else {
            System.out.println("You entered the wrong PIN");
            atmMachine.correctPinEntered = false;
        }
    }
}
