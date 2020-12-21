package bank.assessment.states;

import bank.assessment.BankAccount;
import bank.assessment.Console;
import bank.assessment.Person;

public class LoggedOutState implements BankAccountStates {

    private static BankAccount bankAccount;
    private static LoggedOutState instance;

    private LoggedOutState(BankAccount bankAccount) {
        LoggedOutState.bankAccount = bankAccount;
    }

    public static LoggedOutState getInstance(BankAccount ba) {
        return instance == null || bankAccount != ba ? instance = new LoggedOutState(ba) : instance;
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
            System.out.printf("Welcome Back '%s'\n", bankAccount.getUsername());
            System.out.println("Your Current Bank Details: \n" + bankAccount);
            bankAccount.changeBankAccountState(LoggedInState.getInstance(bankAccount));
        }
    }

    @Override
    public void logOut() {
        System.out.println("You Have Already Logged Out!");
    }

    @Override
    public void deposit() {
        System.out.println("Sorry, Please Log In First Before Trying Deposit Cash!");
    }

    @Override
    public void withdraw() {
        System.out.println("Please Log In Before Trying To Withdraw Funds!");
    }

    @Override
    public void viewDetails() {
        System.out.println("There Are No Account Details To View, Please Log In!");
    }

    @Override
    public void deleteAccount(Person person) {
        person.setBankAccount(new BankAccount());
        System.out.println("Account Deleted! We're Sad To See You Go :(");
    }
}
