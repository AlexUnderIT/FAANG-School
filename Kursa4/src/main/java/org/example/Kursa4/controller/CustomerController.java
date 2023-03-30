package org.example.Kursa4.controller;

import org.example.Kursa4.database.entity.Customer;
import org.example.Kursa4.database.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping ("showCustomer")
    public ModelAndView showCustomer(Model model){

        List<Customer> customers = (List<Customer>) this.customerRepository.findAll();
        Map<String,Object> params = new HashMap<>();
        params.put("customers", customers);
        return new ModelAndView("showCustomer", params);
    }

    @PostMapping("/postCustomer")
    public String createCustomer(@RequestParam("surname") String surname,
                                 @RequestParam("name") String name,
                                 @RequestParam("phone") String phone,
                                 @RequestParam("email") String email,
                                 @RequestParam("car") String car,
                                 @RequestParam("registration_number") String registration_number
    ){
        Customer customer = new Customer();
        customer.setSurname(surname);
        customer.setName(name);
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setCar(car);
        customer.setRegistration_number(registration_number);
        customerRepository.save(customer);
        return "get";
    }
}