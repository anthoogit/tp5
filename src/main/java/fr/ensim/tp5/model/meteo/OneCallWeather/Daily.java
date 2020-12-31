package fr.ensim.tp5.model.meteo.OneCallWeather;

import fr.ensim.tp5.model.meteo.Weather;

import java.util.ArrayList;

public class Daily {
    private float dt;
    private float sunrise;
    private float sunset;
    Temp TempObject;
    Feels_like Feels_likeObject;
    private float pressure;
    private float humidity;
    private float dew_point;
    private float wind_speed;
    private float wind_deg;
    ArrayList<Weather> weather = new ArrayList<>();
    private float clouds;
    private float pop;
    private float rain;
    private float uvi;


    // Getter Methods

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public float getDt() {
        return dt;
    }

    public float getSunrise() {
        return sunrise;
    }

    public float getSunset() {
        return sunset;
    }

    public Temp getTemp() {
        return TempObject;
    }

    public Feels_like getFeels_like() {
        return Feels_likeObject;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getDew_point() {
        return dew_point;
    }

    public float getWind_speed() {
        return wind_speed;
    }

    public float getWind_deg() {
        return wind_deg;
    }

    public float getClouds() {
        return clouds;
    }

    public float getPop() {
        return pop;
    }

    public float getRain() {
        return rain;
    }

    public float getUvi() {
        return uvi;
    }

    // Setter Methods

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setSunrise(float sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(float sunset) {
        this.sunset = sunset;
    }

    public void setTemp(Temp tempObject) {
        this.TempObject = tempObject;
    }

    public void setFeels_like(Feels_like feels_likeObject) {
        this.Feels_likeObject = feels_likeObject;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setDew_point(float dew_point) {
        this.dew_point = dew_point;
    }

    public void setWind_speed(float wind_speed) {
        this.wind_speed = wind_speed;
    }

    public void setWind_deg(float wind_deg) {
        this.wind_deg = wind_deg;
    }

    public void setClouds(float clouds) {
        this.clouds = clouds;
    }

    public void setPop(float pop) {
        this.pop = pop;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }

    public void setUvi(float uvi) {
        this.uvi = uvi;
    }
}

