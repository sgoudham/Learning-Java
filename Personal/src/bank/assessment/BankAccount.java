package bank.assessment;

import bank.assessment.states.BankAccountStates;
import bank.assessment.states.NotCreatedState;

public abstract class BankAccount {

    private String username, password, accountNumber, sortCode;
    private double balance;
    private double overdraftLimit;

    BankAccountStates bankAccountState;

    BankAccount() { this.bankAccountState = NotCreatedState.getInstance(this); }

    BankAccount(String username, String password, String accountNumber, String sortCode) {
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.bankAccountState = NotCreatedState.getInstance(this);
    }

    public BankAccount(String username, String password, String accountNumber, String sortCode, double overdraftLimit) {
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.overdraftLimit = overdraftLimit;
        this.bankAccountState = NotCreatedState.getInstance(this);
    }

    // Method Actions To Change State
    public void changeBankAccountState(BankAccountStates bankAccountState) { this.bankAccountState = bankAccountState; }

    public void createAccount(Person person) { this.bankAccountState.createAccount(person); }

    public void logIn() { this.bankAccountState.logIn(); }

    public void logOut() {
        this.bankAccountState.logOut();
    }

    public void deposit() { this.bankAccountState.deposit(); }

    public boolean withdraw() { return this.bankAccountState.withdraw(); }

    public void viewDetails() {
        this.bankAccountState.viewDetails();
    }

    public void deleteAccount() { this.bankAccountState.deleteAccount(); }

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

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
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
