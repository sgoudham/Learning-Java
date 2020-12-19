package bank.assessment;

public class BasicAccount extends BankAccount {

    public BasicAccount() { }

    public BasicAccount(String username, String password, String accountNumber, String sortCode) {
        super(username, password, accountNumber, sortCode);
    }

    public BasicAccount(String username, String password, String accountNumber, String sortCode, double overdraftLimit) {
        super(username, password, accountNumber, sortCode, overdraftLimit);
    }
}
