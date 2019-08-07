/*
 * This file is generated by jOOQ.
 */
package co.markwilkins.mythology.database;


import co.markwilkins.mythology.database.tables.Categories;
import co.markwilkins.mythology.database.tables.CharacterRelationships;
import co.markwilkins.mythology.database.tables.Characters;
import co.markwilkins.mythology.database.tables.Items;
import co.markwilkins.mythology.database.tables.Locations;
import co.markwilkins.mythology.database.tables.Races;
import co.markwilkins.mythology.database.tables.records.CategoriesRecord;
import co.markwilkins.mythology.database.tables.records.CharacterRelationshipsRecord;
import co.markwilkins.mythology.database.tables.records.CharactersRecord;
import co.markwilkins.mythology.database.tables.records.ItemsRecord;
import co.markwilkins.mythology.database.tables.records.LocationsRecord;
import co.markwilkins.mythology.database.tables.records.RacesRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>myth</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CategoriesRecord> KEY_CATEGORIES_PRIMARY = UniqueKeys0.KEY_CATEGORIES_PRIMARY;
    public static final UniqueKey<CharactersRecord> KEY_CHARACTERS_PRIMARY = UniqueKeys0.KEY_CHARACTERS_PRIMARY;
    public static final UniqueKey<ItemsRecord> KEY_ITEMS_PRIMARY = UniqueKeys0.KEY_ITEMS_PRIMARY;
    public static final UniqueKey<LocationsRecord> KEY_LOCATIONS_PRIMARY = UniqueKeys0.KEY_LOCATIONS_PRIMARY;
    public static final UniqueKey<RacesRecord> KEY_RACES_PRIMARY = UniqueKeys0.KEY_RACES_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CharactersRecord, RacesRecord> CHARACTERS_IBFK_1 = ForeignKeys0.CHARACTERS_IBFK_1;
    public static final ForeignKey<CharactersRecord, LocationsRecord> CHARACTERS_IBFK_2 = ForeignKeys0.CHARACTERS_IBFK_2;
    public static final ForeignKey<CharacterRelationshipsRecord, CharactersRecord> CHARACTER_RELATIONSHIPS_IBFK_1 = ForeignKeys0.CHARACTER_RELATIONSHIPS_IBFK_1;
    public static final ForeignKey<CharacterRelationshipsRecord, CharactersRecord> CHARACTER_RELATIONSHIPS_IBFK_2 = ForeignKeys0.CHARACTER_RELATIONSHIPS_IBFK_2;
    public static final ForeignKey<ItemsRecord, CharactersRecord> ITEMS_IBFK_1 = ForeignKeys0.ITEMS_IBFK_1;
    public static final ForeignKey<ItemsRecord, CharactersRecord> ITEMS_IBFK_2 = ForeignKeys0.ITEMS_IBFK_2;
    public static final ForeignKey<LocationsRecord, CategoriesRecord> LOCATIONS_IBFK_1 = ForeignKeys0.LOCATIONS_IBFK_1;
    public static final ForeignKey<RacesRecord, LocationsRecord> RACES_IBFK_1 = ForeignKeys0.RACES_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<CategoriesRecord> KEY_CATEGORIES_PRIMARY = Internal.createUniqueKey(Categories.CATEGORIES, "KEY_categories_PRIMARY", Categories.CATEGORIES.ID);
        public static final UniqueKey<CharactersRecord> KEY_CHARACTERS_PRIMARY = Internal.createUniqueKey(Characters.CHARACTERS, "KEY_characters_PRIMARY", Characters.CHARACTERS.ID);
        public static final UniqueKey<ItemsRecord> KEY_ITEMS_PRIMARY = Internal.createUniqueKey(Items.ITEMS, "KEY_items_PRIMARY", Items.ITEMS.ID);
        public static final UniqueKey<LocationsRecord> KEY_LOCATIONS_PRIMARY = Internal.createUniqueKey(Locations.LOCATIONS, "KEY_locations_PRIMARY", Locations.LOCATIONS.ID);
        public static final UniqueKey<RacesRecord> KEY_RACES_PRIMARY = Internal.createUniqueKey(Races.RACES, "KEY_races_PRIMARY", Races.RACES.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CharactersRecord, RacesRecord> CHARACTERS_IBFK_1 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_RACES_PRIMARY, Characters.CHARACTERS, "characters_ibfk_1", Characters.CHARACTERS.RACE_ID);
        public static final ForeignKey<CharactersRecord, LocationsRecord> CHARACTERS_IBFK_2 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_LOCATIONS_PRIMARY, Characters.CHARACTERS, "characters_ibfk_2", Characters.CHARACTERS.HOME_LOCATION_ID);
        public static final ForeignKey<CharacterRelationshipsRecord, CharactersRecord> CHARACTER_RELATIONSHIPS_IBFK_1 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_CHARACTERS_PRIMARY, CharacterRelationships.CHARACTER_RELATIONSHIPS, "character_relationships_ibfk_1", CharacterRelationships.CHARACTER_RELATIONSHIPS.CHARACTER_ID);
        public static final ForeignKey<CharacterRelationshipsRecord, CharactersRecord> CHARACTER_RELATIONSHIPS_IBFK_2 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_CHARACTERS_PRIMARY, CharacterRelationships.CHARACTER_RELATIONSHIPS, "character_relationships_ibfk_2", CharacterRelationships.CHARACTER_RELATIONSHIPS.RELATED_CHARACTER_ID);
        public static final ForeignKey<ItemsRecord, CharactersRecord> ITEMS_IBFK_1 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_CHARACTERS_PRIMARY, Items.ITEMS, "items_ibfk_1", Items.ITEMS.OWNER_ID);
        public static final ForeignKey<ItemsRecord, CharactersRecord> ITEMS_IBFK_2 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_CHARACTERS_PRIMARY, Items.ITEMS, "items_ibfk_2", Items.ITEMS.CREATOR_ID);
        public static final ForeignKey<LocationsRecord, CategoriesRecord> LOCATIONS_IBFK_1 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_CATEGORIES_PRIMARY, Locations.LOCATIONS, "locations_ibfk_1", Locations.LOCATIONS.CATEGORY);
        public static final ForeignKey<RacesRecord, LocationsRecord> RACES_IBFK_1 = Internal.createForeignKey(co.markwilkins.mythology.database.Keys.KEY_LOCATIONS_PRIMARY, Races.RACES, "races_ibfk_1", Races.RACES.ORIGIN_LOCATION_ID);
    }
}
