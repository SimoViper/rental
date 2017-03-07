package com.microservice.rental.model;

import javax.persistence.*;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "city_id")
    private long cityId;

    private String city;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;


    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
