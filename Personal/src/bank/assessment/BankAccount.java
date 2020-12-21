package bank.assessment;

import bank.assessment.states.BankAccountStates;
import bank.assessment.states.LoggedOutState;
import bank.assessment.states.NotCreatedState;

public class BankAccount {

    private String username, password;
    private String accountNumber;
    private String sortCode;
    private double balance;
    private double overdraftLimit;
    private boolean isPremium;

    BankAccountStates bankAccountState;

    public BankAccount() { this.bankAccountState = NotCreatedState.getInstance(this); }

    public BankAccount(String username, String password, String sortCode, String accountNumber, boolean isPremium) {
        this.username = username;
        this.password = password;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.isPremium = isPremium;
        this.bankAccountState = LoggedOutState.getInstance(this);
    }

    public BankAccount(String username, String password, String sortCode, String accountNumber, boolean isPremium, double overdraftLimit) {
        this.username = username;
        this.password = password;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.isPremium = isPremium;
        this.overdraftLimit = overdraftLimit;
        this.bankAccountState = LoggedOutState.getInstance(this);
    }

    // Method Actions To Change State
    public void changeBankAccountState(BankAccountStates bankAccountState) { this.bankAccountState = bankAccountState; }

    public void createAccount(Person person) { this.bankAccountState.createAccount(person); }

    public void logIn() { this.bankAccountState.logIn(); }

    public void logOut() { this.bankAccountState.logOut(); }

    public void deposit() { this.bankAccountState.deposit(); }

    public void withdraw() { this.bankAccountState.withdraw(); }

    public void viewDetails() { this.bankAccountState.viewDetails(); }

    public void deleteAccount(Person person) { this.bankAccountState.deleteAccount(person); }

    // Getters & Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() { return sortCode; }

    public double getBalance() {
        return balance;
    }

    public boolean isPremium() { return isPremium; }

    public void setPremium(boolean premium) { isPremium = premium; }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void displayBalance() {
        System.out.println("Current Account Balance: " + String.format("£%.2f", balance));
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", sortCode='" + sortCode + '\'' +
                ", balance=" + String.format("£%.2f", balance) +
                ", overdraftLimit=" + String.format("£%.2f", overdraftLimit) +
                '}';
    }
}
