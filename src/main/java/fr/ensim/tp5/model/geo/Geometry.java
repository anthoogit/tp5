package fr.ensim.tp5.model.geo;

import java.util.ArrayList;

public class Geometry {
    private String type;

    ArrayList<Float> coordinates = new ArrayList<>();

    // Getter Methods

    public String getType() {
        return type;
    }

    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }

    // Setter Methods

    public void setType(String type) {
        this.type = type;
    }

    public void setCoordinates(ArrayList<Float> coordinates) {
        this.coordinates = coordinates;
    }
}