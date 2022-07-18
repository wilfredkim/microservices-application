package com.wilfred.customerservice.customerservice.services;

import com.wilfred.customerservice.customerservice.entities.Customer;
import com.wilfred.customerservice.customerservice.payloads.DepartmentCustomer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> getList();

    Customer findById(Long customerId);

    DepartmentCustomer getCustomerDepartment(Long customerId);
}
