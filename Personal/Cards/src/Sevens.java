import java.util.List;
import java.util.Scanner;

public class Sevens extends Deck {

    public Sevens() {
    }

    public void play(List<Player> allPlayers, int numOfPlayers) {
        int playerCounter = 0;
        boolean winner = false;
        Scanner in = new Scanner(System.in);
        TableHand tableHand = new TableHand();

        while (!winner) {
            Player player = allPlayers.get(playerCounter);

            tableHand.display();
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

        Player winningPlayer = allPlayers.get(playerCounter);
        System.out.println("Player " + (playerCounter + 1) + " Is The Winner!");
        System.out.println("Winning Deck: ");
        winningPlayer.displayHand();
    }

    public String[] askPlayer(int playerCounter, Player player, TableHand tableHand, Scanner in) {
        System.out.println("\nEnter In The Card That You Want To Play: \nPress S To Skip");
        String userCard = in.nextLine();
        if (userCard.toLowerCase().charAt(0) == 's') {
            return new String[0];
        }

        String[] splitCard = userCard.split(" ");
        if (splitCard.length != 2)
            return new String[0];
        return splitCard;

    }

    public void validateCard(String[] splitCard, Player player, TableHand tableHand) {

        int userCardFace = Integer.parseInt(splitCard[0]);
        String userCardSuit = splitCard[1].toUpperCase();
        Suits userSuitInTableHand = Suits.valueOf(userCardSuit.toUpperCase());

        Hand userHand = player.getHand();
        Card cardToBePlayed = userHand.sevensCheckCardExists(userCardFace, userCardSuit);
        if (cardToBePlayed == null) {
            System.out.println("Your Card Doesn't Exist Within Your Hand! Try again!");
            return;
        }

        Hand userSuitHand = tableHand.getSevensTableHand().get(userSuitInTableHand);
        canBePlayed(cardToBePlayed, userSuitHand, userSuitInTableHand, tableHand, player);
    }

    public void canBePlayed(Card cardToBePlayed, Hand userSuitHand, Suits userSuitInTableHand, TableHand tableHand,
            Player player) {

        if (userSuitHand.getListOfCards().size() == 0) {
            if (cardToBePlayed.getFace() == 7) {
                playACard(userSuitHand, cardToBePlayed, 0, tableHand, userSuitInTableHand, player);
            } else {
                System.out.println("Card Played Was Not A Face of 7 in Empty Suit! Try again!");
                return;
            }
        } else {
            int minimumValueInUserSuitHand = userSuitHand.getListOfCards().get(0).getFace();
            int sizeOfUserSuitHand = userSuitHand.getListOfCards().size();
            int maximumValueInUserSuitHand = userSuitHand.getListOfCards().get(sizeOfUserSuitHand - 1).getFace();

            if (cardToBePlayed.getFace() == (minimumValueInUserSuitHand - 1)) {
                playACard(userSuitHand, cardToBePlayed, 0, tableHand, userSuitInTableHand, player);
            } else if (cardToBePlayed.getFace() == (maximumValueInUserSuitHand + 1)) {
                playACard(userSuitHand, cardToBePlayed, sizeOfUserSuitHand, tableHand, userSuitInTableHand, player);
            }
        }

    }

    public void playACard(Hand userSuitHand, Card playingCard, int indexToInsertCard, TableHand tableHand,
            Suits userSuitInTableHand, Player player) {

        userSuitHand.addCard(indexToInsertCard, playingCard);

        player.getHand().removeCard(playingCard);
    }
}
