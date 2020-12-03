package cards;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> listOfCards = new ArrayList<Card>();

    public Hand() {
    }

    @Override
    public String toString() {
        StringBuilder handOfSuit = new StringBuilder();

        handOfSuit.append("[");
        for (Card card : listOfCards) {
            handOfSuit.append(card.getFace()).append(",");
        }
        if (handOfSuit.length() != 1)
            handOfSuit.deleteCharAt(handOfSuit.length() - 1);
        handOfSuit.append("]");

        return handOfSuit.toString();

    }

    public Card sevensCheckCardExists(int userCardFace, String userCardSuit) {
        for (Card card : listOfCards) {
            if (card.getFace() == userCardFace && card.getSuit().equals(userCardSuit))
                return card;
        }
        return null;
    }

    public Hand(List<Card> listOfCards) {
        this.listOfCards = listOfCards;
    }

    public void addCard(Card card) {
        listOfCards.add(card);
    }

    public void addCard(int index, Card card) {
        listOfCards.add(index, card);
    }

    public void removeCard(int index) {
        listOfCards.remove(index);
    }

    public void removeCard(Card card) {
        listOfCards.remove(card);
    }

    public List<Card> getListOfCards() {
        return listOfCards;
    }

    public void setListOfCards(List<Card> listOfCards) {
        this.listOfCards = listOfCards;
    }
}
