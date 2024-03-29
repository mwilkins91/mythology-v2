/*
 * This file is generated by jOOQ.
 */
package co.markwilkins.mythology.database.tables;


import co.markwilkins.mythology.database.Indexes;
import co.markwilkins.mythology.database.Keys;
import co.markwilkins.mythology.database.Myth;
import co.markwilkins.mythology.database.tables.records.CharacterRelationshipsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterRelationships extends TableImpl<CharacterRelationshipsRecord> {

    private static final long serialVersionUID = -181400827;

    /**
     * The reference instance of <code>myth.character_relationships</code>
     */
    public static final CharacterRelationships CHARACTER_RELATIONSHIPS = new CharacterRelationships();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CharacterRelationshipsRecord> getRecordType() {
        return CharacterRelationshipsRecord.class;
    }

    /**
     * The column <code>myth.character_relationships.relationship</code>.
     */
    public final TableField<CharacterRelationshipsRecord, String> RELATIONSHIP = createField("relationship", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>myth.character_relationships.character_id</code>.
     */
    public final TableField<CharacterRelationshipsRecord, Integer> CHARACTER_ID = createField("character_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>myth.character_relationships.related_character_id</code>.
     */
    public final TableField<CharacterRelationshipsRecord, Integer> RELATED_CHARACTER_ID = createField("related_character_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>myth.character_relationships</code> table reference
     */
    public CharacterRelationships() {
        this(DSL.name("character_relationships"), null);
    }

    /**
     * Create an aliased <code>myth.character_relationships</code> table reference
     */
    public CharacterRelationships(String alias) {
        this(DSL.name(alias), CHARACTER_RELATIONSHIPS);
    }

    /**
     * Create an aliased <code>myth.character_relationships</code> table reference
     */
    public CharacterRelationships(Name alias) {
        this(alias, CHARACTER_RELATIONSHIPS);
    }

    private CharacterRelationships(Name alias, Table<CharacterRelationshipsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CharacterRelationships(Name alias, Table<CharacterRelationshipsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CharacterRelationships(Table<O> child, ForeignKey<O, CharacterRelationshipsRecord> key) {
        super(child, key, CHARACTER_RELATIONSHIPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Myth.MYTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CHARACTER_RELATIONSHIPS_CHARACTER_ID, Indexes.CHARACTER_RELATIONSHIPS_RELATED_CHARACTER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CharacterRelationshipsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CharacterRelationshipsRecord, ?>>asList(Keys.CHARACTER_RELATIONSHIPS_IBFK_1, Keys.CHARACTER_RELATIONSHIPS_IBFK_2);
    }

    public Characters characterRelationshipsIbfk_1() {
        return new Characters(this, Keys.CHARACTER_RELATIONSHIPS_IBFK_1);
    }

    public Characters characterRelationshipsIbfk_2() {
        return new Characters(this, Keys.CHARACTER_RELATIONSHIPS_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterRelationships as(String alias) {
        return new CharacterRelationships(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterRelationships as(Name alias) {
        return new CharacterRelationships(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterRelationships rename(String name) {
        return new CharacterRelationships(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterRelationships rename(Name name) {
        return new CharacterRelationships(name, null);
    }
}
