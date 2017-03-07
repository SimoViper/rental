package com.microservice.rental.service;

import com.microservice.rental.converter.CustomerConverter;
import com.microservice.rental.dto.CustomerDetails;
import com.microservice.rental.model.Customer;
import com.microservice.rental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository rentalRepository;

    @Override
    public CustomerDetails getCustomer(String email) {
        List<Customer> customers = rentalRepository.findByEmail(email);
        return CustomerConverter.convertCustomerToDTO(customers);
    }



}
