package com.microservice.rental.service;


import com.microservice.rental.dto.CustomerDetails;

public interface CustomerService {

    CustomerDetails getCustomer(String email);

}
