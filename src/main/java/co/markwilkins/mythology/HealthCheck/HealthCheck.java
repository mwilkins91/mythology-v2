package co.markwilkins.mythology.HealthCheck;

public class HealthCheck {

    private final String status;

    public HealthCheck() {
        this.status = "OK";
    }


    public String getStatus() {
        return status;
    }
}