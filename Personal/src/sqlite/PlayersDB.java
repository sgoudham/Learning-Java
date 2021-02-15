package sqlite;

import java.sql.*;

import static sqlite.SQLTransactions.*;

public class PlayersDB {

    private Connection connection;
    private final String currentDatabase = "players.db";

    public PlayersDB() throws SQLException {
        this.connect().createStatement().execute(CREATE_PLAYERS_TABLE);
        this.connect().createStatement().executeUpdate(POPULATE_PLAYERS_TABLE);
    }

    public void getAllPlayers() throws SQLException {
        ResultSet resultSet = connect().createStatement().executeQuery(GET_ALL_PLAYERS);

        while (resultSet.next()) {
            System.out.println(
                    "\nPlayer Name: " + resultSet.getString("battlenet")
                            + "\nLevel: " + resultSet.getString("level")
                            + "\nDamage SR: " + resultSet.getString("damageSR")
                            + "\nTank SR: " + resultSet.getString("tankSR")
                            + "\nSupport SR: " + resultSet.getString("supportSR")
            );
        }
    }

    public void insertPlayer(String battlenet, String damageSR, String tankSR, String supportSR, String level) throws SQLException {
        PreparedStatement preparedStatement = connect().prepareStatement(INSERT_PLAYER);

        preparedStatement.setString(1, battlenet);
        preparedStatement.setString(2, damageSR);
        preparedStatement.setString(3, tankSR);
        preparedStatement.setString(4, supportSR);
        preparedStatement.setString(5, level);

        preparedStatement.executeUpdate();

    }

    private Connection connect() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(BASE_JDBC_URL + currentDatabase);
        }
        return connection;
    }

}
