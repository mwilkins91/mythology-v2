package co.markwilkins.mythology.database;

import co.markwilkins.mythology.database.tables.Locations;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.TableImpl;

public class Model {
    private TableImpl table;

    public Model(TableImpl tbl) {
        this.table = tbl;
    }

    public Result<Record> findAll() {
        DSLContext create = DatabaseConnection.getSQLBuilder();
        return create.select().from(this.table).fetch();
    }

}
