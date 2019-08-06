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

    public Result<Record> findAllPaged(int page, int limit) {
        DSLContext create = DatabaseConnection.getSQLBuilder();
        if (page < 0) {
            page = 0;
        }
        return create
                .select()
                .from(this.table)
                .offset(page * limit)
                .limit(limit)
                .fetch();
    }

    public int count() {
         DSLContext create = DatabaseConnection.getSQLBuilder();
         return create
                    .selectCount()
                    .from(this.table)
                    .fetchOne(0, int.class);
    }
}
