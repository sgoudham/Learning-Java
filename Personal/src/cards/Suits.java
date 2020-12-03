package cards;

public enum Suits {
    SPADES("Spades"), HEARTS("Hearts"), DIAMONDS("Diamonds"), CLUBS("Clubs");

    private String suit;

    Suits(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
