package com.wilfred.customerservice.customerservice.controllers;

import com.wilfred.customerservice.customerservice.entities.Customer;
import com.wilfred.customerservice.customerservice.payloads.DepartmentCustomer;
import com.wilfred.customerservice.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCustomer")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> getList() {
        return customerService.getList();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @GetMapping("/getCustomerDepartment/{id}")
    public DepartmentCustomer getCustomerDepartment(@PathVariable Long id) {
        return customerService.getCustomerDepartment(id);
    }


}
