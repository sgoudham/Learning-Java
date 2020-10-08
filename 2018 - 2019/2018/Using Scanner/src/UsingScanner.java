import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Simply printing out the name
        System.out.println("Please Enter Your Forename");
        String forename = in.next();
        System.out.println("Please Enter Your Surname");
        String surname = in.next();

        System.out.printf("%s %s%n", forename, surname);

        // Read price of the packs
        System.out.print("Please enter the price of a six-pack: ");
        double packPrice = in.nextDouble();
        // Read Can Volume
        System.out.print("Please enter the volume for each can (in ounces): ");
        double canVolume = in.nextDouble();

        // Calculating volume
        final double CANS_PER_PACK = 6;
        double packVolume = canVolume * CANS_PER_PACK;
        double pricePerOunce = packPrice / packVolume;

        System.out.printf("Price per ounce: %8.2f", pricePerOunce);
    }
}

