import java.util.EnumMap;
import java.util.Map.Entry;

public class TableHand extends Hand {

    private EnumMap<Suits, Hand> sevensTableHand = new EnumMap<Suits, Hand>(Suits.class);

    public TableHand() {
        for (Suits suit : Suits.values()) {
            sevensTableHand.put(suit, new Hand());
        }
    }

    public void display() {
        System.out.println("Current Deck: ");
        for (Entry<Suits, Hand> hand : sevensTableHand.entrySet()) {
            System.out.println(hand.getKey() + ": " + hand.getValue().toString());
        }
    }

    public EnumMap<Suits, Hand> getSevensTableHand() {
        return sevensTableHand;
    }

    public void setSevensTableHand(EnumMap<Suits, Hand> sevensTableHand) {
        this.sevensTableHand = sevensTableHand;
    }
}
