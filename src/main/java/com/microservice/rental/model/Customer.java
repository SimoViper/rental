package com.microservice.rental.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private boolean active;

    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="customer")
    private List<Rental> rentals;


    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }
}
