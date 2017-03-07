package com.microservice.rental.model;

import javax.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "country_id")
    private long countryId;

    private String country;


    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
