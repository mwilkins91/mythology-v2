package co.markwilkins.mythology.Location;

import co.markwilkins.mythology.database.Model;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.TableImpl;

import javax.persistence.Column;
import java.util.List;

import static co.markwilkins.mythology.database.Tables.LOCATIONS;

public class Location {
    private static Model model = new Model(LOCATIONS);


    @Column(name = "ID")
    public int id;

    @Column(name = "NAME")
    public String name;

    @Column(name = "DESCRIPTION")
    public String description;

    static public List<Location> findAll() {
        return Location.model.findAll().into(Location.class);
    }
}