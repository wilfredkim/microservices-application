package com.wilfred.customerservice.customerservice.services;

import com.wilfred.customerservice.customerservice.entities.Customer;
import com.wilfred.customerservice.customerservice.payloads.Department;
import com.wilfred.customerservice.customerservice.payloads.DepartmentCustomer;
import com.wilfred.customerservice.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public List<Customer> getList() {
        return repository.findAll();
    }

    @Override
    public Customer findById(Long customerId) {
        Optional<Customer> optionalCustomer = repository.findById(customerId);
        return optionalCustomer.orElse(null);
    }

    @Override
    public DepartmentCustomer getCustomerDepartment(Long customerId) {
        DepartmentCustomer departmentCustomer = new DepartmentCustomer();
        Customer customer = this.findById(customerId);
        if (customer != null) {
            departmentCustomer.setCustomer(customer);
            Department department = restTemplate.getForObject("http://DEPARTMENT_SERVICE/vi/departments/" + customer.getDepartmentId(), Department.class);
            departmentCustomer.setDepartment(department);
        }
        return departmentCustomer;
    }
}
