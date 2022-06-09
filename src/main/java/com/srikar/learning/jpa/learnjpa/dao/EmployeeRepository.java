package com.srikar.learning.jpa.learnjpa.dao;

import com.srikar.learning.jpa.learnjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
