package com.citycart.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by otm on 29/10/16.
 */
public class Retailer implements Serializable {

    private String id;
    private String name;
    private Address address;
    private LocalDateTime creationDate;

    public Retailer() {
    }

    public Retailer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Retailer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
