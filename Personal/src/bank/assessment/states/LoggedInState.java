package bank.assessment.states;

import bank.assessment.BankAccount;
import bank.assessment.Console;
import bank.assessment.Person;

public class LoggedInState implements BankAccountStates {

    private static BankAccount bankAccount;
    private static LoggedInState instance;

    public LoggedInState(BankAccount bankAccount) { LoggedInState.bankAccount = bankAccount; }

    public static LoggedInState getInstance(BankAccount ba) {
        return instance == null || bankAccount != ba ? instance = new LoggedInState(ba) : instance;
    }

    @Override
    public void createAccount(Person person) { System.out.println("This Account Is Already Registered With Us. You Are Already Logged In!"); }

    @Override
    public void logIn() {
        System.out.println("You Are Already Logged In!");
    }

    @Override
    public void logOut() {
        System.out.println("You Are Now Logged Out!");
        bankAccount.changeBankAccountState(LoggedOutState.getInstance(bankAccount));
    }

    @Override
    public void deposit() {
        System.out.println("How Much Money Do You Want To Deposit?");
        double cashToDeposit = Double.parseDouble(Console.INPUT.nextLine());

        if (cashToDeposit >= 0) {
            bankAccount.setBalance(bankAccount.getBalance() + cashToDeposit);
            System.out.printf("Deposit Of %s Successful!\n", cashToDeposit);
            bankAccount.displayBalance();
        } else {
            System.out.println("Amount Entered Not Valid! Try Again!");
        }
    }

    @Override
    public void withdraw() {
        System.out.println("How Much Money Do You Want To Withdraw?");
        double cashToWithdraw = Double.parseDouble(Console.INPUT.nextLine());

        if (cashToWithdraw <= (bankAccount.getBalance() + bankAccount.getOverdraftLimit())) {
            bankAccount.setBalance(bankAccount.getBalance() - cashToWithdraw);
            System.out.printf("Withdrawal Of %s Successful!\n", cashToWithdraw);
            bankAccount.displayBalance();
        } else {
            System.out.println("Insufficient Funds Available to Withdraw! Try Again!");
        }
    }

    @Override
    public void viewDetails() { System.out.println("Your Current Bank Details: \n" + bankAccount); }

    @Override
    public void deleteAccount(Person person) {
        person.setBankAccount(new BankAccount());
        System.out.println("Account Deleted! We're Sad To See You Go :(");
    }
}
