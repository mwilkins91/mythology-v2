/*
 * This file is generated by jOOQ.
 */
package co.markwilkins.mythology.database;


import co.markwilkins.mythology.database.tables.CharacterRelationships;
import co.markwilkins.mythology.database.tables.Characters;
import co.markwilkins.mythology.database.tables.Items;
import co.markwilkins.mythology.database.tables.Locations;
import co.markwilkins.mythology.database.tables.Races;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in myth
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>myth.characters</code>.
     */
    public static final Characters CHARACTERS = co.markwilkins.mythology.database.tables.Characters.CHARACTERS;

    /**
     * The table <code>myth.character_relationships</code>.
     */
    public static final CharacterRelationships CHARACTER_RELATIONSHIPS = co.markwilkins.mythology.database.tables.CharacterRelationships.CHARACTER_RELATIONSHIPS;

    /**
     * The table <code>myth.items</code>.
     */
    public static final Items ITEMS = co.markwilkins.mythology.database.tables.Items.ITEMS;

    /**
     * The table <code>myth.locations</code>.
     */
    public static final Locations LOCATIONS = co.markwilkins.mythology.database.tables.Locations.LOCATIONS;

    /**
     * The table <code>myth.races</code>.
     */
    public static final Races RACES = co.markwilkins.mythology.database.tables.Races.RACES;
}
