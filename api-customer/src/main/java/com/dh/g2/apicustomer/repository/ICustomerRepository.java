package com.dh.g2.apicustomer.repository;

import com.dh.g2.apicustomer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
