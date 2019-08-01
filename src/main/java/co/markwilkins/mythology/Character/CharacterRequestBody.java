package co.markwilkins.mythology.Character;

import javax.validation.constraints.NotNull;

public class CharacterRequestBody {
    @NotNull
    private String name;
    private int homeLocation;

    public String getName() {
        return name;
    }

    public int getHomeLocation() {
        return homeLocation;
    }
}
