package state;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You have already inserted a card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.changeATMMachineState(new NoCard(atmMachine));
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You've already entered a pin");
    }

    @Override
    public void requestCash(int cashToWithdraw) {

        if (cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("You don't have enough cash to withdraw");
        } else {
            System.out.println("Cash Withdrawn: " + cashToWithdraw);
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

            if (atmMachine.cashInMachine <= 0)
                atmMachine.changeATMMachineState(new NoCash(atmMachine));
        }

        System.out.println("Your card is ejected");
        atmMachine.changeATMMachineState(new NoCard(atmMachine));
    }
}
