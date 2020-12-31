package fr.ensim.tp5.model.meteo.OneCallWeather;

import java.util.ArrayList;

public class OneCallWeather {
    private float lat;
    private float lon;
    private String timezone;
    private float timezone_offset;
    Current CurrentObject;
    ArrayList<Minutely> minutely = new ArrayList<>();
    ArrayList<Hourly> hourly = new ArrayList<>();
    ArrayList<Daily> daily = new ArrayList<>();
    ArrayList<Alerts> alerts = new ArrayList<>();

    public ArrayList<Minutely> getMinutely() {
        return minutely;
    }

    public void setMinutely(ArrayList<Minutely> minutely) {
        this.minutely = minutely;
    }

    public ArrayList<Hourly> getHourly() {
        return hourly;
    }

    public void setHourly(ArrayList<Hourly> hourly) {
        this.hourly = hourly;
    }

    public ArrayList<Daily> getDaily() {
        return daily;
    }

    public void setDaily(ArrayList<Daily> daily) {
        this.daily = daily;
    }

    public ArrayList<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(ArrayList<Alerts> alerts) {
        this.alerts = alerts;
    }
// Getter Methods

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public float getTimezone_offset() {
        return timezone_offset;
    }

    public Current getCurrent() {
        return CurrentObject;
    }

    // Setter Methods

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setTimezone_offset(float timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    public void setCurrent(Current currentObject) {
        this.CurrentObject = currentObject;
    }
}
