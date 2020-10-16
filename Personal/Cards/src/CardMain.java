import java.util.List;

public class CardMain {
    public static void main(String[] args) {
        /* Play Sevens */
        Sevens sevens = new Sevens();
        sevens.shuffle();
        List<Player> allPlayers = sevens.dealCards(4);
        sevens.play(allPlayers, 4);

    }
}
