package state.with.singleton;

public class HasPin implements ATMState {

    ATMMachine atmMachine;
    private static HasPin instance;

    private HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public static HasPin getInstance(ATMMachine atmMachine) {
        return instance == null ? instance = new HasPin(atmMachine) : instance;
    }

    @Override
    public void insertCard() {
        System.out.println("You have already inserted a card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.changeATMMachineState(NoCard.getInstance(atmMachine));
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You've already entered a pin");
    }

    @Override
    public void requestCash(int cashToWithdraw) {

        if (cashToWithdraw > atmMachine.getCashInMachine()) {
            System.out.println("You don't have enough cash to withdraw");
        } else {
            System.out.println("Cash Withdrawn: " + cashToWithdraw);
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cashToWithdraw);

            if (atmMachine.getCashInMachine() <= 0)
                atmMachine.changeATMMachineState(NoCash.getInstance(atmMachine));
        }

        System.out.println("Your card is ejected");
        atmMachine.changeATMMachineState(NoCash.getInstance(atmMachine));
    }
}
