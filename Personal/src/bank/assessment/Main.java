package bank.assessment;

public class Main {
    public static void main(String[] args) {

        // Note:
        // For the first time in my life. This project will include no error handling for the
        // user inputs because the focus of the project is the design. Not going to handle any users that are "dumb" :)

        Person person = new Person();
        person.setBankAccount(new BankAccount());
        getPersonDetails(person);

        int choice;
        do
        {
            System.out.println("""
                    
                    Welcome Glasgow University Banking\s

                     Press 1: Register With Us
                     Press 2: Log In
                     Press 3: View Details
                     Press 4: Deposit Money
                     Press 5: Withdraw Money
                     Press 6: Log Out
                     Press 7: Delete Account
                     Press 8: Quit
                     """);
            choice = Integer.parseInt(Console.INPUT.nextLine());

            switch (choice) {
                case 1 -> person.getBankAccount().createAccount(person);
                case 2 -> person.getBankAccount().logIn();
                case 3 -> person.getBankAccount().viewDetails();
                case 4 -> person.getBankAccount().deposit();
                case 5 -> person.getBankAccount().withdraw();
                case 6 -> person.getBankAccount().logOut();
                case 7 -> person.getBankAccount().deleteAccount(person);
            }
        } while (choice != 8);

        System.out.println("Thank You For Using Glasgow University Banking! We Hope to See You Soon :D");
        System.exit(0);
    }

    private static void getPersonDetails(Person person) {
        System.out.println("What is Your Forename?");
        person.setForename(Console.INPUT.nextLine());

        System.out.println("What is Your Surname?");
        person.setSurname(Console.INPUT.nextLine());

        System.out.println("What is Your Email Address?");
        person.setEmailAddress(Console.INPUT.nextLine());

        System.out.println("What is Your Date of Birth? (Format: DD/MM/YYYY)");
        person.setDateOfBirth(Console.INPUT.nextLine());
    }
}
