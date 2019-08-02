package co.markwilkins.mythology;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import static co.markwilkins.mythology.database.Tables.*;
import static org.jooq.impl.DSL.*;

import java.sql.*;

@SpringBootApplication
public class MythologyApplication {

	public static void main(String[] args) {

		SpringApplication.run(MythologyApplication.class, args);

		String userName = "root";
		String password = "password123";
		String url = "jdbc:mysql://localhost:3306/myth";

		// Connection is the only JDBC resource that we need
		// PreparedStatement and ResultSet are handled by jOOQ, internally
		try (Connection conn = DriverManager.getConnection(url, userName, password)) {
			// ...
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(LOCATIONS).fetch();
			for (Record r : result) {
				Integer id = r.getValue(LOCATIONS.ID);
				String firstName = r.getValue(LOCATIONS.NAME);
				String lastName = r.getValue(LOCATIONS.DESCRIPTION);

				System.out.println("ID: " + id + " name: " + firstName + " description: " + lastName);
			}
		}

		// For the sake of this tutorial, let's keep exception handling simple
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
