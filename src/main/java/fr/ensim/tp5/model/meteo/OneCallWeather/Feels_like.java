package fr.ensim.tp5.model.meteo.OneCallWeather;

public class Feels_like {
    private float day;
    private float night;
    private float eve;
    private float morn;


    // Getter Methods

    public float getDay() {
        return day;
    }

    public float getNight() {
        return night;
    }

    public float getEve() {
        return eve;
    }

    public float getMorn() {
        return morn;
    }

    // Setter Methods

    public void setDay(float day) {
        this.day = day;
    }

    public void setNight(float night) {
        this.night = night;
    }

    public void setEve(float eve) {
        this.eve = eve;
    }

    public void setMorn(float morn) {
        this.morn = morn;
    }
}
