package com.grocery.net.grocery.model;

public class Location {

    private double longitude;
    private double lattitude;

    public Location(double longitude, double lattitude) {
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", lattitude=" + lattitude +
                '}';
    }
}
