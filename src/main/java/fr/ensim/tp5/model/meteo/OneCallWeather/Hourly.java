package fr.ensim.tp5.model.meteo.OneCallWeather;

import fr.ensim.tp5.model.meteo.Weather;

import java.util.ArrayList;

public class Hourly {
    private float dt;
    private float temp;
    private float feels_like;
    private float pressure;
    private float humidity;
    private float dew_point;
    private float uvi;
    private float clouds;
    private float visibility;
    private float wind_speed;
    private float wind_deg;
    ArrayList<Weather> weather = new ArrayList<>();
    private float pop;


    // Getter Methods


    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public float getDt() {
        return dt;
    }

    public float getTemp() {
        return temp;
    }

    public float getFeels_like() {
        return feels_like;
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

    public float getUvi() {
        return uvi;
    }

    public float getClouds() {
        return clouds;
    }

    public float getVisibility() {
        return visibility;
    }

    public float getWind_speed() {
        return wind_speed;
    }

    public float getWind_deg() {
        return wind_deg;
    }

    public float getPop() {
        return pop;
    }

    // Setter Methods

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setFeels_like(float feels_like) {
        this.feels_like = feels_like;
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

    public void setUvi(float uvi) {
        this.uvi = uvi;
    }

    public void setClouds(float clouds) {
        this.clouds = clouds;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public void setWind_speed(float wind_speed) {
        this.wind_speed = wind_speed;
    }

    public void setWind_deg(float wind_deg) {
        this.wind_deg = wind_deg;
    }

    public void setPop(float pop) {
        this.pop = pop;
    }
}