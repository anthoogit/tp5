package fr.ensim.tp5.model.geo;

import fr.ensim.tp5.model.geo.Feature;

import java.util.ArrayList;

public class AdresseGeo {
    private String type;
    private String version;
    ArrayList<Feature> features = new ArrayList<>();
    private String attribution;
    private String licence;
    private String query;
    private float limit;


    // Getter Methods

    public Feature getFeature(int index) {
        return features.get(index);
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public String getAttribution() {
        return attribution;
    }

    public String getLicence() {
        return licence;
    }

    public String getQuery() {
        return query;
    }

    public float getLimit() {
        return limit;
    }

    // Setter Methods

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
}