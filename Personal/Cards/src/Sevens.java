import java.util.List;
import java.util.Scanner;

public class Sevens extends Deck {

    public Sevens() {
        super();
    }

    public void play(List<Player> allPlayers, int numOfPlayers) {
        int playerCounter = 0;
        boolean winner = false;
        Scanner in = new Scanner(System.in);
        TableHand tableHand = new TableHand();

        while (!winner) {
            Player player = allPlayers.get(playerCounter);

            tableHand.display("Current Deck:");
            System.out.println("\nPlayer " + (playerCounter + 1) + "'s Deck:\n");
            player.displayHand();

            String[] userCardSplit = askPlayer(playerCounter, player, tableHand, in);
            if (userCardSplit.length != 0) {
                validateCard(userCardSplit, player, tableHand);

                if (player.getHand().getListOfCards().isEmpty())
                    winner = true;
            }
            playerCounter = (playerCounter + 1) % numOfPlayers;
        }

        System.out.println("\nPlayer " + (playerCounter) + " Is The Winner!");
        tableHand.display("Winning Deck:");
    }

    public String[] askPlayer(int playerCounter, Player player, TableHand tableHand, Scanner in) {
        System.out.println("\nEnter In The Card That You Want To Play: \nPress S To Skip");
        String userCard = in.nextLine();
        if (userCard.toLowerCase().charAt(0) == 's') {
            System.out.println("Player has skipped their turn!");
            return new String[0];
        }

        String[] splitCard = userCard.split(" ");
        if (splitCard.length == 2)
            validatePlayerInput(splitCard, player, tableHand, in);

        return splitCard;

    }

    public void validatePlayerInput(String[] splitCard, Player player, TableHand tableHand, Scanner in) {

        // Check if the first element is of type integer
        try {
            Integer.parseInt(splitCard[0]);
        } catch (NumberFormatException e) {
            System.out.println("Card Face Value Not Valid! Please Enter A Suitable Face");
            while (!in.hasNextInt()) {
                in.nextLine();
                System.out.println("Card Face Value Not Valid! Please Enter A Suitable Face");
            }
            splitCard[0] = Integer.toString(in.nextInt());
        }

        boolean validSuit = false;
        while (!validSuit) {
            for (Suits suits : Suits.values()) {
                if (suits.getSuit().equalsIgnoreCase(splitCard[1])) {
                    validSuit = true;
                    break;
                }
            }
            if (validSuit == false) {
                System.out.println("Card Suit Not Valid! Please Enter A Suitable Suit");
                splitCard[1] = in.nextLine();
            }
        }
    }

    public void validateCard(String[] splitCard, Player player, TableHand tableHand) {

        int userCardFace = Integer.parseInt(splitCard[0]);
        String userCardSuit = splitCard[1].toUpperCase();
        Suits userSuitInTableHand = Suits.valueOf(userCardSuit.toUpperCase());

        Hand userHand = player.getHand();
        Card cardToBePlayed = userHand.sevensCheckCardExists(userCardFace, userCardSuit);
        if (cardToBePlayed == null) {
            System.out.println("Your Card Doesn't Exist Within Your Hand! Turn Skipped!");
            return;
        }

        Hand userSuitHand = tableHand.getSevensTableHand().get(userSuitInTableHand);
        canBePlayed(cardToBePlayed, userSuitHand, player);
    }

    public void canBePlayed(Card cardToBePlayed, Hand userSuitHand, Player player) {

        if (userSuitHand.getListOfCards().size() == 0) {
            if (cardToBePlayed.getFace() == 7) {
                playACard(userSuitHand, cardToBePlayed, 0, player);
            } else {
                System.out.println("Card Played Was Not A Face of 7 in Empty Suit! Turn Skipped!");
                return;
            }
        } else {
            int minimumValueInUserSuitHand = userSuitHand.getListOfCards().get(0).getFace();
            int sizeOfUserSuitHand = userSuitHand.getListOfCards().size();
            int maximumValueInUserSuitHand = userSuitHand.getListOfCards().get(sizeOfUserSuitHand - 1).getFace();

            if (cardToBePlayed.getFace() == (minimumValueInUserSuitHand - 1)) {
                playACard(userSuitHand, cardToBePlayed, 0, player);
            } else if (cardToBePlayed.getFace() == (maximumValueInUserSuitHand + 1)) {
                playACard(userSuitHand, cardToBePlayed, sizeOfUserSuitHand, player);
            } else {
                System.out.println("Card Plyaed Was Not +1 or +1 Of Any Cards In The Suit! Turn Skipped!");
                return;
            }
        }
    }

    public void playACard(Hand userSuitHand, Card playingCard, int indexToInsertCard, Player player) {

        userSuitHand.addCard(indexToInsertCard, playingCard);
        player.getHand().removeCard(playingCard);
    }
}
