package bank.assessment.states;

import bank.assessment.Person;

public interface BankAccountStates {

    void createAccount(Person person);
    void logIn();
    void logOut();
    void deposit();
    void withdraw();
    void viewDetails();
    void deleteAccount(Person person);

}
