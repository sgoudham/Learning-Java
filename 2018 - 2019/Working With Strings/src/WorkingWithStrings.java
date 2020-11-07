import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String Info = "Bobby, M, wdjoiwqnoiqfcoiqjdwqjd";

        //split the array using "," as a delimiter
        String[] parts = Info.split(",");
        System.out.println("Using , as a delimiter " + "\n" + Arrays.toString(parts));

        //split the array using "w" as a delimiter
        parts = Info.split("w");
        System.out.println(Arrays.toString(parts));

        //Tokenize the string into words simply by using " "
        String Token = "Tokenize Commence";
        parts = Token.split(" ");
        System.out.println(Arrays.toString(parts));

        //Using a limit on the delimiter
        String Limit = "abdc:psdv:sdvosdv:dfpbkdd";
        parts = Limit.split(":", 2);
        System.out.println("Using : as a delimiter " + Arrays.toString(parts));

        //Split numbers
        String number = "abdc124psdv456sdvos456dv568dfpbk0dd";
        parts = number.split("[0-9]");
        System.out.println(Arrays.toString(parts));

        // Split the array using a whole number
        parts = number.split("[0-9]+");
        System.out.println(Arrays.toString(parts));

        //Create 3 Sub-strings
        String first = "Glasgow Clyde College";
        String Sub1 = first.substring(0, 7);
        String Sub2 = first.substring(8, 13);
        String Sub3 = first.substring(13, 21);

        System.out.println("\nFirst Sub-String is " + Sub1);
        System.out.println("Second Sub-String is " + Sub2);
        System.out.println("Third Sub-String is" + Sub3);

        // Working with characters of strings
        System.out.println("Please Enter Your Name: ");
        String name = in.nextLine();
        int n = name.length();
        char start = name.charAt(0);
        char last = name.charAt(n - 1);

        System.out.println("The First Letter Of The Name is " + start);
        System.out.println("The Last Letter Of The Name is " + last);

        // Generating userID from strings entered
        System.out.println("Please enter your first name: ");
        String firstName = in.next();
        System.out.println("Please enter your last name: ");
        String secondName = in.next();
        in.close();

        LocalDateTime nowIsTheTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        String s = nowIsTheTime.format(dtf);

        String firstInitial = firstName.substring(0, 1);
        String secondInitial = secondName.substring(0, 1);
        String userName = firstInitial + secondInitial + s;

        System.out.println("Your UserID Is : " + userName);
    }
}
