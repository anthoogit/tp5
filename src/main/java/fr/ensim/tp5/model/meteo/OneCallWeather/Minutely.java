package fr.ensim.tp5.model.meteo.OneCallWeather;

public class Minutely {
    private float dt;
    private float precipitation;


    // Getter Methods

    public float getDt() {
        return dt;
    }

    public float getPrecipitation() {
        return precipitation;
    }

    // Setter Methods

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setPrecipitation(float precipitation) {
        this.precipitation = precipitation;
    }
}