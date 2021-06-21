package com.avszoom.io.microservicesactuator.service;

import com.avszoom.io.microservicesactuator.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    Department save(Department department);

    List<Department> getAllDepartments();

    Department getDepartment(Long id);
}
