package com.grocery.net.grocery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Shop_Info")
public class Shop_Info {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long shop_id;

    private String shop_name;
    private Location shop_location;
    private String shop_contactNumber;
    private String shop_address;
    private double distance;

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public Location getShop_location() {
        return shop_location;
    }

    public void setShop_location(Location shop_location) {
        this.shop_location = shop_location;
    }

    public String getShop_contactNumber() {
        return shop_contactNumber;
    }

    public void setShop_contactNumber(String shop_contactNumber) {
        this.shop_contactNumber = shop_contactNumber;
    }

    public String getShop_address() {
        return shop_address;
    }

    public void setShop_address(String shop_address) {
        this.shop_address = shop_address;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

}
