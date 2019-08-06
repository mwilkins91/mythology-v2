package co.markwilkins.mythology.Location;

import co.markwilkins.mythology.database.Model;

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

    static public List<Location> findAllPaged(int page, int limit) {
        return Location.model
                .findAllPaged(page, limit)
                .into(Location.class);
    }

    static int count() {
        return Location.model.count();
    }
}