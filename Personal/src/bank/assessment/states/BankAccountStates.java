package bank.assessment.states;

import bank.assessment.Person;

public interface BankAccountStates {

    void createAccount(Person person);
    void logIn();
    void logOut();
    void deposit();
    boolean withdraw();
    void viewDetails();
    void deleteAccount();

}
