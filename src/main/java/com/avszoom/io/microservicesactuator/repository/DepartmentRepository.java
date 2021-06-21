package com.avszoom.io.microservicesactuator.repository;

import com.avszoom.io.microservicesactuator.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
*  JPA is a protocol for ORMS that define what all interfaces ORMS should implement for easy access to database for developers. Hibernate
* and spring jpa are some of the implementations. By extending crudrepository we get lot of important methods. At runtime spring see
* repository annotation and provides runtime implementation for all interfaces that are defined.
* */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
