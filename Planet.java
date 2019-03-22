package com.example.adapter;

import java.io.Serializable;

public class Planet implements Serializable {

    private String name;
    private int Image;
    private String details;
    private String distance_sun;

    public Planet(String name, int image, String details, String distance_sun) {
        this.name = name;
        Image = image;
        this.details = details;
        this.distance_sun = distance_sun;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return Image;
    }

    public String getDetails() {
        return details;
    }

    public String getDistance_sun() {
        return distance_sun;
    }
}
