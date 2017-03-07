package com.microservice.rental.converter;


import com.microservice.rental.dto.AddressDTO;
import com.microservice.rental.dto.CustomerDetails;
import com.microservice.rental.model.Customer;

import java.util.List;

public class CustomerConverter {


    public static CustomerDetails convertCustomerToDTO(List<Customer> customers){

        CustomerDetails result = null;

        if(customers != null && !customers.isEmpty()){

            Customer customer = customers.get(0);

            AddressDTO address = new AddressDTO(customer.getAddress().getAddress(), customer.getAddress().getAddress2(), customer.getAddress().getDistrict(), customer.getAddress().getCity().getCity(),
                    customer.getAddress().getCity().getCountry().getCountry(), customer.getAddress().getPostalCode(), customer.getAddress().getPhone());

            result = new CustomerDetails(customer.getFirstName(), customer.getLastName(), customer.getEmail(), address);
        }

        return result;
    }
}
