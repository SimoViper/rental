package com.microservice.rental.model;

import javax.persistence.*;

@Entity
public class Address {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "address_id")
    private long addressId;

    private String address;

    private String address2;

    private String district;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    @Column(name="postal_code")
    private String postalCode;

    private String phone;


    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
