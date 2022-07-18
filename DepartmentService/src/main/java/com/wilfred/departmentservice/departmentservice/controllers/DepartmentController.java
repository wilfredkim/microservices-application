package com.wilfred.departmentservice.departmentservice.controllers;

import com.wilfred.departmentservice.departmentservice.entities.Department;
import com.wilfred.departmentservice.departmentservice.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vi/departments")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/createDepartment")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentService.findById(id);
    }
}
