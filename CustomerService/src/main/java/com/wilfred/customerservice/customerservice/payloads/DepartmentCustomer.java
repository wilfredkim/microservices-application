package com.wilfred.customerservice.customerservice.payloads;

import com.wilfred.customerservice.customerservice.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentCustomer {
    private Department department;
    private Customer customer;
}
