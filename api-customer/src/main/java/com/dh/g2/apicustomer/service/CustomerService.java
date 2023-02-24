package com.dh.g2.apicustomer.service;

import com.dh.g2.apicustomer.entity.Customer;
import com.dh.g2.apicustomer.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {

        return customerRepository.save(customer);

    }

    @Override
    public Customer find(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }
}
