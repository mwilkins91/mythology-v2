package co.markwilkins.mythology.database;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {


    private static String userName = "root";
    private static String password = "password123";
    private static String url = "jdbc:mysql://localhost:3306/myth";
    private static Connection connectionInstance = null;

    private static Connection createConnection() {
        try {
            return DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getInstance() {
        if (connectionInstance == null) {
            connectionInstance = createConnection();
        }
        return connectionInstance;
    }

    public static DSLContext getSQLBuilder() {
        Connection connection = getInstance();
        DSLContext create = DSL.using(connection, SQLDialect.MYSQL);
        return create;
    }

}
