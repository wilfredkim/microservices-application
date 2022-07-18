package com.wilfred.customerservice.customerservice.repositories;

import com.wilfred.customerservice.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
