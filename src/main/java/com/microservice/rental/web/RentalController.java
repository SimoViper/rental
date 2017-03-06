package com.microservice.rental.web;

import com.microservice.rental.dto.CustomerDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental")
public class RentalController {

    @RequestMapping(method = RequestMethod.GET, value = "/customer-details/{email}")
    public @ResponseBody CustomerDetails getCustomerDetails(@PathVariable("email") String email){
        return new CustomerDetails("Pinco", "Pallo", "pinco.pallo@email.com");
    }
}
