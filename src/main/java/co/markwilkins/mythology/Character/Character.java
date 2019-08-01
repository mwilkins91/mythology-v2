package co.markwilkins.mythology.Character;

import co.markwilkins.mythology.Location.Location;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="Characters")
public class Character {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name="home_location_id")
    @NotNull
    private Location home;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getHome() {
        return home;
    }

    public void setHome(Location home) {
        this.home = home;
    }
}