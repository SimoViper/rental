package com.microservice.rental.repository;

import com.microservice.rental.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    //@Query("select c from Customer c where c.email = :email")
    List<Customer> findByEmail(/*@Param(value = "email")*/ String email);
}

