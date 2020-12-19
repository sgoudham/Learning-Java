package bank.assessment.states;

import bank.assessment.BankAccount;
import bank.assessment.BasicAccount;
import bank.assessment.Console;
import bank.assessment.Person;

public class LoggedOutState implements BankAccountStates {

    BankAccount bankAccount;
    private static LoggedOutState instance;

    private LoggedOutState(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static LoggedOutState getInstance(BankAccount bankAccount) {
        return instance == null ? instance = new LoggedOutState(bankAccount) : instance;
    }

    @Override
    public void createAccount(Person person) {
        System.out.println("You Have Already Created An Account!");
    }

    @Override
    public void logIn() {
        System.out.println("Please Enter Your Login Username: ");
        String loginUsername = Console.INPUT.nextLine();

        System.out.println("Please Enter Your Login Password: ");
        String loginPassword = Console.INPUT.nextLine();

        if (!bankAccount.getUsername().equalsIgnoreCase(loginUsername) || !bankAccount.getPassword().equalsIgnoreCase(loginPassword)) {
            System.out.println("Uh Oh Error! Incorrect Username Or Password Entered!");
        } else {
            System.out.printf("Welcome Back '%s'", bankAccount.getUsername());
            bankAccount.changeBankAccountState(LoggedInState.getInstance(bankAccount));
        }
    }

    @Override
    public void logOut() {
        System.out.println("You Have Already Logged Out! Please Log in!");
    }

    @Override
    public void deposit() {

    }

    @Override
    public boolean withdraw() {
        System.out.println("Please Log In Before Trying To Withdraw Funds!");
        return false;
    }

    @Override
    public void viewDetails() {

    }

    @Override
    public void deleteAccount() {
        bankAccount = new BasicAccount();
        System.out.println("Account Deleted! We're Sad To See You Go :(");

        // Same as?
        // bankAccount = new BasicAccount();
        // System.out.println("Account Deleted! We're Sad To See You Go :(");
    }
}
