package cards;

import java.util.EnumMap;
import java.util.Map.Entry;

public class TableHand extends Hand {

    private EnumMap<Suits, Hand> sevensTableHand = new EnumMap<>(Suits.class);

    public TableHand() {
        for (Suits suit : Suits.values()) {
            sevensTableHand.put(suit, new Hand());
        }
    }

    public void display(String text) {
        System.out.println("\n" + text);
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
