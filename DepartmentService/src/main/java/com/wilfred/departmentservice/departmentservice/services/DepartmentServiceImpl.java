package com.wilfred.departmentservice.departmentservice.services;

import com.wilfred.departmentservice.departmentservice.entities.Department;
import com.wilfred.departmentservice.departmentservice.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department save(Department department) {
        return repository.save(department);
    }

    @Override
    public Department findById(Long departmentId) {
        Optional<Department> optionalDepartment = repository.findById(departmentId);
        return optionalDepartment.orElse(null);
    }
}
