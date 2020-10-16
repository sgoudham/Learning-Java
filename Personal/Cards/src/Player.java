public class Player {
    private Hand hand;

    public Player(String name, Hand hand) {
        this.hand = hand;
    }

    public void displayHand() {

        String tab = "\t";
        for (int i = 0; i < hand.getListOfCards().size(); i++) {
            Card card = hand.getListOfCards().get(i);

            if (i % 2 == 0) {
                System.out.printf(tab + card.getFace() + " of " + card.getSuit());
            } else {
                System.out.println(tab + card.getFace() + " of " + card.getSuit());
            }
        }
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
