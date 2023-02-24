package com.dh.g2.apicustomer.controller;

import com.dh.g2.apicustomer.entity.Customer;
import com.dh.g2.apicustomer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> guardar(@RequestBody Customer customer) {

        return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);

    }
}
