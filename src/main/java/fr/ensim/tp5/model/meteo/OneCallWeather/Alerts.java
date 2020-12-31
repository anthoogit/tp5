package fr.ensim.tp5.model.meteo.OneCallWeather;

public class Alerts {
    private String sender_name;
    private String event;
    private float start;
    private float end;
    private String description;


    // Getter Methods

    public String getSender_name() {
        return sender_name;
    }

    public String getEvent() {
        return event;
    }

    public float getStart() {
        return start;
    }

    public float getEnd() {
        return end;
    }

    public String getDescription() {
        return description;
    }

    // Setter Methods

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setStart(float start) {
        this.start = start;
    }

    public void setEnd(float end) {
        this.end = end;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}