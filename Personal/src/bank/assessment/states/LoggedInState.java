package bank.assessment.states;

import bank.assessment.BankAccount;
import bank.assessment.Console;
import bank.assessment.Person;

public class LoggedInState implements BankAccountStates {

    BankAccount bankAccount;
    private static LoggedInState instance;

    private LoggedInState(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static LoggedInState getInstance(BankAccount bankAccount) {
        return instance == null ? instance = new LoggedInState(bankAccount) : instance;
    }

    @Override
    public void createAccount(Person person) {
        System.out.println("This Account Is Already Registered With Us. Please Log In!");
    }

    @Override
    public void logIn() {
        System.out.println("You Are Already Logged In!");
    }

    @Override
    public void logOut() {
        // Log out!
    }

    @Override
    public void deposit() {
        System.out.println("How Much Money Do You Want To Deposit?");
        double cashToDeposit = Double.parseDouble(Console.INPUT.nextLine());

        if (cashToDeposit >= 0) {
            bankAccount.setBalance(bankAccount.getBalance() + cashToDeposit);
        } else {
            System.out.println("Amount Entered Not Valid! Try Again!");
        }
    }

    @Override
    public boolean withdraw() {
        return bankAccount.withdraw();
    }

    @Override
    public void viewDetails() {
        System.out.println("Your Current Bank Details:");
        System.out.println(bankAccount);
    }

    @Override
    public void deleteAccount() {
        bankAccount.changeBankAccountState(NotCreatedState.getInstance(bankAccount));
        System.out.println("Account Deleted! We're Sad To See You Go :(");
    }
}
