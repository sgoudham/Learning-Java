package state.atm;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card has been inserted");
        atmMachine.changeATMMachineState(new HasCard(atmMachine));
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
