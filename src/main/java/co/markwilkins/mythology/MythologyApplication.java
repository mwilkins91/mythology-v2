package co.markwilkins.mythology;

import co.markwilkins.mythology.Location.Location;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import static co.markwilkins.mythology.database.Tables.*;
import static org.jooq.impl.DSL.*;

import java.sql.*;
import java.util.List;

@SpringBootApplication
public class MythologyApplication {

	public static void main(String[] args) {

		SpringApplication.run(MythologyApplication.class, args);

	}

}
