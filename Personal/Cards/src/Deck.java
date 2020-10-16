import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck {
    private List<Card> deck = new ArrayList<Card>();

    // Generate deck at the beginning of the game
    public Deck() {
        for (Suits suit : Suits.values()) {
            for (Faces face : Faces.values())
                deck.add(new Card(suit.getSuit(), face.getFace()));
        }
    }

    // Deal cards to players
    public List<Player> dealCards(int numOfPlayers) {
        int noOfCards = (deck.size() / numOfPlayers) + 1;
        List<Player> allPlayers = new ArrayList<Player>();

        for (int i = 0; i < numOfPlayers; i++) {
            Hand playerHand = new Hand();
            while (playerHand.getListOfCards().size() < noOfCards && deck.size() > 0) {
                Card indexCard = deck.get(0);
                playerHand.addCard(indexCard);
                dealACard(indexCard);
            }
            allPlayers.add(new Player("Player " + i, playerHand));
        }
        return allPlayers;
    }

    // Deal a card to the hand
    public void dealACard(Card card) {
        deck.remove(card);
    }

    // Shuffle the entire deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getDeck() {
        return deck;
    }
}
