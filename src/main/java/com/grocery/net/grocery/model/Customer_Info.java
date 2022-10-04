package com.grocery.net.grocery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Customer_Info")
public class Customer_Info {

    @Id
    private String customer_contactNumber;
    private String customer_name;
    private String customer_emailId;
    private Date customer_DOB;
    private String customer_address;
    private Location customer_location;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_contactNumber() {
        return customer_contactNumber;
    }

    public void setCustomer_contactNumber(String customer_contactNumber) {
        this.customer_contactNumber = customer_contactNumber;
    }

    public String getCustomer_emailId() {
        return customer_emailId;
    }

    public void setCustomer_emailId(String customer_emailId) {
        this.customer_emailId = customer_emailId;
    }

    public Date getCustomer_DOB() {
        return customer_DOB;
    }

    public void setCustomer_DOB(Date customer_DOB) {
        this.customer_DOB = customer_DOB;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public Location getCustomer_location() {
        return customer_location;
    }

    public void setCustomer_location(Location customer_location) {
        this.customer_location = customer_location;
    }


}
