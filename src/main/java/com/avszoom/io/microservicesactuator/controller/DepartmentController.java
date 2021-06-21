package com.avszoom.io.microservicesactuator.controller;

import com.avszoom.io.microservicesactuator.entity.Department;
import com.avszoom.io.microservicesactuator.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    /*
    * Request Body annotation tells spring boot that convert json object to entity object. Spring does for us.
    * */
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.save(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable("id") Long id){
        return departmentService.getDepartment(id);
    }


}
