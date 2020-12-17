package state.atm.with.singleton;

public class ATMMachine {

    private ATMState atmState;
    private int cashInMachine;
    private boolean correctPinEntered = false;

    public ATMMachine() {
        this.atmState = NoCard.getInstance(this);
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

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public boolean isCorrectPinEntered() {
        return correctPinEntered;
    }

    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }
}
