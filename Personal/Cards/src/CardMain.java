import java.util.List;
import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        /* Play Sevens */
        Sevens sevens = new Sevens();
        sevens.shuffle();

        int numOfPlayers = getNumOfPlayers();
        List<Player> allPlayers = sevens.dealCards(numOfPlayers);

        sevens.play(allPlayers, numOfPlayers);

    }

    public static int getNumOfPlayers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter The Number of Players!");
        while (!in.hasNextInt()) {
            in.nextLine();
            System.out.println("Invalid Amount of Players! Try again!");
        }
        return in.nextInt();
    }
}
