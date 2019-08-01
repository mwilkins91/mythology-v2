package co.markwilkins.mythology.Location;

import javax.validation.constraints.NotNull;

public class LocationRequestBody {
    @NotNull
    private String name;

    public String getName() {
        return name;
    }
}
