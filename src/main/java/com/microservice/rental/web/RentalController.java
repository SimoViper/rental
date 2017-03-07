package com.microservice.rental.web;

import com.microservice.rental.dto.CustomerDetails;
import com.microservice.rental.model.Customer;
import com.microservice.rental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental")
public class RentalController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET, value = "/customer-details/{email:.+}")
    public @ResponseBody CustomerDetails getCustomerDetails(@PathVariable("email") String email){
        CustomerDetails customerDetails = null;
        try{
            customerDetails = customerService.getCustomer(email);
        }catch(Exception e){
            e.printStackTrace();
        }
        return customerDetails;
    }
}
