package com.dh.g2.apicustomer.service;

import com.dh.g2.apicustomer.entity.Customer;

import java.util.List;

public interface ICustomerService {

    Customer save(Customer customer);
    Customer find(Long id);
    void delete(Long id) ;
    Customer update(Customer customer);

}
