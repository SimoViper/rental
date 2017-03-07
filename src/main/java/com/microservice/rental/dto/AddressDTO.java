package com.microservice.rental.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

public class AddressDTO {

    private String address;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String address2;

    private String district;

    private String city;

    private String country;

    private String postalCode;

    private String phone;


    public AddressDTO() {
    }

    public AddressDTO(String address, String address2, String district, String city, String country, String postalCode, String phone) {
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.phone = phone;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
