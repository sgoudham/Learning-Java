package sqlite;

public class SQLTransactions {

    static final String BASE_JDBC_URL = "jdbc:sqlite:./Personal/src/sqlite/database/";

    static final String CREATE_PLAYERS_TABLE = """
                                                CREATE TABLE IF NOT EXISTS players 
                                                (
                                                    battlenet text PRIMARY KEY,
                                                    damageSR text NOT NULL,
                                                    tankSR text NOT NULL,
                                                    supportSR text NOT NULL,
                                                    level text NOT NULL
                                                );
                                                """;

    static final String POPULATE_PLAYERS_TABLE = """
                                   BEGIN TRANSACTION;
                                   INSERT INTO players VALUES ('Hammy#21436', '3000', '2650', '3520', '400') ON CONFLICT DO NOTHING;
                                   INSERT INTO players VALUES ('Mootbox#2537', '3050', '3500', '4000', '500') ON CONFLICT DO NOTHING;
                                   INSERT INTO players VALUES ('Carlos#24356', '2250', '1800', '1940', '98') ON CONFLICT DO NOTHING;
                                   INSERT INTO players VALUES ('SmolMio#2844', '3499', '2679', '3000', '428') ON CONFLICT DO NOTHING;
                                   INSERT INTO players VALUES ('Jizan#21290', '2450', '3350', '3400', '280') ON CONFLICT DO NOTHING;
                                   COMMIT;
                                   """;

    static final String GET_ALL_PLAYERS = "SELECT * FROM players;";

    static final String INSERT_PLAYER = "INSERT INTO players VALUES(?, ?, ?, ?, ?) ON CONFLICT DO NOTHING;";
}
