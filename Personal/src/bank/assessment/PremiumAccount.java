package bank.assessment;

public class PremiumAccount extends BasicAccount {

    public PremiumAccount(String username, String password, String accountNumber, String sortCode, double overdraftLimit) {
        super(username, password, accountNumber, sortCode, overdraftLimit);
    }

    @Override
    public boolean withdraw() {
        System.out.println("How Much Money Do You Want To Withdraw?");
        double amount = Double.parseDouble(Console.INPUT.nextLine());

        if (amount <= (getBalance() + getOverdraftLimit())) {
            setBalance(getBalance() - amount);

            System.out.println("Withdraw Successful!");
            displayBalance();

            return true;
        } else {
            System.out.println("Insufficient Funds Available to Withdraw! Try Again!");
            return false;
        }
    }
}
