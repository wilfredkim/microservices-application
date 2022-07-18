package com.wilfred.departmentservice.departmentservice.services;

import com.wilfred.departmentservice.departmentservice.entities.Department;

public interface DepartmentService {
    Department save(Department department);

    Department findById(Long departmentId);
}
