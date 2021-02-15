package sqlite;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        PlayersDB playersDatabase = new PlayersDB();

        playersDatabase.getAllPlayers();
        playersDatabase.insertPlayer("Jizan#21290", "2450", "3350", "3400", "280");
        playersDatabase.getAllPlayers();

    }
}
