package co.markwilkins.mythology.Character;

import javax.validation.constraints.NotNull;

public class CharacterRequestBody {
    @NotNull
    private String name;

    public String getName() {
        return name;
    }
}
