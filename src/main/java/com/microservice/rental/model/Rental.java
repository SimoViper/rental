package com.microservice.rental.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "rental_id")
    private long rentalId;

    @Column(name = "rental_date")
    private Date rentalDate;

    @Column(name = "return_date")
    private Date returnDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;


    public long getRentalId() {
        return rentalId;
    }

    public void setRentalId(long rentalId) {
        this.rentalId = rentalId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
