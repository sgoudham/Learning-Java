package bank.assessment.states;

import bank.assessment.*;

import java.util.Random;

public class NotCreatedState implements BankAccountStates {

    BankAccount bankAccount;
    private final Random random = new Random();
    private static NotCreatedState instance;

    private NotCreatedState(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static NotCreatedState getInstance(BankAccount bankAccount) {
        return instance == null ? instance = new NotCreatedState(bankAccount) : instance;
    }

    @Override
    public void createAccount(Person person) {
        System.out.println("Please Enter in a Suitable Username: ");
        String username = Console.INPUT.nextLine();

        System.out.println("Please Enter in a Suitable Password: ");
        String password = Console.INPUT.nextLine();

        String accountNumber = String.valueOf(generateRandomNum(random, 100000, 999999));
        String sortCode = generateRandomNum(random, 10, 99) + "-" + generateRandomNum(random, 10,99) + "-"  + generateRandomNum(random, 10,99);

        System.out.println("Would You Like A Premium Account? (Format Y/N)");
        String choice = Console.INPUT.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("What Would You Like Your Overdraft Limit To Be?");
            String overdraftLimit = Console.INPUT.nextLine();

            bankAccount = new PremiumAccount(username, password, accountNumber, sortCode, Double.parseDouble(overdraftLimit));

        } else if (choice.equalsIgnoreCase("n")) {
            bankAccount = new BasicAccount(username, password, accountNumber, sortCode);
        }

        System.out.println("Bank Account Successfully Created!");
        System.out.println("Your Details Are: " + bankAccount);

        bankAccount.changeBankAccountState(LoggedOutState.getInstance(bankAccount));
        person.setBankAccount(bankAccount);
    }

    @Override
    public void logIn() { System.out.println("Sorry, Our Systems Couldn't Find Your Details. Please Try Again or Register!"); }

    @Override
    public void logOut() {
        System.out.println("You Must Be Logged In Before You Can Log Out!");
    }

    @Override
    public void deposit() {
        System.out.println("Sorry, Please Log In First Before Trying Deposit Cash!");
    }

    @Override
    public boolean withdraw() {
        System.out.println("Sorry, Please Log In First Before Trying Withdraw Funds!");
        return false;
    }

    @Override
    public void viewDetails() { System.out.println("There Are No Account Details To View, Please Log In or Register!"); }

    @Override
    public void deleteAccount() {
        System.out.println("No Account Found To Delete, Please Log In!");
    }

    private int generateRandomNum(Random random, int lower, int upper) {
        return lower + random.nextInt(upper) + 1;
    }
}
