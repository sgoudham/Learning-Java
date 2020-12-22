package state;

public class ATMMachine {

    ATMState atmState;
    int cashInMachine;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.atmState = new NoCard(this);
    }

    public void changeATMMachineState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered){
        atmState.insertPin(pinEntered);
    }

}
