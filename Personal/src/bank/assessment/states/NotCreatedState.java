package bank.assessment.states;

import bank.assessment.BankAccount;
import bank.assessment.Console;
import bank.assessment.Person;

import java.util.Random;

public class NotCreatedState implements BankAccountStates {

    private static BankAccount bankAccount;
    private static NotCreatedState instance;
    private final Random random = new Random();

    private NotCreatedState(BankAccount bankAccount) { NotCreatedState.bankAccount = bankAccount; }

    public static NotCreatedState getInstance(BankAccount ba) {
        return instance == null || bankAccount != ba ? instance = new NotCreatedState(ba) : instance;
    }

    @Override
    public void createAccount(Person person) {
        System.out.println("Please Enter in a Suitable Username: ");
        String username = Console.INPUT.nextLine();

        System.out.println("Please Enter in a Suitable Password: ");
        String password = Console.INPUT.nextLine();

        System.out.println("Would You Like A Premium Account? (Format Y/N)");
        String choice = Console.INPUT.nextLine();

        String sortCode = generateRandomNum(random, 10, 99) + "-" + generateRandomNum(random, 10,99) + "-"  + generateRandomNum(random, 10,99);
        String accountNumber = String.valueOf(generateRandomNum(random, 100000, 999999));

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("What Would You Like Your Overdraft Limit To Be?");
            double overdraftLimit = Double.parseDouble(Console.INPUT.nextLine());
            bankAccount = new BankAccount(username, password, sortCode, accountNumber, true, overdraftLimit);

        } else if (choice.equalsIgnoreCase("n")) {
            bankAccount = new BankAccount(username, password, sortCode, accountNumber, false);
        }

        System.out.println("Bank Account Successfully Created!");
        System.out.println("Your Details Are: " + bankAccount);

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
    public void withdraw() { System.out.println("Sorry, Please Log In First Before Trying Withdraw Funds!"); }

    @Override
    public void viewDetails() { System.out.println("There Are No Account Details To View, Please Log In or Register!"); }

    @Override
    public void deleteAccount(Person person) { System.out.println("No Account Found To Delete"); }

    private int generateRandomNum(Random random, int lower, int upper) {
        return lower + random.nextInt(upper) + 1;
    }
}
